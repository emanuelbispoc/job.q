package io.jobq;

import io.jobq.lambdas.JobRunnable;

public interface IJobDetailsGenerator {
    JobDetails toJobDetails(JobRunnable runnable);
}
