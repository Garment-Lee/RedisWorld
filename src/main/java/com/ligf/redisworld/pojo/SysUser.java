package com.ligf.redisworld.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 系统用户
 * @author Garment
 * @date 2020年7月28日23:39:38
 */
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = -8255603757373442260L;

    /**用户uid*/
    private long uid;

    /**用户名*/
    private String userName;

    /**用户密码*/
    private String password;
}
