function addition(){
    let num1 = document.getElementById("input1").value;
    let num2 = document.getElementById("input2").value;
    let res = parseInt(num1)+parseInt(num2);
    if(num1 == "" || num2 == "" ){
        document.getElementById("output").value = "Enter two value";
    }else{
        document.getElementById("output").value = res;
    }
    

}
function clearall(){
    document.getElementById('input1').value = "";  //clear all the values of input field
    document.getElementById('input2').value = ""; 
    document.getElementById('output').value = ""; 
}
