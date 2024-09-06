package com.studyclub.auth.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.studyclub.auth.application.convert.AuthRolePermissionDTOConverter;
import com.studyclub.auth.application.dto.AuthRolePermissionDTO;
import com.studyclub.auth.domain.entity.AuthRolePermissionBO;
import com.studyclub.auth.domain.service.AuthRolePermissionDomainService;
import com.studyclub.auth.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author: xgt
 * @CreateTime: 2024-08-31
 * @Description:角色权限controller
 * @Version: 1.0
 */
@RestController
@RequestMapping("/rolePermission/")
@Slf4j
public class RolePermissionController {

    @Resource
    private AuthRolePermissionDomainService authRolePermissionDomainService;

    /**
     * 新增角色权限关联关系
     */
    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthRolePermissionDTO authRolePermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("RolePermissionController.add.dto:{}", JSON.toJSONString(authRolePermissionDTO));
            }
            Preconditions.checkArgument(!CollectionUtils.isEmpty(authRolePermissionDTO.getPermissionIdList()),"权限关联不能为空");
            Preconditions.checkNotNull(authRolePermissionDTO.getRoleId(),"角色不能为空!");
            AuthRolePermissionBO rolePermissionBO = new AuthRolePermissionBO();
            rolePermissionBO.setRoleId(authRolePermissionDTO.getRoleId());
            rolePermissionBO.setPermissionId(authRolePermissionDTO.getPermissionId());
            rolePermissionBO.setPermissionIdList(authRolePermissionDTO.getPermissionIdList());
            rolePermissionBO.setId(authRolePermissionDTO.getId());
            return Result.ok(authRolePermissionDomainService.add(rolePermissionBO));
        } catch (Exception e) {
            log.error("PermissionController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增角色权限失败");
        }
    }

}
