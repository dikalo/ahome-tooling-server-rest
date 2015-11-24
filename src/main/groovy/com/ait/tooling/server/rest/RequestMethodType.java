/*
 * Copyright (c) 2014,2015,2016 Ahome' Innovation Technologies. All rights reserved.
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

package com.ait.tooling.server.rest;

import com.ait.tooling.common.api.types.IStringValued;

public enum RequestMethodType implements IStringValued
{
    GET("GET"), POST("POST"), PUT("PUT"), DELETE("DELETE"), HEAD("HEAD");

    private final String m_value;

    private RequestMethodType(final String value)
    {
        m_value = value;
    }

    @Override
    public String getValue()
    {
        return m_value;
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
    
    public static final RequestMethodType[] getListOfRequestMethodTypes()
    {
        return new RequestMethodType[] {POST, GET, PUT, DELETE};
    }
    
    public static final RequestMethodType[] getDefaultRequestMethodTypes()
    {
        return new RequestMethodType[] {POST, GET};
    }
}
