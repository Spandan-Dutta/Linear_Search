let ranks = [1, 5, 7, 8, 10, 7];

function findIndexOfElement(theArray, value) {
    return theArray.findIndex(rank => rank === value);
}

console.log(findIndexOfElement(ranks, 7));
