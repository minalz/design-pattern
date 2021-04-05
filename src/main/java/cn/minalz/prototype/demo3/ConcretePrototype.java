package cn.minalz.prototype.demo3;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 使用序列化实现深度克隆
 * @author: minalz
 * @date: 2021-04-05 16:44
 **/
@Data
public class ConcretePrototype implements Cloneable, Serializable {

    private int age;
    private String name;
    private List<String> hobbies;

    @Override
    public ConcretePrototype clone() {
        try {
            return (ConcretePrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            return (ConcretePrototype)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public ConcretePrototype deepCloneHobbies() {
        try {
            ConcretePrototype result = (ConcretePrototype)super.clone();
            result.hobbies = (List)((ArrayList) result.hobbies).clone();
            return result;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
