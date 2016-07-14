<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html>
<html>
<head>
<head>
	<meta charset="utf-8" />
	<title>800众服</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="/static/js/plugins/ace/assets/css/bootstrap.min.css"  />
	<link rel="stylesheet" href="/static/js/plugins/ace/assets/css/font-awesome.min.css" />
	<link rel="stylesheet" href="/static/js/plugins/ace/assets/css/ace.min.css" />
	<link rel="stylesheet" href="/static/js/plugins/ace/assets/css/ace-rtl.min.css" />
	<link rel="stylesheet" href="/static/js/plugins/ace/assets/css/ace-skins.min.css" />
	<link rel="stylesheet" href="/static/css/home/main.css" />
	<script src="/static/js/plugins/ace/assets/js/jquery-2.0.3.min.js"></script>
	<script src="/static/js/plugins/vue/vue.min.js"></script>
	<script src="/static/js/plugins/layer/layer.js"></script>
	<script src="/static/js/plugins/ace/assets/js/ace-extra.min.js"></script>
	<script src="/static/js/plugins/ace/assets/js/bootstrap.min.js"></script>
	<script src="/static/js/plugins/ace/assets/js/typeahead-bs2.min.js"></script>
	<script src="/static/js/plugins/ace/assets/js/ace-elements.min.js"></script>
	<script src="/static/js/plugins/ace/assets/js/ace.min.js"></script>
	<script src="/static/js/home/main.js"></script>
</head>

<body>
	<div class="navbar navbar-default" id="navbar">
		<script type="text/javascript">
			try{ace.settings.check('navbar' , 'fixed')}catch(e){}
		</script>
		<div class="navbar-container" id="navbar-container">
			<div class="navbar-header pull-left">
				<a href="#" class="navbar-brand">
					<small>
						<!-- <img alt="800众服" src="/static/images/logo.png"> -->
						800众服
					</small>
				</a>
			</div>
			<div class="navbar-header pull-right" role="navigation">
				<ul class="nav ace-nav">
					<li class="light-blue">
						<a data-toggle="dropdown" href="#" class="dropdown-toggle">
							<img class="nav-user-photo" src="/static/js/plugins/ace/assets/avatars/user.jpg" alt="Jason's Photo" />
							<span class="user-info">
								<small>欢迎,</small>
								${sessionScope.userName }
							</span>
							<i class="icon-caret-down"></i>
						</a>
						<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li class="divider"></li>
							<li>
								<a href="#">
									<i class="icon-off"></i>
									登出
								</a>
							</li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try{ace.settings.check('main-container','fixed')}catch(e){}
		</script>
		<div class="main-container-inner">
			<a class="menu-toggler" id="menu-toggler" href="#">
				<span class="menu-text"></span>
			</a>
			<div class="sidebar" id="sidebar">
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
				</script>
				<ul class="nav nav-list">
					<li class="active" id="pro"  >
						<a href="#" class="dropdown-toggle">
							<i class="icon-flag"></i>
							<span class="menu-text">项目管理 </span>
							<b class="arrow icon-angle-down"></b>
						</a>
						<ul class="submenu">
							<li id="create" >
								<a href="/pro/create">
									<i class="icon-double-angle-right"></i>
									新建项目
								</a>
							</li>
							<li id="wait">
								<a href="/pro/wait">
									<i class="icon-double-angle-right"></i>
									待审核项目
								</a>
							</li>
							<li id="reject" >
								<a href="/pro/reject">
									<i class="icon-double-angle-right"></i>
									未通过审核
								</a>
							</li>
							<li id="run" >
								<a href="/pro/run">
									<i class="icon-double-angle-right"></i>
									正在进行中
								</a>
							</li>
							<li id="time">
								<a href="/pro/time">
									<i class="icon-double-angle-right"></i>
									过期项目
								</a>
							</li>
							<li id="success">
								<a href="/pro/success">
									<i class="icon-double-angle-right"></i>
									已完成项目
								</a>
							</li>
							<li id="fail" >
								<a href="/pro/fail">
									<i class="icon-double-angle-right"></i>
									失败项目
								</a>
							</li>
							<li id="all" >
								<a href="/pro/all">
									<i class="icon-double-angle-right"></i>
									全部项目
								</a>
							</li>
						</ul>
					</li>
					<li class="active" id="pro"  >
						<a href="#" class="dropdown-toggle">
							<i class="icon-gift"></i>
							<span class="menu-text">账户信息</span>
						</a>
					</li>
				</ul>
				<script type="text/javascript">
					try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
				</script>
			</div>
				<sitemesh:body />
			</div>
		</div>
</body>
</html>