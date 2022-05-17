import { Types } from './action';

const INITIAL_STATE = {
    items: [],
    error: ''
}


export default function users(state = INITIAL_STATE, action) {

    switch (action.type) {
        case Types.GET_USERS_REQUEST:
        case Types.GET_USERS_SUCCESS: return {
            ...state,
            items: action.payload.items
        }
        case Types.USER_ERROR: return {
            ...state, error: action.payload.error
        }
        default: {
            return state
        }


    }
}