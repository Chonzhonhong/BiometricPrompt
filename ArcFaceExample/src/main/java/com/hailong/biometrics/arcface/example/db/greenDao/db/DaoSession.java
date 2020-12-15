package com.hailong.biometrics.arcface.example.db.greenDao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.hailong.biometrics.arcface.example.db.entity.TbUserFace;

import com.hailong.biometrics.arcface.example.db.greenDao.db.TbUserFaceDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig tbUserFaceDaoConfig;

    private final TbUserFaceDao tbUserFaceDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        tbUserFaceDaoConfig = daoConfigMap.get(TbUserFaceDao.class).clone();
        tbUserFaceDaoConfig.initIdentityScope(type);

        tbUserFaceDao = new TbUserFaceDao(tbUserFaceDaoConfig, this);

        registerDao(TbUserFace.class, tbUserFaceDao);
    }
    
    public void clear() {
        tbUserFaceDaoConfig.clearIdentityScope();
    }

    public TbUserFaceDao getTbUserFaceDao() {
        return tbUserFaceDao;
    }

}