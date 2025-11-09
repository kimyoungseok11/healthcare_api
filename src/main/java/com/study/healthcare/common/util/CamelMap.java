package com.study.healthcare.common.util;

import org.apache.commons.collections4.map.ListOrderedMap;
import org.apache.ibatis.type.Alias;
import org.springframework.jdbc.support.JdbcUtils;

@Alias("camelMap")
public class CamelMap extends ListOrderedMap {
	
	 /** serialVersionUID */
    private static final long serialVersionUID = -7700790403928325865L;
 
    
    public Object put(Object key, Object value) {
    	Object result = null;
    	
    	if(!("0".equals(value) || value == null)) {
    		if(key.toString().contains("_")) {
    			//언더바 포함시 camelCase 적용
        		result = super.put(JdbcUtils.convertUnderscoreNameToPropertyName((String)key), value);
    		} else if(Character.isUpperCase(key.toString().charAt(0))) {
    			//첫자가 대문자 일 시 모두 소문자로 변경
        		result = super.put(((String)key).toLowerCase(), value);
    		} else {
    			result = super.put(key, value);
    		}
    	}
    	
        return result;
    }
	
}
