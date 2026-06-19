import React,{useState,useEffect} from 'react'

export const UseEffectHook = () => {
    const [message,setMessage] = useState("Loading");
    useEffect(()=>{
        const timer = setTimeout(()=>{
            setMessage("Hello, this is useEffect in action!");
        },2000)
        return ()=>clearTimeout(timer);
    },[])
  return (
    <div style={{textAlign:"center"}}>
        <h1>{message}</h1>
    </div>
  )
}
