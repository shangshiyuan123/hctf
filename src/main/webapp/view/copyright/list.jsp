<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form>
        <div class="form-group col-md-4">
            <label>版权名：</label>
            <input type="text" class="form-control" placeholder="请输入版权名称">
        </div>
        <div class="form-group col-md-4">
            <label>公司名：</label>
            <input type="text" class="form-control" placeholder="请输入公司名称">
        </div>
        <div class="form-group col-md-4">
            <label>备注名：</label>
            <input type="text" class="form-control" placeholder="请输入备注">
        </div>
    </form>

    <div>
        <table class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <th><input type="checkbox" id="checkall"/></th>
                <th>序号</th>
                <th>版权</th>
                <th>公司</th>
                <th>备注名</th>
                <th>未到位(合计：X)</th>
                <th>初审</th>
                <th>入库审核</th>
                <th>入库未上线</th>
                <th>上线</th>
                <th>版权过期</th>
                <th>初审删除</th>
                <th>入库审核删除</th>
                <th>驳回</th>
                <th>即将过期</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="u" items="${page.list }" varStatus="v">
                <tr>
                    <td><input type="checkbox" name="ids" value="${u.copyrightId}"/></td>
                    <td>${v.count}</td>
                    <td>${u.copyrightName }</td>
                    <td>${u.company}</td>
                    <td>${u.remarks}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>
