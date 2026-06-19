import React from 'react'

export const Clock = () => {
    let n = 0;
    function Plus(){
        n = n+1;
        document.getElementById("counter").textContent= n;
    }
    function Minus(){
        n = n-1;
        document.getElementById("counter").textContent = n;
    }
  return (
    <div>
        <button onClick={Plus} >+</button>
        <button onClick={Minus} >-</button>
        <h3 id="counter">{n}</h3>
    </div>
  )
}
