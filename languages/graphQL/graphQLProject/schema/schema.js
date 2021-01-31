const graphql = require('graphql');
const { GraphQLObjectType, GraphQLString, GraphQLInt, GraphQLSchema } = graphql;

const users = [{
    id: '23', firstName: 'Bill', age: 20
}, {
    id: '24', firstName: 'gate', age: 24
}]

const UserType = new GraphQLObjectType({
    name: 'User',
    fields: {
        id: {
            type: GraphQLString
        },
        firstName: {
            type: GraphQLString
        },
        age: { type: GraphQLInt }
    }
})

//If you are looking for a user and put an id, i will give you back a UserType
const RootQuery = new GraphQLObjectType({
    name: 'RootQueryType',
    fields: {
        user: {
            type: UserType,
            args: { id: { type: GraphQLString } },
            resolve(parentValue, args) {
                //This is where you get the data
                return users.find(user => user.id === args.id)

            }
        }
    }
});


module.exports = new GraphQLSchema({
    query: RootQuery
})