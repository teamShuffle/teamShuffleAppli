<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<tiles:insert page="/WEB-INF/view/common/header.jsp"  /><html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
<div Align="center">
<p><font size="5" color="#ff0000">${error}</font></p>
</div>

チーム数：${inputNameDto.team}<br>
人数：${inputNameDto.number}<br>

<div Align="center">
<p><font size="5" color="#00ff00">名前入力画面</font></p>
</div>

<s:form method="POST" action="/complete/complete/">
<c:forEach  var="listNumber" begin="1" end="${inputNameDto.number}" step="1">
<div Align="center">
名前：
<html:text property="inputNameList" value="${list[listNumber - 1]}" /><br><br>
</div>

</c:forEach>
<div Align="center">
<s:submit property="complete" value="結果発表" />
</div>
</s:form>
</body>
</html>