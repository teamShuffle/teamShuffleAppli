<tiles:insert page="/WEB-INF/view/common/header.jsp"  /><html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dolteng Auto Generated</title>
</head>
<body>
チーム数：${inputNameDto.team}<br><br>
全体の人数：${inputNameDto.number}<br><br>
<div Align="center">
<p><font size="5" color="#00ff00">結果発表</font></p>

チーム名：${completeDto.completeList[0][0]}<br><br>
<c:forEach var="inputNameList" items="${completeDto.completeList[0]}" varStatus="status" >
名前：${inputNameList}<br><br>
</c:forEach>
<HR color="blue">

チーム名：${completeDto.completeList[1][0]}<br><br>
<c:forEach var="inputNameList" items="${completeDto.completeList[1]}" varStatus="status" >
名前：${inputNameList}<br><br>
</c:forEach>
<HR color="blue">

<c:if test="${fn:length(completeDto.completeList[2]) > 0}" >
チーム名：${completeDto.completeList[2][0]}<br><br>
<c:forEach var="inputNameList" items="${completeDto.completeList[2]}" varStatus="status" >
名前：${inputNameList}<br><br>
</c:forEach>
<HR color="blue">
</c:if>

<c:if test="${fn:length(completeDto.completeList[3]) > 0}" >
チーム名：${completeDto.completeList[3][0]}<br><br>
<c:forEach var="inputNameList" items="${completeDto.completeList[3]}" varStatus="status" >
名前：${inputNameList}<br><br>
</c:forEach>
<HR color="blue">
</c:if>

<c:if test="${fn:length(completeDto.completeList[4]) > 0}" >
チーム名：${completeDto.completeList[4][0]}<br><br>
<c:forEach var="inputNameList" items="${completeDto.completeList[4]}" varStatus="status" >
名前：${inputNameList}<br><br>
</c:forEach>
</c:if>
</div>


<s:form method="POST" action="/index">

<div Align="center">
<s:submit value="トップへ戻る" />
</div>
</s:form>
</body>
</html>
