package io.jobq;

public class JobParameter {

    private String className;
    private String actualClassName;
    private Object object;

    public JobParameter(String className, String actualClassName, Object object) {
        this.className = className;
        this.actualClassName = actualClassName;
        this.object = object;
    }

    public String getClassName() {
        return className;
    }

    public String getActualClassName() {
        return actualClassName;
    }

    public Object getObject() {
        return object;
    }
}
