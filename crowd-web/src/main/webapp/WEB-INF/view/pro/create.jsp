<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="/static/js/plugins/ace/assets/css/datepicker.css">
<script src="/static/js/plugins/ace/assets/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="/static/js/home/pro/create.js" ></script>
<div class="main-content">
	<div class="breadcrumbs" id="breadcrumbs">
		<script type="text/javascript">
			try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
		</script>
		<ul class="breadcrumb">
			<li>
				<i class="icon-home home-icon"></i>
				<a href="/pro/index">首页</a>
			</li>
			<li>
				<a>项目管理</a>
			</li>
			<li class="active">新建项目</li>
		</ul>
	</div>
	<div class="row">
		<div class="col-xs-12">
			<div class="row">
			<div class="col-xs-12 col-sm-12 widget-container-span ui-sortable">
			 <div class="space-4"></div>
				<div class="widget-box">
					<div class="widget-header">
						<h5>项目信息</h5>
					</div>
					<div class="widget-body">
						<div class="widget-main no-padding">
							<form class="form-horizontal" role="form" id="form" >
								<div class="form-group">
									<div class="space-4"></div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >项目名称：</label>
									<div class="col-sm-9">
										<input type="text" id="projectName" name="projectName"  class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >项目类型：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="type" name="type" >
											<option value="1" >实物众筹</option>
											<option value="2" >股权众筹</option>
											<option value="4" >公益众筹</option>
										</select>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >保障金比例：</label>
									<div class="col-sm-9">
										<input type="text" id="breach" name="breach" class="col-xs-10 col-sm-5">
										<span class="help-inline col-xs-12 col-sm-7">
											<span class="middle text-success">%</span>
											<span class="middle text-error">11%</span>
										</span>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >项目简介：</label>
									<div class="col-sm-9">
										<textarea class="col-xs-10 col-sm-5" name="info" id="info" ></textarea>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >单笔最小支持金额：</label>
									<div class="col-sm-9">
										<input type="text" id="minMoney" name="minMoney"  class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >单笔最大支持金额：</label>
									<div class="col-sm-9">
										<input type="text" id="maxMoney" name="maxMoney"  class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >募集金额：</label>
									<div class="col-sm-9">
										<input type="text" id="wannaAccount" name="wannaAccount"  class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >按份数增加规则：</label>
									<div class="col-sm-9">
										<input type="text"  id="addAmount" name="addAmount" class="col-xs-10 col-sm-5">
										<span class="help-inline col-xs-12 col-sm-7">
											<span class="middle text-success">0代表取消按份数</span>
										</span>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >募集开始日期：</label>
									<div class="col-sm-9">
										<input class="date-picker col-xs-10 col-sm-5" id="startTime" name="startTime"  type="text" data-date-format="yyyy-mm-dd">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >募集结束日期：</label>
									<div class="col-sm-9">
										<input class="date-picker col-xs-10 col-sm-5" id="endTime" name="endTime"  type="text" data-date-format="yyyy-mm-dd">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >融资轮次：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="financing" name="financing" >
											<option value="1" selected="selected">种子轮</option>
											<option value="2">天使轮</option>
											<option value="3">Pre-A轮</option>
											<option value="4">A轮</option>
											<option value="5">Pre-B轮</option>
											<option value="6">B轮</option>
											<option value="7">C轮</option>
											<option value="8">D轮</option>
										</select>
										<span class="help-inline col-xs-12 col-sm-7">
											<span class="middle text-success">非必填</span>
										</span>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right"  >发起人：</label>
									<div class="col-sm-9">
										<input type="text"id="creater" name="creater"  class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >发起人公司：</label>
									<div class="col-sm-9">
										<input type="text" id="company" name="company" class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >发起人简介：</label>
									<div class="col-sm-9">
										<input type="text" id="createrInfo" name="createrInfo" class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >出让股权：</label>
									<div class="col-sm-9">
										<input type="text" id="companyMoney" name="companyMoney"  class="col-xs-10 col-sm-5">
										<span class="help-inline col-xs-12 col-sm-7">
											<span class="middle text-success">%</span>
										</span>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >PC是否显示：</label>
									<div class="col-sm-9">
										<select  class="col-xs-10 col-sm-5" id="isShowPc" name="isShowPc" >
											<option value="1" >显示</option>
											<option value="0" >隐藏</option>
										</select>
									</div>
								</div>
								<div class="space-4"></div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >微信是否显示：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="isShowWechat" name="isShowWechat" >
											<option value="1" >显示</option>
											<option value="0" >隐藏</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >app是否显示：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="isShowApp" name="isShowApp" >
											<option value="1" >显示</option>
											<option value="0" >隐藏</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >超募是否接受：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="isExceedAccept" name="isExceedAccept" >
											<option value="1" >接收</option>
											<option value="2" >拒绝</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" >超人数是否接受：</label>
									<div class="col-sm-9">
										<select class="col-xs-10 col-sm-5" id="isExceedAccept" name="isExceedAcceptInvestor" >
											<option value="1" >接收</option>
											<option value="2" >拒绝</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-3 control-label no-padding-right" id="acceptanceCode" name="acceptanceCode"  >定向邀请码：</label>
									<div class="col-sm-9">
										<input type="text" readonly="readonly" value="暂不开放" class="col-xs-10 col-sm-5">
									</div>
								</div>
								<div class="space-24"></div>
								<div class="clearfix form-actions">
									<label class="col-md-offset-1 col-md-3" ></label>
									<div class="col-md-offset-3 col-md-9">
										<button class="btn btn-info" id="saveBtn" type="button">
											<i class="icon-ok bigger-110"></i>
											&nbsp;&nbsp;&nbsp;保&nbsp;&nbsp;&nbsp;存&nbsp;&nbsp;&nbsp;
										</button>
									</div>
								</div>
								<script>
								$('.date-picker').datepicker({autoclose:true}).next().on(ace.click_event, function(){
									$(this).prev().focus();
								});
								</script>
								<div class="space-24"></div>
								<div class="space-24"></div>
							</form>
						</div>
					</div>
				</div>
			</div>
			</div>
		</div>
	</div>
</div>