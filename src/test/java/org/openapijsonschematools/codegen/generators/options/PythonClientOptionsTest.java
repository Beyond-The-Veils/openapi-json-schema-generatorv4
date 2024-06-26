/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapijsonschematools.codegen.generators.options;

import org.openapijsonschematools.codegen.generators.Generator;
import org.openapijsonschematools.codegen.generators.PythonClientGenerator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;


public class PythonClientOptionsTest extends AbstractOptionsTest<PythonClientGenerator> {
    public PythonClientOptionsTest() {
        super(new PythonClientOptionsProvider());
    }

    @Override
    protected PythonClientGenerator getCodegenConfig() {
        return new PythonClientGenerator(optionsProvider.createGeneratorInput(), optionsProvider.createWorkflowInput());
    }

    @Override
    protected void verifyOptions(PythonClientGenerator spyGen) {
        verify(spyGen).setPackageVersion(PythonClientOptionsProvider.PACKAGE_VERSION_VALUE);
    }
}

