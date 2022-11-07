<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@include file="/WEB-INF/views/common/header.jsp"%>

<body>
<div class="container-scroller">
    <!-- partial:partials/_navbar.html -->
    <%@include file="/WEB-INF/views/common/navbar.jsp"%>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_sidebar.html -->
        <%@include file="/WEB-INF/views/common/nav.jsp"%>
        <!-- partial -->
        <div class="main-panel">
            中文乱码
            <!-- content-wrapper ends -->
            <!-- partial:partials/_footer.html -->
            <%@include file="/WEB-INF/views/common/footer.jsp"%>
            <!-- partial -->
        </div>
        <!-- main-panel ends -->
    </div>
    <!-- page-body-wrapper ends -->
</div>
<%@include file="/WEB-INF/views/common/commonjs.jsp"%>
</body>

</html>
