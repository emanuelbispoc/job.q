package io.jobq;

public class JobDetailsBuilder {

    private String jobDetailsClassName;
    private String jobDetailsMethodName;

    public JobDetailsBuilder(String jobDetailsClassName, String jobDetailsMethodName) {
        this.jobDetailsClassName = jobDetailsClassName;
        this.jobDetailsMethodName = jobDetailsMethodName;
    }

    public JobDetails getJobDetails() {
        return new JobDetails(jobDetailsClassName, jobDetailsMethodName);
    }
}
