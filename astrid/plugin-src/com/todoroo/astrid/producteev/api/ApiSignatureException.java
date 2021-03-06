package com.todoroo.astrid.producteev.api;


/**
 * Exception that wraps a 403 exception
 *
 * @author timsu
 *
 */
public class ApiSignatureException extends ApiServiceException {

    private static final long serialVersionUID = 4320984373933L;

    public ApiSignatureException(String detailMessage) {
        super(detailMessage);
    }

}
