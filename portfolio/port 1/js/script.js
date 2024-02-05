//photo changing effect
document.addEventListener('DOMContentLoaded', function () {
    function changeProfilePhoto() {
      const imageUrls = [
        'photos/1000048797.jpg',
        'photos/1000049876.jpg',
        'photos/IMG_4883-01.jpeg',
        'photos/IMG_5383.jpg',
        'photos/IMG_20230322_215235_957.jpg',
        'photos/IMG_20230428_054505.jpg',
        'photos/IMG_20230409_210345_837.jpg',
        'photos/IMG_20230428_055022 (1).jpg',
        'photos/LRM_EXPORT_267693422041461_20191008_102445453-01.jpeg'
      ];

      const profileImage = document.querySelector('img');
      const randomImageUrl = imageUrls[Math.floor(Math.random() * imageUrls.length)];
      profileImage.src = randomImageUrl;
    }

    // Call the function initially
    changeProfilePhoto();

    // Call the function every 1000 milliseconds (1 second)
    setInterval(changeProfilePhoto, 5000);
  });

  //card button use to describe cards
  document.getElementById("view1").onclick = function () {
    const skill = document.getElementById("skill").innerHTML;
    const skill1 = document.getElementById("skill1").innerHTML;
    document.getElementById("display").innerHTML =skill1 + "<br>"+"<br>These are the key skills of mine for development purpose.there are other skills are also there like -<br><b> Angular, git, node, java-spring-boot, nativeJS</b> " + "<br><br><h5>Additiona skills</h5>"+"MS Office, Communication, adaptability, flexibility ";
    document.getElementById("display1").innerHTML = skill;
  }
  document.getElementById("view2").onclick = function () {
    const project = document.getElementById("project").innerHTML;
    const project1 = document.getElementById("project1").innerHTML;
    document.getElementById("display").innerHTML = project1 +"<br>"+ "<br><h5>Certificate Generator : </h5>"+"It is a simple organization oriented project that have 3 module as a student, teacher, and admin. There are various operations are there according for a University. It provides a marksheet in pdf format that student can download his/her every semester marksheet." + "<br><h5>Quiz Test:</h5>" + "This is a quiz test application it simply developed using react. It is a simple question answer app that have multiple question and options. After done the test your result will popup infront of you after submit your test.";
    document.getElementById("display1").innerHTML = project;
  }
  document.getElementById("view3").onclick = function () {
    const experience = document.getElementById("experience").innerHTML;
    const experience1 = document.getElementById("experience1").innerHTML;
    document.getElementById("display").innerHTML = experience1 + "<br>As a fresher I can make myself compactable with every situation and every environment to improve my skills and looking for a Organization where i can put my knowledge and effort for best outcomes";
    document.getElementById("display1").innerHTML = experience;
  }

//card heading animation
//skill
const heading1 = document.querySelector('#skill');
heading1.innerHTML = heading1.textContent.replace(/\S/g,"<span>$&</span>");

const element1 = document.querySelectorAll('span');
for(let i=0;i<element1.length;i++){
    element1[i].style.animationDelay = i + 's';
}
//project
const heading2 = document.querySelector('#project');
heading2.innerHTML = heading2.textContent.replace(/\S/g,"<span>$&</span>");

const element2 = document.querySelectorAll('span');
for(let i=0;i<element2.length;i++){
    element2[i].style.animationDelay = i + 's';
}

//experience
const heading3 = document.querySelector('#experience');
heading3.innerHTML = heading3.textContent.replace(/\S/g,"<span>$&</span>");

const element3 = document.querySelectorAll('span');
for(let i=0;i<element3.length;i++){
    element3[i].style.animationDelay = i + 's';
}

//description
const desc1 = document.querySelector('#desc');
desc1.innerHTML = desc1.textContent.replace(/\S/g,"<span>$&</span>");

const element4 = document.querySelectorAll('span');
for(let i=0;i<element4.length;i++){
    element4[i].style.animationDelay = i + 's';
}
