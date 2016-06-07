<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- DataTables CSS -->
<link rel="stylesheet" type="text/css"
	href="https://cdn.datatables.net/u/dt/jszip-2.5.0,pdfmake-0.1.18,dt-1.10.12,b-1.2.1,b-colvis-1.2.1,b-flash-1.2.1,b-html5-1.2.1,b-print-1.2.1,se-1.2.0/datatables.min.css" />

<!-- jQuery -->
<script type="text/javascript" charset="utf8"
	src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript"
	src="https://cdn.datatables.net/u/dt/jszip-2.5.0,pdfmake-0.1.18,dt-1.10.12,b-1.2.1,b-colvis-1.2.1,b-flash-1.2.1,b-html5-1.2.1,b-print-1.2.1,se-1.2.0/datatables.min.js"></script>
<!-- jQuery UI -->
<script type="text/javascript" charset="utf8"
	src="http://cdn.datatables.net/plug-ins/28e7751dbec/integration/jqueryui/dataTables.jqueryui.js"></script>

<!-- DataTables -->
<!-- <script type="text/javascript" charset="utf8" src="http://cdn.datatables.net/1.10.7/js/jquery.dataTables.js"></script> -->
<script type="text/javascript"
	src="https://cdn.datatables.net/u/dt/dt-1.10.12,af-2.1.2,b-1.2.1,b-colvis-1.2.1,b-print-1.2.1,cr-1.3.2,fc-3.2.2,fh-3.1.2,kt-2.1.2,r-2.1.0,rr-1.1.2,sc-1.4.2,se-1.2.0/datatables.js"></script>



<title>Insert title here</title>
</head>
<body>

	<!-- <p>Date: <input type="text" id="datepicker"></p> -->
	<!-- <p>預約編號: <input type="text" id="sch_id"></p> -->




	<!--  <input type="button" id="b1" value="date"> -->
	<!-- 	<input type="button" value="load" id="buttonLoad"> -->


	<table id="table_id" class="display" width="80%" align="center">
		<thead>
			<tr>
				<th>詳細</th>
				<th>排班編號</th>
				<th>醫師姓名</th>
				<th>門診日期</th>
				<th>預約時段</th>
				<th>預約人數</th>
				<th>門診狀態</th>
				<th>備註</th>

			</tr>
		</thead>

	</table>


</body>
<script type="text/javascript">



$(document).ready( function () {
   //alert('');
    $.ajax({
    	'type':'get',
		'url':'Scheduleservlet',
		'dataType' :'json',
		"data":{"action" : "getall"},
		'success':function(data){
			//console.log(data);
			var counter = 1;
			var table = $('#table_id').DataTable({
				language:{search: "搜索:"},
				 dom: 'Bfrtip',
				 "order": [[ 1, "desc" ]], //預設編號排序
				 buttons: [
				            {
				                text: '新增排班',
				                action: function ( e, dt, node, config ) {
				                    alert( 'Button activated' );
				                }
				            }
				        ],
				
		         data: data,
				columns: [
				{ data: 'button' },
				{ data: 'getSch_id' },
				{ data: 'Name' },
				{ data: 'C_date' },
				{ data: 'C_hours' },
				{ data: 'Appt_num' },
				{ data: 'Appt_status' },
				{ data: 'Memo' },
				
				          ],
				"iDisplayLength": 15,
				"columnDefs": [
			   {"className": "dt-center", "targets": "_all"}
				             ],
// 		"lengthMenu": [[10, 15, 50, -1], [10, 15, 50, "All"]]
				          
			});
		}
    })
} );

</script>

</html>