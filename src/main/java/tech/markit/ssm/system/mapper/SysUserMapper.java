package tech.markit.ssm.system.mapper;

import org.springframework.stereotype.Repository;
import tech.markit.ssm.system.entity.SysUser;

import java.util.List;


/**
 * @Entity tech.markit.ssm.system.entity.SysUser
 */
@Repository
public interface SysUserMapper {
    public List<SysUser> getAll();
}




