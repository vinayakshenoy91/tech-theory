//Degree fo spearation determines the complexity


const findMostCommonTitle = (myId, degreeOfSeparation) => {
    let queue = [myId];
    const seen = new Set(queue);
    const jobs = {};

    for (let i = 0; i <= degreeOfSeparation; i++) {
        const newQueue = [];

        while (queue.length) {
            const user = getUser(queue.shift());

            for (let j = 0; j < user.connections.length; j++) {
                const connection = user.connections[j];
                if (!seen.has(connection)) {
                    newQueue.push(connection);
                    seen.add(connection);
                }
            }

            jobs[user.title] = jobs[user.title] ? jobs[user.title] + 1 : 1;
        }
        queue = newQueue;
    }
}