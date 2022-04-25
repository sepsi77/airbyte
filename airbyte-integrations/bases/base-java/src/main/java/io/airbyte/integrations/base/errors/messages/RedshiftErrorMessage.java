package io.airbyte.integrations.base.errors.messages;

import io.airbyte.integrations.base.errors.utils.ConnectorType;

import static io.airbyte.integrations.base.errors.utils.ConnectionErrorType.INCORRECT_DB_NAME;
import static io.airbyte.integrations.base.errors.utils.ConnectionErrorType.INCORRECT_HOST_OR_PORT;
import static io.airbyte.integrations.base.errors.utils.ConnectionErrorType.INCORRECT_USERNAME_OR_PASSWORD;
import static io.airbyte.integrations.base.errors.utils.ConnectorType.REDSHIFT;
import static io.airbyte.integrations.base.errors.utils.ConnectorType.SNOWFLAKE;

public class RedshiftErrorMessage implements ErrorMessage{
    static {
        CONSTANTS.put("28000", INCORRECT_USERNAME_OR_PASSWORD);
        CONSTANTS.put("HY000", INCORRECT_HOST_OR_PORT);
        CONSTANTS.put("3D000", INCORRECT_DB_NAME);
    }

    @Override
    public ConnectorType getConnectorType() {
        return REDSHIFT;
    }
}
