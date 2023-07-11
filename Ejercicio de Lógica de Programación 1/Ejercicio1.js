let num1 = Number(8);
let num2 = Number(9);
let num3 = Number(4);


if (num1 === num2 && num2 === num3) {
  console.log("Los números son iguales.");
} else {

  let max = Math.max(num1, num2, num3);
  let min = Math.min(num1, num2, num3);
  let mid = num1 + num2 + num3 - max - min;

  
  console.log("Orden de mayor a menor:", max, mid, min);

  
  console.log("Orden de menor a mayor:", min, mid, max);
}

