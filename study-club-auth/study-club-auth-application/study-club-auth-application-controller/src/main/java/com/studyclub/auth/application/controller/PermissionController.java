package com.studyclub.auth.application.controller;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.studyclub.auth.application.convert.AuthPermissionDTOConverter;
import com.studyclub.auth.application.dto.AuthPermissionDTO;
import com.studyclub.auth.domain.entity.AuthPermissionBO;
import com.studyclub.auth.domain.service.AuthPermissionDomainService;
import com.studyclub.auth.entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @Author: xgt
 * @CreateTime: 2024-08-31
 * @Description:权限controller
 * @Version: 1.0
 */
@RestController
@RequestMapping("/permission/")
@Slf4j
public class PermissionController {

    @Resource
    private AuthPermissionDomainService authPermissionDomainService;

    /**
     * 新增权限
     */
    @RequestMapping("add")
    public Result<Boolean> add(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("PermissionController.add.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            Preconditions.checkArgument(!StringUtils.isBlank(authPermissionDTO.getName()), "权限名称不能为空");
            Preconditions.checkNotNull(authPermissionDTO.getParentId(), "权限父id不能为空");
            AuthPermissionBO authPermissionBO = new AuthPermissionBO();
            authPermissionBO.setId(authPermissionDTO.getId());
            authPermissionBO.setPermissionKey(authPermissionDTO.getPermissionKey());
            authPermissionBO.setIcon(authPermissionDTO.getIcon());
            authPermissionBO.setName(authPermissionDTO.getName());
            authPermissionBO.setShow(authPermissionDTO.getShow());
            authPermissionBO.setStatus(authPermissionDTO.getStatus());
            authPermissionBO.setType(authPermissionDTO.getType());
            authPermissionBO.setMenuUrl(authPermissionDTO.getMenuUrl());
            authPermissionBO.setParentId(authPermissionDTO.getParentId());
            return Result.ok(authPermissionDomainService.add(authPermissionBO));
        } catch (Exception e) {
            log.error("PermissionController.add.error:{}", e.getMessage(), e);
            return Result.fail("新增权限失败");
        }
    }

    /**
     * 修改权限
     */
    @RequestMapping("update")
    public Result<Boolean> update(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("PermissionController.update.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            Preconditions.checkNotNull(authPermissionDTO.getId(), "权限id不能为空");
            AuthPermissionBO permissionBO = AuthPermissionDTOConverter.INSTANCE.convertDTOToBO(authPermissionDTO);
            return Result.ok(authPermissionDomainService.update(permissionBO));
        } catch (Exception e) {
            log.error("PermissionController.update.error:{}", e.getMessage(), e);
            return Result.fail("更新权限信息失败");
        }
    }

    /**
     * 删除权限
     */
    @RequestMapping("delete")
    public Result<Boolean> delete(@RequestBody AuthPermissionDTO authPermissionDTO) {
        try {
            if (log.isInfoEnabled()) {
                log.info("PermissionController.delete.dto:{}", JSON.toJSONString(authPermissionDTO));
            }
            Preconditions.checkNotNull(authPermissionDTO.getId(), "权限id不能为空");
            AuthPermissionBO permissionBO = AuthPermissionDTOConverter.INSTANCE.convertDTOToBO(authPermissionDTO);
            return Result.ok(authPermissionDomainService.delete(permissionBO));
        } catch (Exception e) {
            log.error("PermissionController.delete.error:{}", e.getMessage(), e);
            return Result.fail("删除权限信息失败");
        }
    }

    /**
     * 查询用户权限
     */
    @RequestMapping("getPermission")
    public Result<Boolean> getPermission(String userName) {
        try {
            log.info("PermissionController.getPermission.userName:{}",userName);
            Preconditions.checkArgument(!StringUtils.isBlank(userName), "用户id不能为空");
            return Result.ok(authPermissionDomainService.getPermission(userName));
        } catch (Exception e) {
            log.error("PermissionController.getPermission.error:{}", e.getMessage(), e);
            return Result.fail("查询用户权限信息失败");
        }
    }

}
