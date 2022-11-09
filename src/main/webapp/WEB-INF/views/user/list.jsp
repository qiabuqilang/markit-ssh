<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<%@include file="/WEB-INF/views/common/header.jsp"%>
<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

    <!-- Preloader -->
    <div class="preloader flex-column justify-content-center align-items-center">
        <img class="animation__shake" src="dist/img/AdminLTELogo.png" alt="AdminLTELogo" height="60" width="60">
    </div>

    <!-- Navbar -->
    <%@include file="/WEB-INF/views/common/navbar.jsp"%>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <%@include file="/WEB-INF/views/common/aside.jsp"%>
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1 class="m-0">Dashboard</h1>
                    </div><!-- /.col -->
                    <div class="col-sm-6">
                        <ol class="breadcrumb float-sm-right">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item active">Dashboard v1</li>
                        </ol>
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.container-fluid -->
        </div>
        <!-- /.content-header -->
        <button type="button" class="btn btn-default" data-toggle="modal" data-target="#modal-default">
            增加
        </button>
        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">

            </div><!-- /.container-fluid -->
        </section>
        <!-- /.content -->
        <div class="modal fade" id="modal-default">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title">Default Modal</h4>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="card-body">
                                <div class="form-group">
                                    <label for="username">用户名</label>
                                    <input type="text" class="form-control" id="username" placeholder="用户名">
                                </div>
                                <div class="form-group">
                                    <label for="password">密码</label>
                                    <input type="password" class="form-control" id="password" placeholder="密码">
                                </div>
                                <div class="form-group">
                                    <label for="repassword">确认密码</label>
                                    <input type="password" class="form-control" id="repassword" placeholder="确认密码">
                                </div>

                                <div class="form-group">
                                    <label for="realname">真实姓名</label>
                                    <input type="text" class="form-control" id="realname" placeholder="真实姓名">
                                </div>

                                <div class="form-group">
                                    <label for="workNo">工号</label>
                                    <input type="text" class="form-control" id="workNo" placeholder="工号">
                                </div>

                                <div class="form-group">
                                    <label for="email">邮件</label>
                                    <input type="text" class="form-control" id="email" placeholder="邮件">
                                </div>

                                <div class="form-group">
                                    <label for="realname">手机号码</label>
                                    <input type="text" class="form-control" id="mobile" placeholder="手机号码">
                                </div>

                                <div class="form-group">
                                    <label>性别</label>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gender" value="0">
                                        <label class="form-check-label">男</label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="gender" checked="" value="1">
                                        <label class="form-check-label">女</label>
                                    </div>
                                </div>

                                <div class="input-group">
                                    <div class="custom-file">
                                        <input type="file" class="custom-file-input" id="avaterUrl">
                                        <label class="custom-file-label" for="avaterUrl">上传头像</label>
                                    </div>
                                    <div class="input-group-append">
                                        <span class="input-group-text">上传</span>
                                    </div>
                                </div>

                            </div>
                            <!-- /.card-body -->


                        </form>
                    </div>
                    <div class="modal-footer justify-content-between">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                        <button type="button" class="btn btn-primary" onclick="sub()">保存</button>
                    </div>
                </div>
                <!-- /.modal-content -->
            </div>
            <!-- /.modal-dialog -->
        </div>
    </div>
    <!-- /.content-wrapper -->
    <%@include file="/WEB-INF/views/common/footer.jsp"%>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<%@include file="/WEB-INF/views/common/commonjs.jsp"%>
<script>
    $({

    })
</script>
</body>
</html>

