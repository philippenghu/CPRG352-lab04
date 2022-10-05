<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form  method="POST" action="note">
        <div>
            <label>Title:</label>
        <input type="text" name="inputT" value="${note.title}">
        </div>
        <br>
        <br>
        
        <div>
            <label>Contents:</label>
           
            <textarea name="inputC">${note.content}</textarea>
        </div>
        <input type="submit" value="Save"> 
         </form>
        <br>
             
    </body>
</html>