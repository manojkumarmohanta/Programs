let btn = document.getElementById("btn");
    btn.addEventListener("click",BgChange);
    function BgChange(){
        let target = document.getElementById("display");
        target.innerHTML = "hello world";
        
    }