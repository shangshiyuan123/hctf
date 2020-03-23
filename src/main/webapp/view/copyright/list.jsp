<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>版权管理</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
${page.list}
<div class="container">
    <form>
        <div class="form-group col-md-3">
            <label>版权名：</label>
            <input type="text" class="form-control" placeholder="请输入版权名称">
        </div>
        <div class="form-group col-md-3">
            <label>公司名：</label>
            <input type="text" class="form-control" placeholder="请输入公司名称">
        </div>
        <div class="form-group col-md-3">
            <label>备注名：</label>
            <input type="text" class="form-control" placeholder="请输入备注">
        </div>
        <div class="form-group col-md-1">
            <a class="btn btn-info form-control">搜索</a>
        </div>
        <div class="form-group col-md-1">
            <a class="btn btn-info form-control" href="<%=path%>/view/copyright/create.jsp">添加</a>
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
            <c:forEach var="u" items="${page.list}" varStatus="v">
                <tr>
                    <td><input type="checkbox" name="ids" value="${u.copyrightId}"/></td>
                    <td>${v.count}</td>
                    <td>${u.copyrightName }</td>
                    <td>${u.company}</td>
                    <td>${u.remarks}</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td>
                        <a class="col-md-2" href="javascript:ondelete('${u.copyrightId}');">删除</a>
                        <a class="col-md-2" href="">修改</a>
                        <a class="col-md-4" href="">管理客户</a>
                        <a class="col-md-4" href="">书单管理</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <div>${page}</div>
    </div>

</div>
<script type="text/javascript" src="<%=path%>/static/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
<script type="text/javascript">
        /*批量-删除*/
        function ondelete( copyrightId) {
            alert(copyrightId)
                window.location.href = '<%=path%>/copyright/delete/' + copyrightId + '.do';
        }

</script>
</body>
</html>
