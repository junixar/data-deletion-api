package dev.fbd.datadeletion;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class EvaluationResult {

    private final boolean successful;

    private final Optional<String> errorMessage;

    private EvaluationResult(boolean successful, String errorMessage) {
        this.successful = successful;
        this.errorMessage = StringUtils.isNotBlank(errorMessage) ? Optional.of(errorMessage) : Optional.empty();
    }

    public boolean isSuccessful() {
        return successful;
    }

    public Optional<String> getErrorMessage() {
        return errorMessage;
    }

    public static EvaluationResult success() {
        return new EvaluationResult(true, null);
    }

    public static EvaluationResult fail(String errorMessage) {
        return new EvaluationResult(false, errorMessage);
    }
}
