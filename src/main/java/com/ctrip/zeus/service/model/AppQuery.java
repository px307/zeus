package com.ctrip.zeus.service.model;

import com.ctrip.zeus.model.entity.App;
import org.unidal.dal.jdbc.DalException;

import java.util.List;

/**
 * @author:xingchaowang
 * @date: 3/7/2015.
 */
public interface AppQuery {

    App get(String name) throws DalException;

    App getById(long id) throws DalException;

    App getByAppId(String appId) throws DalException;

    List<App> getAll() throws DalException;

    List<App> getLimit(long fromId, int maxCount) throws DalException;

    List<App> getBy(String slbName, String virtualServerName) throws DalException;
}