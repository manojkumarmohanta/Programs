var randomMsg = [
    "This is a sample sentence for typing test. This is a sample sentence for typing test.",
    "The quick brown fox jumps over the lazy dog.",
    "There are seven color and you can choose one of them",
    "Hello World!, this word popularly use in the programming language for print the demo program"

];
var dmsg = document.getElementById('dmsg');
var wmsg = document.getElementById('wmsg');
var  btn = document.querySelector("button");
let startTime,endTime;

const playGame = () =>{
    let  i = Math.floor(Math.random()*randomMsg.length);
    dmsg.innerHTML =randomMsg[i];
    wmsg.value= "";
    let date = new Date();
    startTime = date.getTime();
    btn.innerHTML = "Done";
};
const wordCounter = (str) => {
    let  count = str.split(" ").length;
    return count;
}
const checkIncorrect = (a,b) => {
    let count1 = a.split(" ");
    let count2 = b.split(" ");
    console.log(count1);
    console.log(count2);
    let cnt = 0;

    count1.forEach(function(item,index) {
        if(item == count2[index]){
            cnt++;
        }
        
    })

    let errorWords = (count1.length - cnt) ;
    return (cnt + " correct words out of " + count1.length + " words, Total number of error is " + errorWords + ".");
}
const endPlay = () => {
    let date = new Date();
    endTime = date.getTime();
    let totalTime = ((endTime - startTime)/1000);
    let totalStr = wmsg.value;
    let totalWord = wordCounter(totalStr);
    
    let speed = Math.round((totalWord/totalTime) * 60)
    let finalMsg = "you typed at  a speed of "+speed+" words per minute. ";
    finalMsg += checkIncorrect(dmsg.innerText, totalStr);
    dmsg.innerHTML = "<br/>"+finalMsg;
    wmsg.style.color = "green";
};
btn.addEventListener('click',function(){
    if(this.innerText == 'Start'){
        wmsg.style.color = "black";
        wmsg.disabled = false;
        playGame();
        
    }else if(this.innerText == 'Done'){
        wmsg.disabled = true;
        btn.innerHTML = "Start";
        if(wmsg.value == ""){
            wmsg.style.color = "red";
            wmsg.value = "you need to write thr above content.";
        }else{
        endPlay();
        }

    }else{
        dmsg.innerText = "Something went wrong !!..."
    }
});