<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>客户管理</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/jquery.page.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="container">
    <form action="<%=path%>/customer/query.do" method="post">
        <div class="form-group col-md-9">
        <a class="btn btn-info" href="<%=path%>/view/customer/create.jsp">添加客户</a>
            <a class="btn btn-info" href="javascript:;" id="batch">批量删除</a>
        </div>
        <div class="form-group col-md-4">
            <label>版权名：</label>
            <input type="text" class="form-control" name="copyrightName" placeholder="请输入版权名称">
        </div>
        <div class="form-group col-md-4">
            <label>姓名：</label>
            <input type="text" class="form-control" name="name" placeholder="请输入姓名">
        </div>
        <div class="form-group col-md-4">
          <button class="btn btn-info" type="submit">查询</button>
        </div>
        <div class="form-group col-md-10">客户列表</div>


    <div>
        <table class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <th><input type="checkbox" id="checkall"/>全选</th>
                <th>姓名</th>
                <th>版权名</th>
                <th>性别</th>
                <th>出生日期</th>
                <th>职务</th>
                <th>手机号</th>
                <th>座机号</th>
                <th>邮箱</th>
                <th>QQ</th>
                <th>公司地址</th>
                <th>备注</th>
                <th>操作</th>
            </tr>
            </thead>

            <tbody>
            <c:forEach var="p" items="${page.list }" varStatus="n">
                <tr>
                    <td><input type="checkbox" name="id" value="${p.customerId }"/></td>
                    <td>${p.name}</td>
                    <td>${p.copyright.copyrightName}</td>
                    <td>${p.gender==1?"男":"女"}</td>
                    <td> <f:formatDate value="${p.birthday}" pattern="yyyy-MM-dd"/></td>
                    <td>${p.post}</td>
                    <td>${p.telephone}</td>
                    <td>${p.landline}</td>
                    <td>${p.email}</td>
                    <td>${p.qq}</td>
                    <td>${p.companyAddress}</td>
                    <td>${p.remarks}</td>
                    <td>
                        <a class="btn btn-info"  href="javascript:ondelete('${p.customerId}');">删除</a>
                        <a class="btn btn-info"  href="javascript:toupdate('${p.customerId}');">修改</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    </form>
</div>

<script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/jquery.page2.0.js"></script>
<script type="text/javascript" src="<%=path%>/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript">
    function toupdate(customerId) {
        window.location.href = '<%=path%>/customer/queryById/' + customerId + '.do';
    }
    /*批量-删除*/
    function ondelete(customerId) {
        window.location.href = '<%=path%>/customer/delete/' + customerId + '.do';
    }
    $(document).ready(function () {
        $('#checkall').click(function () {
            $('[name=id]').prop('checked', $(this).prop('checked'));
        });
        $('#batch').click(function () {
            var len = $('[name=id]:checked').length;
            if (len == 0) {
                layer.alert("请至少选择一条！");
                return;
            }
            var ids = [];
            for (var i = 0; i < len; i++) {
                ids.push($('[name=id]:checked').eq(i).val());
            }
            layer.confirm('确认要删除吗？', function () {
                alert(ids)
                window.location.href = '<%=path%>/customer/batch/' + ids + '.do';
            });
        });
        });
</script>
</body>
</html>
