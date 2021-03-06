/**
 * Copyright 2014 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.rest.client;

import com.gwtplatform.dispatch.rest.shared.HttpMethod;

/**
 * Used by test code to expose protected methods from {@link AbstractRestAction}.
 * The goal is to help clean up the test code.
 */
public abstract class ExposedRestAction<R> extends AbstractRestAction<R> {
    public ExposedRestAction(HttpMethod httpMethod, String rawServicePath) {
        super(httpMethod, rawServicePath);
    }

    @Override
    public void setBodyParam(Object value) {
        super.setBodyParam(value);
    }

    @Override
    public void addPathParam(String name, Object value) {
        super.addPathParam(name, value);
    }

    @Override
    public void addQueryParam(String name, Object value) {
        super.addQueryParam(name, value);
    }

    @Override
    public void addFormParam(String name, Object value) {
        super.addFormParam(name, value);
    }

    @Override
    public void addHeaderParam(String name, Object value) {
        super.addHeaderParam(name, value);
    }
}
