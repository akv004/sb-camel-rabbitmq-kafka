package com.my.demo.sbcamelrabbitmqkafka.processor;
import com.my.demo.sbcamelrabbitmqkafka.data.DeltaMessage;
import org.springframework.util.StringUtils;

public class ResourceProcessor {
    public String getResource(DeltaMessage dm){
      if(dm.getResource()!= null && !StringUtils.isEmpty(dm.getResource())){
        return dm.getResource().replace("http","http4");
      }else{
        return null;
      }
    }
}