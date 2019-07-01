<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- 引入标签-->
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!doctype html>
<html>

	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Amaze UI Admin index Examples</title>
		<meta name="description" content="这是一个 index 页面">
		<meta name="keywords" content="index">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="renderer" content="webkit">
		<meta http-equiv="Cache-Control" content="no-siteapp" />
		<link rel="icon" type="image/png" href="../../assets/i/favicon.png">
		<link rel="apple-touch-icon-precomposed" href="../../assets/i/app-icon72x72@2x.png">
		<meta name="apple-mobile-web-app-title" content="Amaze UI" />
		<link rel="stylesheet" href="../../assets/css/amazeui.min.css" />
		<link rel="stylesheet" href="../../assets/css/admin.css">
		<link rel="stylesheet" href="../../assets/css/app.css">
	</head>

	<body data-type="generalComponents">

		<header class="am-topbar am-topbar-inverse admin-header">
			<div class="am-topbar-brand">
				<a href="javascript:;" class="tpl-logo"> <img src="../../assets/img/logo.png" alt="">
				</a>
			</div>
			<div class="am-icon-list tpl-header-nav-hover-ico am-fl am-margin-right">

			</div>

			<button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>

			<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

				<ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list tpl-header-list">
					<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
						<a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;"> <span class="am-icon-bell-o"></span> 提醒 <span class="am-badge tpl-badge-success am-round">5</span></span>
						</a>
						<ul class="am-dropdown-content tpl-dropdown-content">
							<li class="tpl-dropdown-content-external">
								<h3>
								你有 <span class="tpl-color-success">5</span> 条提醒
							</h3>
								<a href="###">全部</a>
							</li>
							<li class="tpl-dropdown-list-bdbc">
								<a href="#" class="tpl-dropdown-list-fl"><span class="am-icon-btn am-icon-plus tpl-dropdown-ico-btn-size tpl-badge-success"></span> 【预览模块】移动端 查看时 手机、电脑框隐藏。</a> <span class="tpl-dropdown-list-fr">3小时前</span>
							</li>
							<li class="tpl-dropdown-list-bdbc">
								<a href="#" class="tpl-dropdown-list-fl"><span class="am-icon-btn am-icon-check tpl-dropdown-ico-btn-size tpl-badge-danger"></span> 移动端，导航条下边距处理 </a> <span class="tpl-dropdown-list-fr">15分钟前</span></li>
							<li class="tpl-dropdown-list-bdbc">
								<a href="#" class="tpl-dropdown-list-fl"><span class="am-icon-btn am-icon-bell-o tpl-dropdown-ico-btn-size tpl-badge-warning"></span> 追加统计代码 </a> <span class="tpl-dropdown-list-fr">2天前</span></li>
						</ul>
					</li>
					<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
						<a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;"> <span class="am-icon-comment-o"></span> 消息
							<span class="am-badge tpl-badge-danger am-round">9</span></span>
						</a>
						<ul class="am-dropdown-content tpl-dropdown-content">
							<li class="tpl-dropdown-content-external">
								<h3>
								你有 <span class="tpl-color-danger">9</span> 条新消息
							</h3>
								<a href="###">全部</a>
							</li>
							<li>
								<a href="#" class="tpl-dropdown-content-message"> <span class="tpl-dropdown-content-photo"> <img
									src="../../assets/img/user02.png" alt="">
							</span> <span class="tpl-dropdown-content-subject"> <span
									class="tpl-dropdown-content-from"> 禁言小张 </span> <span class="tpl-dropdown-content-time">10分钟前 </span>
									</span> <span class="tpl-dropdown-content-font"> Amaze UI 的诞生，依托于
									GitHub 及其他技术社区上一些优秀的资源；Amaze UI 的成长，则离不开用户的支持。 </span>
								</a>
								<a href="#" class="tpl-dropdown-content-message"> <span class="tpl-dropdown-content-photo"> <img
									src="../../assets/img/user03.png" alt="">
							</span> <span class="tpl-dropdown-content-subject"> <span
									class="tpl-dropdown-content-from"> Steam </span> <span class="tpl-dropdown-content-time">18分钟前</span>
									</span> <span class="tpl-dropdown-content-font"> 为了能最准确的传达所描述的问题，
									建议你在反馈时附上演示，方便我们理解。 </span>
								</a>
							</li>
						</ul>
					</li>
					<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
						<a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;"> <span class="am-icon-calendar"></span> 进度
							<span class="am-badge tpl-badge-primary am-round">4</span></span>
						</a>
						<ul class="am-dropdown-content tpl-dropdown-content">
							<li class="tpl-dropdown-content-external">
								<h3>
								你有 <span class="tpl-color-primary">4</span> 个任务进度
							</h3>
								<a href="###">全部</a>
							</li>
							<li>
								<a href="javascript:;" class="tpl-dropdown-content-progress"> <span class="task">
									<span class="desc">Amaze UI 用户中心 v1.2 </span> <span class="percent">45%</span>
									</span> <span class="progress">
									<div class="am-progress tpl-progress am-progress-striped">
										<div class="am-progress-bar am-progress-bar-success"
											style="width: 45%"></div>
									</div>
							</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="tpl-dropdown-content-progress"> <span class="task">
									<span class="desc">新闻内容页 </span> <span class="percent">30%</span>
									</span> <span class="progress">
									<div class="am-progress tpl-progress am-progress-striped">
										<div class="am-progress-bar am-progress-bar-secondary"
											style="width: 30%"></div>
									</div>
							</span>
								</a>
							</li>
							<li>
								<a href="javascript:;" class="tpl-dropdown-content-progress"> <span class="task">
									<span class="desc">管理中心 </span> <span class="percent">60%</span>
									</span> <span class="progress">
									<div class="am-progress tpl-progress am-progress-striped">
										<div class="am-progress-bar am-progress-bar-warning"
											style="width: 60%"></div>
									</div>
							</span>
								</a>
							</li>

						</ul>
					</li>
					<li class="am-hide-sm-only">
						<a href="javascript:;" id="admin-fullscreen" class="tpl-header-list-link"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a>
					</li>

					<li class="am-dropdown" data-am-dropdown data-am-dropdown-toggle>
						<a class="am-dropdown-toggle tpl-header-list-link" href="javascript:;"> <span class="tpl-header-list-user-nick"><sec:authentication
								property="name" /></span><span class="tpl-header-list-user-ico">
							<img src="../../assets/img/user01.png">
					</span>
						</a>
						<ul class="am-dropdown-content">
							<li>
								<a href="#"><span class="am-icon-bell-o"></span> 资料</a>
							</li>
							<li>
								<a href="#"><span class="am-icon-cog"></span> 设置</a>
							</li>
							<li>
								<a href="#"><span class="am-icon-power-off"></span> 退出 </a>
							</li>
						</ul>
					</li>
					<li>
						<a href="###" class="tpl-header-list-link"><span class="am-icon-sign-out tpl-header-list-ico-out-size"></span></a>
					</li>
				</ul>
			</div>
		</header>

		<div class="tpl-page-container tpl-page-header-fixed">

			<div class="tpl-left-nav tpl-left-nav-hover">
				<div class="tpl-left-nav-title">管 理 列 表</div>
				<div class="tpl-left-nav-list">
					<ul class="tpl-left-nav-menu">
						<li class="tpl-left-nav-item">
							<a href="/index" class="nav-link active"> <i class="am-icon-home"></i> <span>首页</span>
							</a>
						</li>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>权限管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="/power/resource"> <i class="am-icon-angle-right"></i> <span>资源管理</span>
										</a>
										<a href="/user/user"> <i class="am-icon-angle-right"></i> <span>角色管理</span>
										</a>
										<a href="/section/index"> <i class="am-icon-angle-right"></i>
											<span>部门管理</span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>人事管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-amazeui.html"> <i class="am-icon-angle-right"></i> <span>人事考核</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>设备管理</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>人事数据</span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>财务管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-amazeui.html"> <i class="am-icon-angle-right"></i> <span>财务信息</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>生产货单</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>销售订单</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>工资管理</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>财务报销</span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>船务管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-amazeui.html"> <i class="am-icon-angle-right"></i> <span>订单信息</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>货流状态 </span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>仓库管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-amazeui.html"> <i class="am-icon-angle-right"></i> <span>生产计划</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>采购计划 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>货物信息 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>库存管理 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>次物信息 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>订单审核 </span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>业务管理</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i> <span>销售订单 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>销售业绩 </span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>监控信息</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i> <span>Durid </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>日志信息</span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
						<sec:authorize access="hasRole('0')">
							<li class="tpl-left-nav-item">
								<a href="javascript:;" class="nav-link tpl-left-nav-link-list"> <i class="am-icon-wpforms"></i> <span>客户信息</span> <i class="am-icon-angle-right tpl-left-nav-more-ico am-fr am-margin-right tpl-left-nav-more-ico-rotate"></i>
								</a>
								<ul class="tpl-left-nav-sub-menu" style="display: block;">
									<li>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i> <span>客户管理 </span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>客户地址</span>
										</a>
										<a href="form-line.html"> <i class="am-icon-angle-right"></i>
											<span>客户订单</span>
										</a>
									</li>
								</ul>
							</li>
						</sec:authorize>
					</ul>
				</div>
			</div>

			<div class="tpl-content-wrapper">
				<ol class="am-breadcrumb">
					<li>
						<a href="#" class="am-icon-home">首页</a>
					</li>
					<li>
						<a href="#">权限管理</a>
					</li>
					<li>
						<a href="/power/resource">资源管理</a>
					</li>
					<li class="am-active">添加资源</li>
				</ol>
				<div class="tpl-portlet-components">
					<div class="portlet-title">
						<div class="caption font-green bold">
							<span class="am-icon-code"></span> 添加资源
						</div>

					</div>
					<div class="tpl-block ">

						<div class="am-g tpl-amazeui-form">

							<div class="am-u-sm-12 am-u-md-9">
								<form class="am-form am-form-horizontal">
									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">
										登录名 / LoginName</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="登录名 / LoginName" value='${user.loginname}' class="LoginName"> <small>输入登录名 / LoginName</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">用户姓名
										/ UserName</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="用户姓名 / UserName" value='${user.name}' name="PathName" class="UserName"> <small>输入用户姓名
											/ UserName</small>
										</div>
									</div>
									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">登录密码
										/ PassWord</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="登录密码 / PassWord" value='${user.password}' name="PathName" class="PassWord"> <small>登录密码
											/ PassWord</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">职务
										/ Duty</label>
										<div class="am-u-sm-9">
											<select data-am-selected="{maxHeight: 100}" class="Duty">
												<optgroup label="职务">
													<c:if test="${user.roleid == 0} ">
														<option value="0" selected>ERP</option>
													</c:if>
													<c:if test="${user.roleid == 1}">
														<option value="1" selected>总务</option>
													</c:if>
													<c:if test="${user.roleid == 2}">
														<option value="2" selected>总务助理</option>
													</c:if>
													<c:if test="${user.roleid == 3}">
														<option value="3" selected>财务总监</option>
													</c:if>
													<c:if test="${user.roleid == 4}">
														<option value="4" selected>财务会计</option>
													</c:if>
													<c:if test="${user.roleid == 5}">
														<option value="5" selected>人事</option>
													</c:if>
													<c:if test="${user.roleid== 6} ">
														<option value="6" selected>船务</option>
													</c:if>
													<c:if test="${user.roleid== 7} ">
														<option value="7" selected>总务</option>
													</c:if>
													<c:if test="${user.roleid== 8} ">
														<option value="8" selected>生产主任</option>
													</c:if>
													<c:if test="${user.roleid== 9} ">
														<option value="9" selected>仓库主任</option>
													</c:if>
													<c:if test="${user.roleid == 10}">
														<option value="10" selected>仓库员</option>
													</c:if>
													<c:if test="${user.roleid== 11} ">
														<option value="11" selected>业务经理</option>
													</c:if>
													<c:if test="${user.roleid == 12} ">
														<option value="12" selected>业务员</option>
													</c:if>
													<option value="0">ERP</option>
													<option value="1">总务</option>
													<option value="2">总务助理</option>
													<option value="3">财务总监</option>
													<option value="4">财务会计</option>
													<option value="5">人事</option>
													<option value="6">船务</option>
													<option value="7">总务</option>
													<option value="8">生产主任</option>
													<option value="9">仓库主任</option>
													<option value="10">仓库员</option>
													<option value="11">业务经理</option>
													<option value="12">业务员</option>
												</optgroup>

											</select>
										</div>

									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">性别
										/ Sex</label>
										<div class="am-u-sm-9">
											<select data-am-selected="{maxHeight: 100}" class="sex">
												<optgroup label="性别">
													<c:set var="sexval" scope="session" value="${user.sex}" />
													<c:if test="${sexval == 0}">
														<option value="0" selected>男</option>
														<option value="1">女</option>
													</c:if>
													<c:if test="${sexval == 1}">
														<option value="1" selected>女</option>
														<option value="0">男</option>
													</c:if>

												</optgroup>

											</select>
										</div>

									</div>
									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">年龄
										/ Age</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="年龄 / Age" name="PathName" class="Age" value='${user.age}'> <small>年龄 / Age</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">电话号码
										/ Phone</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="电话号码 / Phone" name="PathName" class="Phone" value='${user.phone}'> <small>电话号码 /
											Phone</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">所属部门
										/ department</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="所属部门 / department" name="PathName" class="department" value='${user.organizationid}'> <small>所属部门 / department</small>
										</div>
									</div>

									<div class="am-form-group">
										<div class="am-u-sm-9 am-u-sm-push-3">
											<input type="button" class="am-btn am-btn-primary" value="保  存" id="sumbitInsert" />
										</div>
									</div>
								</form>
								<div class="am-modal am-modal-alert" tabindex="-1" id="my-info">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">数据更新成功</div>
										<div class="am-modal-footer">
											<span class="am-modal-btn">确定</span>
										</div>
									</div>
								</div>
								<div class="am-modal am-modal-alert" tabindex="-1" id="my-error">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">数据更新失败，请联系管理员</div>
										<div class="am-modal-footer">
											<span class="am-modal-btn">确定</span>
										</div>
									</div>
								</div>
								<div class="am-modal am-modal-alert" tabindex="-1" id="my-dberror">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">数据为空或者错误,请重新填写</div>
										<div class="am-modal-footer">
											<span class="am-modal-btn">确定</span>
										</div>
									</div>
								</div>

								<div class="am-modal am-modal-alert" tabindex="-1" id="my-errerName">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">该用户名已经存在</div>
										<div class="am-modal-footer">
											<span class="am-modal-btn">确定</span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>

			</div>

		</div>

		<script src="../../assets/js/jquery.min.js"></script>
		<script src="../../assets/js/amazeui.min.js"></script>
		<script src="../../assets/js/app.js"></script>
		<script type="text/javascript">
			// 资源管理>新增>提交
			$('#sumbitInsert')
				.on(
					'click',
					function() {
						var urlname = window.location.search;
						var ma = urlname.replace(/[^0-9]/g, "");
						var LoginName = $('.LoginName').val();
						var UserName = $('.UserName').val();
						var PassWord = $('.PassWord').val();
						var Duty = $('.Duty').val();
						var sex = $('.sex').val();
						var Age = $('.Age').val();
						var Phone = $('.Phone').val();
						var department = $('.department').val();
						var myreg = /^(((13[0-9]{1})|(14[0-9]{1})|(17[0]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/;
						var regAge = /^\d{1,2}$/;
						if((LoginName == null || LoginName == "") ||
							(UserName == null || UserName == "") ||
							(PassWord == null || PassWord == "") ||
							(Duty == null || Duty == "") ||
							(sex == null || sex == "") ||
							(Age == null || Age == "") ||
							(Phone == null || Phone == "") ||
							(department == null || department == "")) {
							$('#my-dberror').modal('open');
						} else if(!myreg.test(Phone) || !regAge.test(Age)) {
							$('#my-dberror').modal('open');
						} else {
							$.ajax({
								url: "/user/UserUpdate",
								data: {
									id: ma,
									LoginName: LoginName,
									UserName: UserName,
									PassWord: PassWord,
									Duty: Duty,
									sex: sex,
									Age: Age,
									Phone: Phone,
									department: department
								},
								success: function(data) {
									if(data == 1) {
										$('#my-info').modal('open');
										$('.am-modal-btn').on(
											'click',
											function() {
												$(window).attr(
													'location',
													'/user/user');
											})
									} else if(data == 0) {
										$('#my-error').modal('open');
									} else if(data == 2) {
										$('#my-errerName').modal('open');
									}
								},
								dataType: "text"
							});
						}
					});
		</script>
	</body>

</html>