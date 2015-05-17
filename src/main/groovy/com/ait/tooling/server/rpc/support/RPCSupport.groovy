/*
 * Copyright (c) 2014,2015 Ahome' Innovation Technologies. All rights reserved.
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

package com.ait.tooling.server.rpc.support

import groovy.transform.CompileStatic
import groovy.transform.Memoized

import com.ait.tooling.server.core.support.CoreGroovySupport
import com.ait.tooling.server.rpc.IJSONCommand
import com.ait.tooling.server.rpc.support.spring.ICommandRegistry
import com.ait.tooling.server.rpc.support.spring.IRPCContext
import com.ait.tooling.server.rpc.support.spring.RPCContextInstance

@CompileStatic
/**
 * RPCSupport - Support class in Groovy that exposes common RPC methods, but Memoized for efficiency.
 */
public class RPCSupport extends CoreGroovySupport implements Serializable
{
    private static final RPCSupport INSTANCE            = new RPCSupport()

    private static final long       serialVersionUID    = 5087370226603028208L

    @Memoized
    public static final RPCSupport getRPCSupport()
    {
        INSTANCE
    }

    @Memoized
    public IRPCContext getRPCContext()
    {
        RPCContextInstance.get()
    }

    @Memoized
    public ICommandRegistry getCommandRegistry()
    {
        getRPCContext().getCommandRegistry()
    }

    @Memoized
    public IJSONCommand getCommand(String name)
    {
        getCommandRegistry().getCommand(name)
    }
}