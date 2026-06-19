import React, { useState } from 'react'

export const OnChangeEvent = () => {
    const [msg,setMsg] = useState("");
    const handleChange=(e)=>{
        setMsg(e.target.value);
    }
  return (
    <div style={{textAlign:"center"}}>
        <input type="text"
        onChange={handleChange}  />
        <h1>{msg}</h1>

    </div>
  )
}
