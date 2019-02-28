<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">Brand</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="active"><a href="viewDemand">create Demand <span class="sr-only">(current)</span></a></li>
				<li><a href="interview">Interviews</a></li>
				<li><a href="viewProject">Projects</a></li>
				<li><a href="#">Resources</a></li>
				<li><a href="#">Account</a></li>
				<li><a href="#">Trainnings</a></li>
				<li><a href="#">SOW</a></li>
				<li><a href="#">Invoices</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Dropdown <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="/interview">Interview</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">One more separated link</a></li>
					</ul></li>
			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#">Link</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Dropdown <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
					</ul></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid -->
</nav>

<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="/res/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
 <div class="container-fluid">
		<div class="row">
			<div class="col-sm-4 col-md-3">
				<h4>Update Trainning Status</h4>
				<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Search</button>
			</form>
				<form   action="/saveTrainning" method="POST"
					class="well">
					<!-- Form Name -->
					<hidden path="id" />

					<!-- Text input-->
				<div class="form-group">
						<label for="user_name">Trainning Name</label>
						<input id="demand_name" name="demand_name" path="demand_name"
							type="text" placeholder="Enter Demand Name" value=""
							class="form-control input-md" />
					</div>

					<!-- Text input-->
				<div class="form-group">
						<label for="user_email">Module name</label>
						<input id="demand_description" name="demand_description" path="demand_description"
							type="text" placeholder="Enter Description" value=""
							class="form-control input-md" />
					</div> 

					<!-- Text input-->
				<div class="form-group">
						<label>Start Date</label>
						<input id="dd_res_strength" name="dd_res_strength"
							path="dd_res_strength" type="text" placeholder="Enter Strength"
							value="" class="form-control input-md" />
					</div>
						<!-- Text input-->
					<div class="form-group">
						<label>End Date</label>
						<input id="dd_res_skillset" name="dd_res_skillset"
							path="dd_res_skillset" type="text" placeholder="Enter SkillSet"
							value="" class="form-control input-md" />
					</div>
					<!-- Button (Double) -->
				<div class="form-group">
						<input type="submit" id="submit" name="submit"
							class="btn btn-success"/> <input type="reset" name="clear"
							class="btn btn-danger" />
					</div>
					<!-- Text input-->
					</form>

			</div>
			<div class="col-sm-13 col-md-13">
				<h4>Trainning Status Details: </h4>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>course Completed</th>
								<th>Powr User Baisc</th>
								<th>Mastering Business Process With RPA</th>
								<th>RPA Core(4)</th>
								<th>RPA Applications(4)			
								</th>
								<th>ML Basics(2 days)			
								</th>
								<th>ML Automation(1)			
								</th>
								<th>AE Specialist Certification (2)			
								</th>
								<th>Expected End Date
								</th>
								<th>Actual End Date
								</th>
							</tr>
							<tr>
							<th>Id</th>
								<th>Yogesh</th>
								<th>70%</th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								<th><table class="table-bordered" style="font-size: 12px"><tr><th>Actual Start Date</th><th>Actual End Date</th></tr></table></th>
								
								<th></th>
								<th></th>								
							
							</tr>
						</thead>
						<tbody>

							<c:forEach var="dem" items="${demandlist}">
	
		
<tr><td></td><td></td><td></td><td><input type="Date" id="AstartDate"/><input type="Date" id="AendDate"/></td><td>1</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></td></tr>
								<%-- <tr>
									<td>${dem.id}</td>
									<td>${dem.demand_name}</td>
									<td>${dem.demand_description}</td>
									<td>${dem.dd_res_strength}</td>
									<td>${dem.dd_res_skillset}</td>
									<td style="text-align: center"><a
										href="deletedemand?id=${dem.id}"
										onclick="if (!(confirm('Are you sure you want to delete this Demand?'))) return false">
											<button type="button" class="btn btn-danger btn-sm">
												<span class="glyphicon glyphicon-trash"></span>
											</button>
									</a>

									<a
										href="viewDemand?id=${dem.id}"
										onclick="if (!(confirm('Are you sure you want to edit this Demand?'))) return false">
											<button type="button" class="btn btn-warning btn-sm">
												<span class="glyphicon glyphicon-pencil"></span>
											</button>
									</a></td>
								</tr> --%>
							</c:forEach> 
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="/res/js/bootstrap.min.js"></script>
</body>
</html>