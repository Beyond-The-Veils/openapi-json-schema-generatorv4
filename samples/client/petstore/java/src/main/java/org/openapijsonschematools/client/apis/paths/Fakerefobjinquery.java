package org.openapijsonschematools.client.apis.paths;

import org.openapijsonschematools.client.apiclient.ApiClient;
import org.openapijsonschematools.client.configurations.ApiConfiguration;
import org.openapijsonschematools.client.configurations.SchemaConfiguration;
import org.openapijsonschematools.client.paths.fakerefobjinquery.FakerefobjinqueryGet;

public class Fakerefobjinquery extends ApiClient implements
    FakerefobjinqueryGet.GetOperation
{
    public Fakerefobjinquery(ApiConfiguration apiConfiguration, SchemaConfiguration schemaConfiguration) {
        super(apiConfiguration, schemaConfiguration);
    }
}