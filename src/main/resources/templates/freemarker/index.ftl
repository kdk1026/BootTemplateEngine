<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li>특징</li>
		<ul>
			<li>JSP보다 성능 우수</li>
			<li>JSP + JSTL 이상의 방대한 기능 지원</li>
			<li>Macro를 통해 layout 지원</li>
		</ul>
	</ul>
	
	<div class="output">
		<ul>
			<li>출력</li>
			${msg}
		</ul>		
	</div>
	
	<div class="loop">
		<ul>
			<li>리스트 Loop</li>
			<#list list as item>
				<p>
					id : ${item.id}<br/>
					name : ${item.name}
				</p>
			</#list>
		</ul>
	</div>
	
	<div class="include">
		<ul>
			<li>include</li>
			<#include "/freemarker/fragments/header.ftl">
			
			헤더와 푸터는 Include 했어요~
			
			<#include "/freemarker/fragments/footer.ftl">
		</ul>
	</div>
	
	<div class="if else">
		<ul>
			<li>if elseif else</li>
			<#if (emptyList?size = 0)>
				True인 경우
			<#elseif (emptyList?size = 1)>
				elseif 에 해당	
			<#else>
				False인 경우	
			</#if>
		</ul>
	</div>

</body>
</html>