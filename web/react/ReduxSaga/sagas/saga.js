import { takeEvery, takeLatest, take, call, fork, put } from 'redux-saga/effects';
import * as actions from '../actions/user';
import * as api from 'api/users';


function* getUsers() {
    try {
        const result = yield call(api.getUsers);
        yield put(action.getUsersSuccess({ items: result.data.data }))
    } catch (e) {

    }
}


function* watchGetUsersRequest() {
    yield takeEvery(actions.Types.GET_USERS_REQUEST, getUsers);
}

function* watchDeleteUsersRequest() {
    while (true) {
        const action = yield take(actions.Types.DELETE_USERS_REQUEST);
        yield call(deleteUser, {
            userId: action.payload.userId
        })
    }
}

function* createUsers(action) {
    try {
        yield call(api.createUsers, { firstName: action.payload.firstName });
        yield call(getUsers)
    } catch (e) {

    }
}

function* deleteUsers({ userId }) {
    try {
        yield call(api.deleteUser, { userId });
        yield call(getUsers)
    } catch (e) {
        yield put(action.usersError({
            error: 'An error occured'
        }))
    }
}


function* watchCreateUsersRequest() {
    yield takeLatest(actions.Types.CREATE_USERS_REQUEST, createUser);
}

const usersSagas = [
    fork(watchGetUsersRequest),
    fork(watchCreateUsersRequest)
];

export default usersSagas;