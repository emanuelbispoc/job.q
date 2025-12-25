package io.jobq;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

public class SerializedLambdaConverter {

    private SerializedLambdaConverter(){};

    public static <T> SerializedLambda toSerializedLambda(T value) {

        try {

            Method writeReplaceMethod = value.getClass().getDeclaredMethod("writeReplace");
            writeReplaceMethod.setAccessible(true);

            return (SerializedLambda) writeReplaceMethod.invoke(value);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
