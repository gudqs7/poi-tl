package com.deepoove.poi.policy;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.template.ElementTemplate;

/**
 * @author wq
 * @date 2019-05-07
 * @description poi-tl
 */
public interface RenderPolicyWithTagName extends RenderPolicy {

    /**
     * @param eleTemplate 模板元素
     * @param data 数据
     * @param template 持有模板对象
     * @param tagName {{tagName}}
     */
    void render(ElementTemplate eleTemplate, Object data, XWPFTemplate template, String tagName);
}
