<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
チーム数・人数入力画面<br><br>
<s:form method="POST" action="/inputName/inputName/">


チーム数：
<html:text property="team" /><br><br>

人数：
<html:text property="number" /><br><br>


<s:submit property="inputName" value="名前入力画面へ" />
</s:form>
</body>
</html>