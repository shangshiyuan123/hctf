<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap -->
    <link href="<%=path%>/static/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="<%=path%>/static/js/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="<%=path%>/static/js/bootstrap.min.js"></script>
    <title>版权管理系统</title>

</head>
<body>

<div class="container">

    <div class="row">
        <!--左侧导航栏-->
        <div class="col-lg-2">
            <div class="panel-group">
                <div class="panel panel-success">

                    <div class="panel-heading">
                        <div class="panel-title text-center">
                            <a href="#copyright-in" data-toggle="collapse">版权引进</a>
                        </div>
                    </div>
                    <div class="panel-collapse collapse in" id="copyright-in">
                        <div class="panel-body">
                            <ul class="list-unstyled text-center">
                                <li><a href="<%=path%>/view/copyright/list.jsp">版权管理</a></li>
                                <li><a href="#">批次管理</a></li>
                                <li><a href="#">书单管理</a></li>
                                <li><a href="#">书籍管理</a></li>
                                <li><a href="#">接口管理</a></li>
                            </ul>
                        </div>
                    </div>

                    <div class="panel-heading">
                        <div class="panel-title text-center">
                            <a href="#copyright-out" data-toggle="collapse">版权输出</a>
                        </div>
                    </div>
                    <div class="panel-collapse collapse in" id="copyright-out">
                        <div class="panel-body">
                            <ul class="list-unstyled text-center">
                                <li><a href="#">运营方管理</a></li>
                                <li><a href="#">结算管理</a></li>
                                <li><a href="#">批次管理</a></li>
                                <li><a href="#">书单管理</a></li>
                                <li><a href="#">接口管理</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>

                    <!--右侧内容-->
                    <div class="col-md-10">
                        <table class="table table-striped table-bordered table-hover">
                            <tr>
                                <td colspan="6">版权引进统计</td>
                            </tr>
                            <tr>
                                <td>未到位：</td>
                                <td>初审：</td>
                                <td>入库审核：</td>
                                <td>入库未上线：</td>
                                <td>上线：</td>
                                <td>版权过期：</td>
                            </tr>
                            <tr>
                                <td>初审删除：</td>
                                <td>入库审核删除：</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>

                        <table class="table table-striped table-bordered table-hover">
                            <tr>
                                <td colspan="6">入库书籍问题处理统计</td>
                            </tr>
                            <tr>
                                <td>初审驳回：</td>
                                <td>入库审核驳回：</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>

                        <table class="table table-striped table-bordered table-hover">
                            <tr>
                                <td colspan="6">连载更新提醒</td>
                            </tr>
                            <tr>
                                <td>连载更新：</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>

                        <table class="table table-striped table-bordered table-hover">
                            <tr>
                                <td colspan="6">即将过期提醒</td>
                            </tr>
                            <tr>
                                <td>即将过期：</td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </table>
                    </div>
    </div>
</div>
</body>
</html>
