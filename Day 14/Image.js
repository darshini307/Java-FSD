import React,{useState,useEffect} from 'react'

export const Image = () => {
    const [image,disImage] = useState('image.jpg');
    useEffect(()=>{
        const timer = setInterval(()=>{
            disImage(image=>
                image==="https://tinyurl.com/4u882cye"?"https://tinyurl.com/22j73h6z":"https://tinyurl.com/4u882cye"
            )
        },2000);
        return ()=> clearInterval(timer);
    })

  return (
    <div>
        <h1>Dogs</h1>
        <img src={image}/>
    </div>
  )
}
