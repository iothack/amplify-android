/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.datastore.storage.sqlite.model;

import com.amplifyframework.core.model.Model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains the set of model classes that implement {@link Model}
 * interface.
 */
public final class AmplifyModels {

    private static final long AMPLIFY_MODELS_VERSION = 1;

    /**
     * Dis-allows instantiation of this utility.
     */
    private AmplifyModels() {
    }

    /**
     * Return the set of model classes.
     * @return the set of model classes.
     */
    public static Set<Class<? extends Model>> get() {
        return new HashSet<>(Arrays.asList(
                Person.class,
                Person.class,
                Person.class
        ));
    }

    /**
     * Return the version of the Amplify Models.
     * @return the version of the Amplify Models.
     */
    public static long getAmplifyModelsVersion() {
        return AMPLIFY_MODELS_VERSION;
    }
}