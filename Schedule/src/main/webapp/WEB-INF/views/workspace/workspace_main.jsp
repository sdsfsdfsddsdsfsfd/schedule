<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>프로젝트 생성</title>
		<script>
			function send(f){
				let team_name = f.team_name.value;//유효성 체크 뭘해야하죠????
				let leader = f.leader.value;
			}
			
			function popup(){
				var popupWindow = window.open('popupcontent.jsp', 'popupwindow', 'width=600,height=400');
				
				//(경로, 팝업창명, 창 크기)
				//절대경로 : 파일/디렉토리의 전체 경로.(모든 경로). 위치를명확하게 지정함
				//상대경로 : 현재 작업 중인 디렉도리를 기준으로 경로를 나타냄.(상대적). 웹개발에서는 현재 웹 페이지 위치를 기준으로 접근함
					//현재 디렉토리 기준 상대경로 ; image/logo.png -> 현재 디렉토리 아래의 image폴더의 파일
					//상위 디렉토리 기준 : ../styles/main.css -> 현재 위치의 상위 디렉토리의 styles 폴더 내부 파일
				//Spring에서는 일반적으로 절대 경로 사용함.
				
				popupwindow.focus();
			}
		</script>
	</head>
	
		<body>
			<jsp:include page="ws_menu.jsp"/>
			<!-- 팀 생성될 때, 생성한 사람이 팀장인지/팀장을 지정할 수 있는지 -->
			<!-- 팀장이 프로젝트 생성해야 할 것 같습니다. -->
			<!-- 팀명 == 프로젝트명 -->
			<!-- 팀원 아이디 검색/입력해서 팀원추가 -->
			${ user.getId() }
			<form>
				<table>
					<tr>
						<td>팀명</td>
						<td><input name="team_name"></td>
					</tr>
					
					<tr>
						<td>팀장</td>
						<td><input name="leader"></td>
					</tr>
					
					<tr>
						<td>팀원</td>
						<td><input name="id"></td>
					</tr>
					
					
					<tr>
						<td>프로젝트 내용</td>
						<td><textarea cols="60" rows="5"></textarea></td>
					</tr>
					
					<tr>
						<td>사용 언어 및 스킬</td>
						<td><input name="project_skill"></td>
					</tr>
				</table>
				<input type="button" onclick="send(this.form);" value="등록하기">
				<input type="button" onclick="popup();" value="팝업창">
			</form>
		</body>
</html>