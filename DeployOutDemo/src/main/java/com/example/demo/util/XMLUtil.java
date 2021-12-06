package com.example.demo.util;

import com.example.demo.entity.DeployEntity;
import com.thoughtworks.xstream.XStream;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.List;

public class XMLUtil {
    /**
     　　* 将对象直接转换成String类型的 XML输出
     　　*
     　　* @param obj
     　　* @return
     　　*/
    private static XStream xStream = new XStream();
    public static String convertToXml(Object obj) {
        // 创建输出流
        StringWriter sw = new StringWriter();
        try {
        // 利用jdk中自带的转换类实现
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        // 格式化xml输出的格式
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // 将对象转换成输出流形式的xml
        marshaller.marshal(obj, sw);
        } catch (JAXBException e) {
        e.printStackTrace();
        }
        return sw.toString();
    }


    public static String deployBeanToXML(Object obj){
        //别名
        // xStream.alias("repairBillLists", NCRepairBillListVO.class);
        xStream.alias("repairBillList", List.class);
        xStream.alias("repairBill", DeployEntity.class);

        String xml = xStream.toXML(obj);
        return xml;
    }


}
