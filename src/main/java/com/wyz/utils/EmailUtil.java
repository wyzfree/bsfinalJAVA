/**
 * 工具类：Email 格式验证工具
 */
package com.wyz.utils;

import java.util.regex.Pattern;

public class EmailUtil {

    // 定义 Email 的正则表达式
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    /**
     * 验证电子邮件地址是否符合标准格式
     *
     * @param email 要验证的电子邮件地址
     * @return 如果符合格式返回 true，否则返回 false
     */
    public static boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}
