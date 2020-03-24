<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>书籍添加页面</title>
    <%@ include file="../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div>
        <div class="col-sm-4"><input type="button" value="返回上一页" class="btn btn-success" onclick="javascript:history.back();"/></div>
    </div>
    <div class="ibox float-e-margins">
        <form action="${path }/book/create.do" method="post" enctype="multipart/form-data"
              class="form-horizontal" role="form">
            <fieldset>
                <div class="form-group">
                    <label class="col-sm-2 control-label">书名：</label>
                    <div class="col-sm-2">
                        <input data-toggle="tooltip" title="描述书籍入库后不可修改书名" class="form-control" id="bookName" name="bookName" type="text" placeholder="填写书籍名称"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">版权方书籍ID：</label>
                    <div class="col-sm-2">
                        <input class="form-control" id="bookCpid" name="bookCpid" type="text" placeholder="出版书籍请填写 isbn号"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">作者名：</label>
                    <div class="col-sm-2">
                        <input data-toggle="tooltip" title="书籍入库后不可修改作者名" class="form-control" id="author" name="author" type="text" placeholder="填写作者名称"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-sm-2 control-label">分类：</label>
                    <div class="col-sm-2">
                        <select class="form-control" name="grade" data-toggle="tooltip" title="入库以后不支持修改分类">
                            <option value="0">请选择分类</option>
                            <option value="1">言情</option>
                            <option value="2">玄幻</option>
                            <option value="3">穿越</option>
                            <option value="4">其他</option>
                        </select>
                    </div>
                </div>

            </fieldset>
            <fieldset>
                <div class="form-group">
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-4">
                        <input type="submit" value="提交" class="btn btn-primary"/>
                    </div>
                    <label class="col-sm-2 control-label"></label>
                    <div class="col-sm-4">
                        <input type="reset" value="重置" class="btn btn-danger"/>
                    </div>
                </div>
            </fieldset>
        </form>
    </div>
</div>
</body>
<script type="text/javascript" src="${path }/view/system/user/js/user.js"></script>
</html>