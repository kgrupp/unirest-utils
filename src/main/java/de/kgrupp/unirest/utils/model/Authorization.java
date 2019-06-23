package de.kgrupp.unirest.utils.model;

import de.kgrupp.monads.result.Result;
import de.kgrupp.unirest.utils.builder.RestBuilder;

public interface Authorization {
    boolean isBasic();

    void applyAuthorization(RestBuilder builder);

    boolean isValid();

    String getUserName();

    String getAuthorizationTypeIdentifier();

    Result<String> serialize();
}
