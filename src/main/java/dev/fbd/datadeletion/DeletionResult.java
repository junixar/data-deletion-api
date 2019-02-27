package dev.fbd.datadeletion;

import org.apache.commons.lang3.StringUtils;

import java.util.Optional;

public class DeletionResult {

    private final boolean successful;

    private final Optional<String> errorMessage;

    private DeletionResult(boolean successful, String errorMessage) {
        this.successful = successful;
        this.errorMessage = StringUtils.isNotBlank(errorMessage) ? Optional.of(errorMessage) : Optional.empty();
    }

    public boolean isSuccessful() {
        return successful;
    }

    public Optional<String> getErrorMessage() {
        return errorMessage;
    }

    public static DeletionResult success() {
        return new DeletionResult(true, null);
    }

    public static DeletionResult fail(String errorMessage) {
        return new DeletionResult(false, errorMessage);
    }
}
