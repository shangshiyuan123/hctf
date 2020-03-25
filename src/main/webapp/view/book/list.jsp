<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>书籍展示列表页面</title>
    <%@ include file="../../common/jsp/header.jsp"%>
</head>
<body>
<div class="wrapper wrapper-content animated fadeInRight">
    <div class="ibox float-e-margins">
        <form id="searchForm" action="">
            <div class="col-sm-12">
                <!-- ------------按钮组 start------------ -->
                <div class="col-sm-8">
                    <div class="btn-group hidden-xs" role="group">
                        <button type="button" class="btn btn-primary" data-toggle="modal" id="create" name="book/create.jsp">
                            <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>添加书籍
                        </button>
                    </div>
                </div>
                <div class="col-sm-4">
                   <%-- <input class="form-control" id="search" name="testName" value="${testEntity.testName }" type="text" placeholder="查询内容 回车搜索"/>--%>
                </div>
                <!-- ------------按钮组 end------------ -->
                <input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
                <input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
                <table class="table table-striped table-bordered table-hover table-condensed">
                    <thead>
                    <tr>
                        <th><input type="checkbox" id="checkall"/></th>
                        <th>书籍ID</th>
                        <th>外网ID</th>
                        <th>书名</th>
                        <th>作者</th>
                        <th>分类</th>
                        <th>版权名</th>
                        <th>书单名</th>
                        <th>批次名</th>
                        <th>连载</th>
                        <th>字数</th>
                        <th>状态</th>
                        <th>全本收费</th>
                        <th>全本价格</th>
                        <th>原创</th>
                        <th>出版社</th>
                        <th>出版时间</th>
                        <th>授权起始时间</th>
                        <th>授权结束时间</th>
                        <th>作者授权起始时间</th>
                        <th>作者授权结束时间</th>
                        <th>授权状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                   <%-- <c:set var="vs"></c:set>--%>
                    <c:forEach var="e" items="${page.list }" varStatus="v">
                        <tr>
                            <td><input type="checkbox" name="ids" value="${e.bookTdid }"/></td>
                            <td>${e.bookCpid }</td>
                            <td>${e.bookTdid }</td>
                            <td>${e.bookName }</td>
                            <td>${e.author }</td>
<%--                            1言情，2玄幻，3穿越，4其他--%>
                            <td>
                                <c:if test="${e.classify ==1 }">
                                    言情
                                </c:if>
                                <c:if test="${e.classify ==2 }">
                                    玄幻
                                </c:if>
                                <c:if test="${e.classify ==3 }">
                                    穿越
                                </c:if>
                                <c:if test="${e.classify ==4 }">
                                    其他
                                </c:if>
                            </td>
                            <td>${e.copyrightName }</td>
                            <td>${e.booklistName }</td>
                            <td>${e.batchName }</td>
                            <td>
                                <c:if test="${e.serialization ==1 }">
                                    是
                                </c:if>
                                <c:if test="${e.serialization ==2 }">
                                    否
                                </c:if>
                            </td>
                            <td>${e.wordnumber }</td>
                            <td><strong>
<%--                                1上线，2驳回--%>
                                <c:if test="${e.state ==0 }">
                                    未到位
                                </c:if>
                                <c:if test="${e.state ==1 }">
                                    初审
                                </c:if>
                                <c:if test="${e.state ==2}">
                                    入库审核
                                </c:if>
                                <c:if test="${e.state ==3 }">
                                    入库未上线
                                </c:if>
                                <c:if test="${e.state ==4 }">
                                    上线
                                </c:if>
                                <c:if test="${e.state ==5 }">
                                    版权过期
                                </c:if>
                                <c:if test="${e.state ==6 }">
                                    初审删除
                                </c:if>
                                <c:if test="${e.state ==7 }">
                                    入库审核删除
                                </c:if>
                                <c:if test="${e.state ==8 }">
                                    驳回
                                </c:if>
                                <c:if test="${e.state ==9 }">
                                    即将过期
                                </c:if>
                            </strong>
                            </td>
                            <td>${e.fullcharge }</td>
                            <td>${e.fullprice }</td>
                            <td>
<%--                                0否，1是--%>
                                <c:if test="${e.original ==0 }">
                                    否
                                </c:if>
                                <c:if test="${e.original ==1 }">
                                    是
                                </c:if>
                            </td>
                            <td>${e.press }</td>
                            <td>
                                <fmt:formatDate value="${e.presstime }" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <fmt:formatDate value="${e.startime }" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <fmt:formatDate value="${e.endtime }" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <fmt:formatDate value="${e.authorStartime }" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
                                <fmt:formatDate value="${e.authorEndtime }" pattern="yyyy-MM-dd"/>
                            </td>
                            <td>
<%--                                1有效，2过期--%>
                                <c:if test="${e.authorizationStatus ==1 }">
                                    有效
                                </c:if>
                                <c:if test="${e.authorizationStatus ==2 }">
                                    过期
                                </c:if>
                            </td>
                            <td><button type="button" class="btn btn-success" data-toggle="modal" id="update" name="test/view.do">
                                <i class="glyphicon glyphicon-pencil" aria-hidden="true"></i>修改
                            </button>
                                <button type="button" class="btn btn-danger" data-toggle="modal" id="delete" name="test/delete.do">
                                    <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>删除
                                </button></td>

                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="page">${page}</div>
            </div>
        </form>
    </div>
</div>
</body>

</html>