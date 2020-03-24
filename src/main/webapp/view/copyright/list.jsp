<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>版权管理</title>
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="<%=path%>/static/css/jquery.page.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<div class="container">
    <form action="<%=path%>/copyright/queryCopyright.do" method="post">
        <input type="hidden" id="thispage" name="thispage" value="${page.thispage}"/>
        <input type="hidden" id="maxpage" name="maxpage" value="${page.maxpage}"/>
        <div class="form-group col-md-3">
            <label>版权名：</label>
            <input type="text" class="form-control" name="copyrightName" placeholder="请输入版权名称">
        </div>
        <div class="form-group col-md-3">
            <label>公司名：</label>
            <input type="text" class="form-control" name="company" placeholder="请输入公司名称">
        </div>
        <div class="form-group col-md-3">
            <label>备注名：</label>
            <input type="text" class="form-control" name="remarks" placeholder="请输入备注">
        </div>
        <div class="form-group col-md-1">
           <button class="btn btn-info" type="submit">搜索</button>
        </div>
        <div class="form-group col-md-1">
            <a class="btn btn-info form-control" href="<%=path%>/view/copyright/create.jsp">添加</a>
        </div>


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
                        <a class="col-md-2" href="javascript:toupdate('${u.copyrightId}');">修改</a>
                        <a class="col-md-4" href="<%=path%>/customer/query.do">管理客户</a>
                        <a class="col-md-4" href="<%=path%>/view/booklist/list.jsp">书单管理</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
            <tfoot>
            <tr>
                <td colspan="16">
                    <div id="page"></div>
                </td>
            </tr>
            </tfoot>
        </table>
    </div>
    </form>
</div>

<script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/js/jquery.page2.0.js"></script>
<script type="text/javascript" src="<%=path%>/static/lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/static/lib/layer/1.9.3/layer.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        var thispage = $('#thispage').val();
        var maxpage = $('#maxpage').val();

        //初始化分页控件
        $('#page').page({
            totalPages: maxpage,
            initPages: thispage,
            liNums: 5,
            activeClass: 'activP',
            callBack: function (page) {
                $('#thispage').val(page);
                $('form:first').submit();
            }
        });
    });
    function toupdate(copyrightId) {
        window.location.href = '<%=path%>/copyright/queryById/' + copyrightId + '.do';
    }

    /*批量-删除*/
    function ondelete(copyrightId) {
        window.location.href = '<%=path%>/copyright/delete/' + copyrightId + '.do';
    }
</script>
</body>
</html>
