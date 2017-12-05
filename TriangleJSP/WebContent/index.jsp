<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Triangles</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet" type="text/css" href="/TriangleJSP/resources/triangles.css">
<script type="text/javascript">
function validate_form ( )
{
        if ( document.triangles.fielda.value == null || document.triangles.fieldb.value == null || document.triangles.fieldc.value == null)        	
        {
                alert ( "Заполните все поля" );
                return false;
        }
        else return true;
}
</script>
</head>
<body>
<form name="triangles" action="AjaxController" method="post" class="form">
<img alt="logo" src="/TriangleJSP/img/logo.png" align = "right" class="image">
<span class="texts">A:</span><input name="fielda" class="field"><br>
<span class="texts">B:</span><input name="fieldb" class="field"><br>
<span class="texts">C:</span><input name="fieldc" class="field"><br>
<input type="submit" value="Ok" id="okbutton" class="button">
<br>

<br>
<span id="result" class="result">${result}</span>
</form>
</body>
</html>