package cn.minalz.designPrinciples.simple;

import org.apache.commons.lang3.StringUtils;

/**
 * @description:
 * @author: minalz
 * @date: 2021-04-03 00:11
 **/
public class CourseFactory {

    /*public static ICourse create(String name) {
        if("java".equals(name)) {
            return new JavaCourse();
        }else if("python".equals(name)) {
            return new PythonCourse();
        }else {
            return null;
        }
    }*/

    /*public static ICourse create(String className) {
        try {
            if (StringUtils.isNotEmpty(className)) {
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public static ICourse create(Class<? extends  ICourse> clazz) {
        try {
            if ( clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
