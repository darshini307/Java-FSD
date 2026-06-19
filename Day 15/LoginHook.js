import React,{useState} from 'react'

export const LoginHook = () => {
    const  wrapperStyle ={
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',    
        minHeight: '100vh'    
    
    }
    const containerStyle={
        display: "grid",
        gridTemplateColumns: "1fr",     
        gap: "10px",
        padding: "10px",
        width: "250px",
        height: "auto",            
        textAlign: "center",
        backgroundColor: "#ffffff", 
        boxShadow: "0 4px 6px rgba(0,0,0,0.1)", 
        borderRadius: "8px"
        
    }
    const [user,setUser] = useState("");
    const [pass,setpswd] = useState("");
    const [resultUser,setResultUser] = useState("");
    const [resultPswd,setResultPswd] = useState("");
    const myUser = "Divya";
    const myPswd = "DD@2007";
    const handleClick1 =()=>{
        setResultUser(user);
        setResultPswd(pass);
        if(user===myUser && myPswd===pass){
            alert("Login Successful");
        }
        else{
            alert("Login Failed");
        }
    }
  return (
    <div style ={wrapperStyle}>
        <div style={containerStyle}>
        <h1>Login Page using useState</h1>
        <label>Enter username</label>
        <input id="userid" placeholder='username' value={user} onChange={(e)=>setUser(e.target.value)}/>
        
        <label>Enter Password</label>
        <input id="passid" placeholder='password' value={pass} onChange={(e)=>setpswd(e.target.value)}/>
        
        <button onClick={handleClick1} id="btn">Login</button>
       
        <h4>Username :{resultUser}</h4>
        <h4>Password :{resultPswd}</h4>
    </div>
    <h4 />
    </div>
    
  )
}
