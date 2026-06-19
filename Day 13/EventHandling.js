import React from 'react'
import { Hello } from './Hello';
export const EventHandling = () => {
    const n = 300;
     
    const handleClick=()=>{
        document.getElementById("result").innerText = "My events :"+n;
    }
    const handleWithStyle = ()=>{
        const msg = document.getElementById("res");
        msg.textContent = "good dog";
        msg.style.color = "red";
        
    }
    const handleClick1 = ()=>{
        const msg = document.getElementById("cat");
        msg.textContent = "I am not a good dog";
        
    }
    const changePic = ()=>{
        const image = document.getElementById("img");
        image.addEventListener("click",()=>{
            image.src = "dog2.jpg"
        })
    }
    return (
    <div>
        <h2>EventHandling</h2>
        <button onClick={handleClick}>Click Me 😊</button>
        <button onClick={handleWithStyle}>Know me</button>
        <h5 id="result"></h5>
        <h5 id="res">good dog</h5>
        <p id="cat" onClick={handleClick1}>I am a good cat</p>
        <img id = "img" src="Dog 1.jpg" width="300" height="300" onClick={changePic}/>
        <Hello />
    </div>
  );
}
