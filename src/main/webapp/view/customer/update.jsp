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
    <title>修改客户</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form class="form-horizontal" action="<%=path%>/customer/update.do" method="post">
        <input type="hidden" id="customerId" name="customerId" value="${entity.customerId}"/>
        <div class="form-group">
            <label for="copyright" class="col-md-2 control-label">>选择版权：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" value="${entity.copyright.copyrightName}" name="copyrightName" id="copyright" readonly/>
            </div>
        </div>

        <div class="form-group">
            <label for="name" class="col-md-2 control-label">姓名：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="name" value="${entity.name}" name="name" placeholder="请输入姓名"/>
            </div>
        </div>

        <div class="form-group">
            <label for="post" class="col-md-2 control-label">职务：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="post" value="${entity.post}" name="post" placeholder="请输入职务"/>
            </div>
        </div>

        <div class="form-group">
            <label for="gender" class="col-md-2 control-label">性别：</label>
            <div class="col-md-6" id="gender">
                <input type="radio" name="gender" value="1" ${entity.gender==1?"checked":""}/>男
                <input type="radio" name="gender" value="2" ${entity.gender==2?"checked":""}/>女
            </div>
        </div>

        <div class="form-group">
            <label for="birthday" class="col-md-2 control-label">出生日期：</label>
            <div class="col-md-6">
                <input type="date" id="birthday" value="<f:formatDate value="${entity.birthday}" pattern="yyyy-MM-dd"/>" name="birthday" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label for="telephone" class="col-md-2 control-label">手机号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" value="${entity.telephone}" id="telephone" name="telephone" placeholder="请输入手机号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="landline" class="col-md-2 control-label">座机号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="landline" value="${entity.landline}" name="landline" placeholder="请输入座机号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="qq" class="col-md-2 control-label">QQ号：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="qq" name="qq" value="${entity.qq}" placeholder="请输入QQ号"/>
            </div>
        </div>

        <div class="form-group">
            <label for="email" class="col-md-2 control-label">邮箱：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="email" name="email" value="${entity.email}" placeholder="请输入邮箱"/>
            </div>
        </div>

        <div class="form-group">
            <label for="companyAddress" class="col-md-2 control-label">公司地址：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="companyAddress" name="companyAddress" value="${entity.companyAddress}" placeholder="请输入公司地址"/>
            </div>
        </div>

        <div class="form-group">
            <label for="remarks" class="col-md-2 control-label">备注：</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="remarks" value="${entity.remarks}" name="remarks" placeholder="请输入备注"/>
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

</body>
</html>
