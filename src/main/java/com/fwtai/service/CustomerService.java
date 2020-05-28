package com.fwtai.service;

import com.fwtai.bean.PageFormData;
import com.fwtai.config.ConfigFile;
import com.fwtai.dao.DaoHandle;
import com.fwtai.tool.ToolClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @作者 田应平
 * @版本 v1.0
 * @创建时间 2020-05-17 11:16
 * @QQ号码 444141300
 * @Email service@dwlai.com
 * @官网 http://www.fwtai.com
 */
@Service
public class CustomerService{

    @Autowired
    private DaoHandle daoHandle;

    public String getListData(PageFormData params){
        params = ToolClient.dataMysql(params);
        if(params == null)return ToolClient.jsonValidateField();
        final HashMap<String,Object> map = daoHandle.queryForPage(params,"customer.getListData","customer.getListTotal");
        return ToolClient.jsonPage(map.get(ConfigFile.data),(Integer) map.get(ConfigFile.total));
    }

    public String update(final PageFormData params){
        final int rows = daoHandle.execute("customer.update",params);
        return ToolClient.executeRows(rows);
    }
}