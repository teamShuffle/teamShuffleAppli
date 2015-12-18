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


チーム数・人数入力画面<br><br>
<s:form method="POST" action="/inputName/inputName/">


チーム数：
<html:select property="team"  >
    <c:forEach var="teamList" items="${teamList}">
        <html:option value="${teamList}">${teamList}チーム</html:option>
    </c:forEach>
</html:select>
<br><br>

人数：
<html:select property="number"  >
    <c:forEach var="numberList" items="${numberList}">
        <html:option value="${numberList}">${numberList}人</html:option>
    </c:forEach>
</html:select>
<br><br>


<s:submit property="inputName" value="名前入力画面へ" />
</s:form>
</body>
</html>