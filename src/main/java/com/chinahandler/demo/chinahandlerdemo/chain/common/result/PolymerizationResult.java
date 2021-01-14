package com.chinahandler.demo.chinahandlerdemo.chain.common.result;

import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppShareEntity;
import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppTokenEntity;
import com.chinahandler.demo.chinahandlerdemo.app.entity.EcAppVersionEntity;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTUserLoginEntity;
import com.chinahandler.demo.chinahandlerdemo.user.entity.CrmTWechatUserEntity;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 项目名称: chinahandlerdemo
 *
 * @ClassName PolymerizationResult
 * @Description
 * @Author wangyanwei wangyanwei003@chinasofti.com   @Date 2021/1/13 17:51
 */
@Slf4j
@Data
public class PolymerizationResult {

    private List<EcAppVersionEntity> ecAppVersionEntityList;

    private Integer ecAppVersionCount;

    private List<EcAppTokenEntity> ecAppTokenEntityList;

    private Integer ecAppTokenCount;

    private List<EcAppShareEntity> ecAppShareEntityList;

    private Integer ecAppShareCount;

    private List<CrmTUserLoginEntity> crmTUserLoginEntityList;

    private Integer crmTUserLoginCount;

    private List<CrmTWechatUserEntity> crmTWechatUserEntityList;

    private Integer crmTWechatUserCount;

}