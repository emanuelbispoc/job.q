package io.jobq;

import java.util.Collections;
import java.util.List;

public class JobDetails {

    private final String className;
    private final String methodName;
    private final List<JobParameter> jobParameters;

    public JobDetails(String className, String methodName, List<JobParameter> jobParameters) {
        this.className = className;
        this.methodName = methodName;
        this.jobParameters = jobParameters;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public List<JobParameter> getJobParameters() {
        return Collections.unmodifiableList(jobParameters);
    }
}
