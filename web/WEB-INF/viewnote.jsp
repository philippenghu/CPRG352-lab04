


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View note</title>
    </head>
    
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
       
        <div>Title:</div>
        <span>${note.title}</span>
        <br>
         <br>
        <div>Contents:</div>
          <span>${note.content}</span>
      <br>
        <br>
          <a href="note?edit">Edit</a>    
    </body>
</html>
