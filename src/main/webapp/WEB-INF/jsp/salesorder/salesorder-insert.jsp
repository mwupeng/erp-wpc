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
										创建人 / Creation</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="创建人 / Creation" class="creation"> <small>输入创建人 / Creation</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">创建人姓名
										/ creatioName</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="创建人姓名 / CreatioName" name="PathName" class="creatioName"> <small>输入创建人姓名 /
											creatioName</small>
										</div>
									</div>
									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">业务员
										/ UserId</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="输入业务员编号 / UserId" class="userId"> <small>业务员
											/ UserId</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">货物选择
										/ Commdity</label>
										<div class="am-u-sm-9">
											<button type="button" class="am-btn am-btn-primary" onclick="openWin() ">选择商品</button>
											<button type="button" class="am-btn am-btn-primary" onclick="selectopenWin() ">查看商品</button>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">收货信息
										/ Address</label>
										<div class="am-u-sm-9">
											<select data-am-selected="{btnWidth: '40%', btnSize: 'sm', btnStyle: 'secondary'}" class="address">
												<c:forEach var="list" items="${option }">
													<option value="${list.id}"> ${list.consignee} ${list.consigneephone} ${list.address} </option>
												</c:forEach>
											</select>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">预付款
										/ advance</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="预付款 / advance" class="advance"> <small>预付款 / advance</small>
										</div>
									</div>

									<div class="am-form-group">
										<label for="user-name" class="am-u-sm-3 am-form-label">备注
										/ Remark</label>
										<div class="am-u-sm-9">
											<input type="text" id="user-name" placeholder="备注 / Remark" class="remark"> <small>备注 / emark</small>
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
										<div class="am-modal-bd">数据添加成功</div>
										<div class="am-modal-footer">
											<span class="am-modal-btn">确定</span>
										</div>
									</div>
								</div>
								<div class="am-modal am-modal-alert" tabindex="-1" id="my-error">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">数据添加失败，请联系管理员</div>
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

								<div class="am-modal am-modal-alert" tabindex="-1" id="my-list">
									<div class="am-modal-dialog">
										<div class="am-modal-hd">注意!</div>
										<div class="am-modal-bd">商品列表未选中</div>
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
						var Creation = $('.creation').val();
						var CreatioName = $('.creatioName').val();
						var userId = $('.userId').val();
						var address = $('.address').val();
						var advance = $('.advance').val();
						var remark = $('.remark').val();
						var reg = new RegExp("^[0-9]*$");
						var name = window.location.search;
						var userid = !reg.test(userId);
						var Advance = !reg.test(userId);
						var reg = name.match(/=([^&]*)(&|$)/)[1];
						if((Creation == null || Creation == "") || (CreatioName == null || CreatioName == "")) {
							$('#my-dberror').modal('open');
						} else if(userid || Advance) {
							$('#my-dberror').modal('open');
						} else {
							$.ajax({
								url: "/salesorder/InsertDb",
								data: {
									clientId: reg,
									Creation: Creation,
									CreatioName: CreatioName,
									userId: userId,
									address: address,
									advance: advance,
									remark: remark
								},
								success: function(data) {
									if(data == 0) {
										$('#my-list').modal('open');
									} else {
										$('#my-info').modal('open');
										$('.am-modal-btn').on(
											'click',
											function() {
												$(window).attr('location',
													'/salesorder/index');
											})
									}
								},
								dataType: "text"
							});
						}
					});

			function openWin() {
				window.open("/salesorder/CommdityIndex");
			}

			function selectopenWin() {
				window.open("/salesorder/selectComm");
			}
		</script>
	</body>

</html>