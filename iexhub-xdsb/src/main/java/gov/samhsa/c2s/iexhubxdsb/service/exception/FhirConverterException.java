package gov.samhsa.c2s.iexhubxdsb.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class FhirConverterException extends RuntimeException {
    public FhirConverterException() {
    }

    public FhirConverterException(String message) {
        super(message);
    }

    public FhirConverterException(String message, Throwable cause) {
        super(message, cause);
    }

    public FhirConverterException(Throwable cause) {
        super(cause);
    }

    public FhirConverterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
