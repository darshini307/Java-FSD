import React from 'react'

export const Login = () => {
    let username = "Divya";
    let password = "divya@007";
    const handleClick= ()=>{
        let name = document.getElementById("userid").value;
        let pass = document.getElementById("passid").value;
        if(name===username && password===pass){
            alert("Login successful");
        }
        else{
            let msg = "Login failed ! \n";
            if(username!== name){
                msg+="username incorrect \n";
            }
            if(pass!==password){
                msg+="password incorrect";
            }
            alert(msg); 
        }

    }
  return (
    <div style={{textAlign:"center","marginTop":"50px",padding:"30px"}}>
        <h1>Login Page</h1>
        <label>Enter username</label>
        <input id="userid" placeholder='username' />
        <br /><br />
        <label>Enter Password</label>
        <input id="passid" placeholder='password' />
        <br /><br />
        <button onClick={handleClick} id="btn">Login</button>
        <br /><hr />
    </div>
  )
}
