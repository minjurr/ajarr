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
			async: true, //true:�񵿱�, false:����
			type: "get", //get, post
			url:"http://localhost:8181/ajax/receive", //��û������ �ּ�
//			data: {"id": id} //��û�������� ���� ����(�������� ������ ��������)
			dataType: "text", //��û���������� �޴� ���� ������ Ÿ��
			success: function(data) { //��û���� �������� �޴� ��
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