/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.search.aggregations.support;

/**
 *
 */
public enum ScriptValueType {

    STRING(ValuesSource.Bytes.class),
    LONG(ValuesSource.Numeric.class),
    DOUBLE(ValuesSource.Numeric.class);

    final Class<? extends ValuesSource> valuesSourceType;

    private ScriptValueType(Class<? extends ValuesSource> valuesSourceType) {
        this.valuesSourceType = valuesSourceType;
    }

    public Class<? extends ValuesSource> getValuesSourceType() {
        return valuesSourceType;
    }

    public boolean isNumeric() {
        return this != STRING;
    }

    public boolean isFloatingPoint() {
        return this == DOUBLE;
    }
}
