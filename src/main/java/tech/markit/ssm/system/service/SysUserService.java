package tech.markit.ssm.system.service;

import com.github.pagehelper.PageInfo;
import tech.markit.ssm.system.entity.SysUser;

import java.util.List;

/**
 *
 */
public interface SysUserService{
    public int add(SysUser user);
    public SysUser getById(String id);
    public void removeById(String id);
    public SysUser updateById(SysUser user);
    public List<SysUser> getAll();
    public PageInfo<SysUser> getListPage(int start,int num);
}
