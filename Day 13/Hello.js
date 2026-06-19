import React from 'react'

export const Hello = () => {
    function handleClick(){
        document.getElementById("res").textContent = "hello";
    }
  return (
    <div>
        <button onClick={handleClick}>Click Me</button>
        <p id = "res"></p>
    </div>
  )
}
