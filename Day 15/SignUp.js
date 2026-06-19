import React ,{useState}from 'react'
import { BrowserRouter,Router,Link } from 'react-router-dom';
export const SignUp = () => {
    const [userName,setUserName] = useState("");
    const [phoneNo,setPhoneNo] = useState("");
    const [email,setEmail] = useState("");
    const [name,setName] = useState("")
    const [password,setPassword] = useState("");
    const [cnfrmPswrd,setCnfrmPswrd] = useState("");
    const [dob,setDob] = useState("");
    const [success,setSuccess] = useState(false);
    const  wrapperStyle ={
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',    
        minHeight: '100vh' ,   
        backgroundColor:"whitesmoke"
    }
    const containerStyle1={
        display: "grid",
        gridTemplateColumns: "1fr",     
        gap: "10px",
        padding: "10px",
        width: "350px",
        height: "auto",            
        textAlign: "center",
        backgroundColor: "white", 
        boxShadow: "0 4px 6px rgba(0,0,0,0.1)", 
        borderRadius: "8px"
        
    }
    const inputStyle={
        width:"90%",
        padding:"10px",
        border:"1 px solid black",
        borderRadius:"5px",
        outline:"none"
    }
    const buttonStyle={
        width:"96%",
        padding:"10px",
        backgroundColor :"darkblue",
        color:"white",
        fontSize:"14px",
        fontWeight:"bold",
        alignItems:"center",
        justifyContent:"center",
        borderRadius:"5px"
    }
    const handleName=(e)=>{
        setName(e.target.value);
    }
    const handlePhone=(e)=>{
        setPhoneNo(e.target.value);
    }
    const handleEmail=(e)=>{
        setEmail(e.target.value);
    }
    const handleUName=(e)=>{
        setUserName(e.target.value);
    }
    const handlePassword=(e)=>{
        setPassword(e.target.value);
    }
    const handleConfirm=(e)=>{
        setCnfrmPswrd(e.target.value);

    }
    const SignUpAcc=()=>{
        if(password===cnfrmPswrd){
            alert("Sign Up successful");
            setSuccess(true);
        }
        else{
            alert("Sign Up failed.Password not matched");
            setSuccess(false);
        }
    }
  return (
    <div style={wrapperStyle}>
            <form style={containerStyle1} onSubmit={SignUpAcc}>
                <h1>Sign Up</h1>
                <input type="text" style={inputStyle} placeholder='Enter your name' onChange={handleName} value={name} required/>
                <input type="number" style={inputStyle} placeholder='Enter your Phone Number (Optional)' onChange={handlePhone} value={phoneNo} />
                <input type="email" style={inputStyle} placeholder='Enter your Email id' onChange={handleEmail} value={email} required/>
                <input type="text" style={inputStyle} placeholder='Enter your User Name' onChange={handleUName} value={userName} required/>
                <input type="password" style={inputStyle} pattern="^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@#$%])[A-Za-z\d@#$%]{8,15}$" maxLength={15}  placeholder='Enter your Password' onChange={handlePassword} value={password} required/>
                <input type="password" style={inputStyle} placeholder='Confirm Password' onChange={handleConfirm} value={cnfrmPswrd} required/>
                <input type="date" style={inputStyle} placeholder='Date of Birth' onChange={(e)=>setDob(e.target.value)} value={dob} required/>
                <button id="btn" type="submit" style={buttonStyle}>Sign Up</button> 
            </form>
            {
                success && 
                <Link to="/login">
                    Go to Login
                </Link>
            }
    </div>
  )
}
