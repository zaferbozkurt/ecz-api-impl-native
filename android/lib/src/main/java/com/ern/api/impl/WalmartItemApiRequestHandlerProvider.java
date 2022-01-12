/*
 * Copyright 2020 Walmart Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ern.api.impl;

import android.support.annotation.Nullable;

/**
 * A generated placeholder for your WalmartItem implementation.
 *
 * <p>Feel free to modify this class contents as needed. regen-api-impl WILL NOT modify the content
 * of this class. Do not change the class name as the naming convention is used for container
 * generation.
 */
public class WalmartItemApiRequestHandlerProvider
        extends RequestHandlerProvider<WalmartItemApiRequestHandlerProvider.WalmartItemApiConfig>
        implements WalmartItemApiRequestHandler {
    /**
     * @param requestHandlerConfig Optional config to be passed to an api impl provider.
     */
    WalmartItemApiRequestHandlerProvider(
            @Nullable WalmartItemApiRequestHandlerProvider.WalmartItemApiConfig requestHandlerConfig) {
        super(requestHandlerConfig);
    }

    @Override
    public void registerFindItemsRequestHandler() {
        // TODO
    }

    @Override
    public void registerAddItemRequestHandler() {
        // TODO
    }

    // DO NOT rename this class as this naming convention is used when a container is generated.
    public static class WalmartItemApiConfig implements RequestHandlerConfig {
    }
}
