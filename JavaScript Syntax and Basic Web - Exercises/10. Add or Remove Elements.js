function solution(args) {
    let array = [];
    for(let i = 0; i < args.length; i++) {
        let commandIndex = args[i].split(" ");
        let command = commandIndex[0];
        let indexNumber = Number(commandIndex[1]);
        if(command == "add")
        {
            array.push(indexNumber)
        } else if (command === "remove") {
            if (array[indexNumber] != undefined) {
            array.splice(indexNumber, 1)
            }
        }
    }
    for(let i = 0; i < array.length; i++)
    {
        console.log(array[i]);
    }
}