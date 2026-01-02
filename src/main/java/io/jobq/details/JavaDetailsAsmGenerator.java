package io.jobq.details;

import io.jobq.IJobDetailsGenerator;
import io.jobq.JobDetails;
import io.jobq.lambdas.JobRunnable;

public class JavaDetailsAsmGenerator implements IJobDetailsGenerator {

    @Override
    public JobDetails toJobDetails(JobRunnable runnable) {
        return new JavaDetailsFinder(runnable, SerializedLambdaConverter.toSerializedLambda(runnable)).getJobDetails();
    }
}
