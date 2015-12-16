<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
チーム数：${inputNameDto.team}<br>
人数：${inputNameDto.number}<br>
名前入力画面<br>
<s:form method="POST" action="/complete/complete/">

名前：
<html:text property="inputNameData" />


<s:submit property="complete" value="結果発表" />
</s:form>
</body>
</html>