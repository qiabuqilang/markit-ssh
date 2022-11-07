package tech.markit.ssm.system.service.impl;


import com.github.pagehelper.PageInfo;
import tech.markit.ssm.system.entity.SysUser;
import tech.markit.ssm.system.service.SysUserService;
import tech.markit.ssm.system.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class SysUserServiceImpl
implements SysUserService{
    public int add(SysUser user) {
        return 0;
    }

    public SysUser getById(String id) {
        return null;
    }

    public void removeById(String id) {

    }

    public SysUser updateById(SysUser user) {
        return null;
    }

    public List<SysUser> getAll() {
        return null;
    }

    public PageInfo<SysUser> getListPage(int start, int num) {
        return null;
    }
}




