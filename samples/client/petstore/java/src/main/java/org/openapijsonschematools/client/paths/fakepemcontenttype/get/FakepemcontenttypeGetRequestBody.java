package org.openapijsonschematools.client.paths.fakepemcontenttype.get;

import org.openapijsonschematools.client.exceptions.NotImplementedException;
import org.openapijsonschematools.client.requestbody.RequestBodySerializer;
import org.openapijsonschematools.client.requestbody.GenericRequestBody;
import org.openapijsonschematools.client.requestbody.SerializedRequestBody;
import org.openapijsonschematools.client.mediatype.MediaType;
import org.openapijsonschematools.client.paths.fakepemcontenttype.get.requestbody.content.applicationxpemfile.ApplicationxpemfileSchema;

import java.util.AbstractMap;
import java.util.Map;

public class FakepemcontenttypeGetRequestBody {
    public sealed interface SealedMediaType permits ApplicationxpemfileMediaType {}

    public record ApplicationxpemfileMediaType(ApplicationxpemfileSchema.ApplicationxpemfileSchema1 schema) implements SealedMediaType, MediaType<ApplicationxpemfileSchema.ApplicationxpemfileSchema1, Void> {
        public ApplicationxpemfileMediaType() {
            this(ApplicationxpemfileSchema.ApplicationxpemfileSchema1.getInstance());
        }
        @Override
        public Void encoding() {
            return null;
        }
    }

    public static class FakepemcontenttypeGetRequestBody1 extends RequestBodySerializer<SealedRequestBody, SealedMediaType> {
        public FakepemcontenttypeGetRequestBody1() {
            super(
                Map.ofEntries(
                    new AbstractMap.SimpleEntry<>("application/x-pem-file", new ApplicationxpemfileMediaType())
                ),
                false
            );
        }

        public SerializedRequestBody serialize(SealedRequestBody requestBody) throws NotImplementedException  {
            ApplicationxpemfileRequestBody requestBody0 = (ApplicationxpemfileRequestBody) requestBody;
            return serialize(requestBody0.contentType(), requestBody0.body().getData());
        }
    }

    public sealed interface SealedRequestBody permits ApplicationxpemfileRequestBody {}
    public record ApplicationxpemfileRequestBody(ApplicationxpemfileSchema.StringJsonSchema1Boxed body) implements SealedRequestBody, GenericRequestBody<ApplicationxpemfileSchema.StringJsonSchema1Boxed> {
        @Override
        public String contentType() {
            return "application/x-pem-file";
        }
    }
}
