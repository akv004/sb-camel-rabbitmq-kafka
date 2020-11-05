package com.my.demo.sbcamelrabbitmqkafka.data;

import java.io.Serializable;

public class DeltaMessage implements Serializable{
    private String event;
    private String occurred;
    private String resource;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getOccurred() {
        return occurred;
    }

    public void setOccurred(String occurred) {
        this.occurred = occurred;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "DeltaMessage{" +
                "event='" + event + '\'' +
                ", occurred='" + occurred + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }
}