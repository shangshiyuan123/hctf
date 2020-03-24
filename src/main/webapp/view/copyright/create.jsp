<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <title>版权添加页面</title>
</head>
<body>

<div class="container">

    <form class="form-horizontal" action="<%=path%>/copyright/create.do" method="post">
        <div class="form-group">
            <label for="name" class="col-md-2 control-label">版权名</label>
            <div class="col-md-6">
                <input type="text" class="form-control" name="copyrightName" id="name" placeholder="请输入版权名">
            </div>
        </div>

        <div class="form-group">
            <label for="company" class="col-md-2 control-label">公司名</label>
            <div class="col-md-6">
                <input type="text" class="form-control" name="company" id="company" placeholder="请输入公司名">
            </div>
        </div>

        <div class="form-group">
            <label for="remarks" class="col-md-2 control-label">备注</label>
            <div class="col-md-6">
                <input type="text" class="form-control" name="remarks" id="remarks" placeholder="请输入备注">
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-2">
                <button type="submit" class="btn btn-info">提交</button>
                <button type="reset" class="btn btn-info">重置</button>
            </div>
        </div>

    </form>
</div>
</body>
</html>
