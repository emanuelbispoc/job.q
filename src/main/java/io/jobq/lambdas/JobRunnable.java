package io.jobq.lambdas;

import java.io.Serializable;

@FunctionalInterface
public interface JobRunnable extends Serializable {
    void run();
}