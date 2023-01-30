<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN FORM</title>

<style>   
Body {  
  font-family: Calibri, Helvetica, sans-serif;  
    
}  
button {   
       background-color: pink;   
       width: 50%;  
        color: black;   
        padding: 15px;   
        margin: 10px 0px;   
        border: dotted;   
        cursor: pointer;   
         }   
 form {   
        border: 3px solid #f1f1f1;   
    }   
 input[type=text], input[type=password] {   
        width: 80%;   
        margin: 8px 0;  
        padding: 10px 10px;   
        display: inline-block;   
        border: 2px blue;   
        box-sizing: border-box;   
    }  
 button:hover {   
        opacity: 0.7;   
    }   
  .cancelbtn {   
        width: 50%;   
        padding: 10px 18px;  
        margin: 10px 5px;  
    }   
        
     
 .container {   
        padding: 50px;   
        background-color: violet;  
    }   
</style>   
</head>    
<body>    
    <center> <h1> LOGIN FORM </h1> </center>   
    <form action="/login" method="post">  
        <div class="container">   
            <label>USERNAME: </label>   
            <input type="text" name="username" placeholder="Enter Name" required> <br> 
            <label>PASSWORD : </label>   
            <input type="password" name="password" placeholder="Enter Password" required>  
            
      <button type="submit">LOGIN</button>   
            
             
             </div>   
    </form>     
</body>     
</html>