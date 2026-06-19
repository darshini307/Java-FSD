import React,{useState} from 'react'

export const CounterClock2 = () => {
    const [count,setCount] = useState(0);
  return (
    <div style={{textAlign:"center",marginTop:"50px"}}>
        <h1>Counter Clock with Arrow Function</h1>
        <h2>{count}</h2>
        <button onClick={()=>setCount(count+1)}>Increase</button>
        <button onClick={()=>setCount(count-1)}>Decrease</button>
        <button onClick={()=>setCount(0)}>Reset</button>
    </div>
  )
}
