<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript">
$(function() {
	$('#btn').click(function() {
		$.ajax({
			async: true, //true:비동기, false:동기
			type: "get", //get, post
			url:"http://localhost:8181/ajax/receive", //요청페이지 주소
//			data: {"id": id} //요청페이지에 보낼 값들(보낼값이 없으면 생략가능)
			dataType: "text", //요청페이지에서 받는 값의 데이터 타입
			success: function(data) { //요청값이 들어왔을때 받는 곳
				alert(data);	
			}
		});

	});
	
});



</script>
</head>
<body>
<input id="btn" type="button" value="send">
</body>
</html>