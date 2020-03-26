<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>添加客户</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form-horizontal" action="<%=path%>/customer/create.do" method="post">

        <div class="form-group">
            <label class="col-md-2 control-label">绑定版权:</label>
            <div class="col-md-6">
                <select id="copyright" class="form-control" name="copyright.copyrightId">
                    <option value="0">请选择</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="name" class="col-md-2 control-label">姓名：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名"/>
            </div>
        </div>

        <div class="form-group">
            <label for="post" class="col-md-2 control-label">职务：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="post" name="post" placeholder="请输入职务"/>
            </div>
        </div>

        <div class="form-group">
            <label for="gender" class="col-md-2 control-label">性别：</label>
            <div class="col-md-6" id="gender">
                <input type="radio" name="gender" value="1"/>男
                <input type="radio" name="gender" value="2"/>女
            </div>
        </div>

        <div class="form-group">
            <label for="birthday" class="col-md-2 control-label">出生日期：</label>
            <div class="col-md-6">
                <input type="date" id="birthday" name="birthday" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label for="telephone" class="col-md-2 control-label">手机号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="telephone" name="telephone" placeholder="请输入手机号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="landline" class="col-md-2 control-label">座机号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="landline" name="landline" placeholder="请输入座机号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="qq" class="col-md-2 control-label">QQ号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="qq" name="qq" placeholder="请输入QQ号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="email" class="col-md-2 control-label">邮箱：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱"/>
            </div>
        </div>

        <div class="form-group">
            <label for="companyAddress" class="col-md-2 control-label">公司地址：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="companyAddress" name="companyAddress"
                       placeholder="请输入公司地址"/>
            </div>
        </div>

        <div class="form-group">
            <label for="remarks" class="col-md-2 control-label">备注：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="remarks" name="remarks" placeholder="请输入备注"/>
            </div>
        </div>

        <div class="form-group">
            <div class="col-md-offset-2">
                <input type="submit" class="btn btn-info" value="提交"/>
                <input type="reset" class="btn btn-info" value="取消"/>
            </div>
        </div>
    </form>
</div>
<script type="text/javascript" src="<%=path%>/static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        $(function () {
            $.ajax({
                url: '<%=path%>/customer/queryCopyright.do',
                dataType: 'json',
                type: 'POST',
                success: function (data) {
                    var html = '';
                    $.each(data, function (i, item) {
                        html += "<option value='" + item.copyrightId + "'>" + item.copyrightName + "</option>";
                    });
                    $('#copyright').append(html);
                }
            })
        });
    });

</script>
</body>
</html>
