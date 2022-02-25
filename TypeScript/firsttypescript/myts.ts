const button = document.querySelector("button");
const input1 = document.getElementById("num1")! as HTMLInputElement;
const input2 = document.getElementById("num2")! as HTMLInputElement;

function add(number1: number, number2: number) {
    return number1 + number2;
}

button.addEventListener("click", function() {
    console.log(add(+input1.value, +input2.value));
});