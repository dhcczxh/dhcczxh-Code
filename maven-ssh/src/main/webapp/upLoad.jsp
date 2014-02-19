<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>上传文件</title>
</head>
<body>
<h1>上传</h1>  
<!--   enctype(编码格式)必须为multipart/form-data  -->  
        <form method="post" action="formUpload" enctype="multipart/form-data">  
        
           文件：   <input type="file" name="file"/>  
            <input type="submit"/>  
        </form>  
</body>
</html>