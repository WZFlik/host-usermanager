<!-- basePath路径,
引入jsp用里面路径,
在web.xml中为每个jsp页面都引入了这个jsp -->
<%
String bPath = request.getScheme()+"//"+request.getServerName()+":"
+request.getServerPort()+"/"+request.getContextPath();
request.setAttribute("bPath", bPath);
%>