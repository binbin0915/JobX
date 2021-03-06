/**
 * Copyright (c) 2015 The JobX Project
 * <p>
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jobxhub.common.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by benjobs on 2016/10/10.
 */
public class PingException extends BasicException {

    private static final long serialVersionUID = 2030063376333004234L;

    public PingException() {
        super();
    }

    public PingException(String msg) {
        super(msg);
    }

    public PingException(Throwable nestedThrowable) {
        super(nestedThrowable);
    }

    public PingException(String msg, Throwable nestedThrowable) {
        super(msg, nestedThrowable);
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream ps) {
        super.printStackTrace(ps);
    }

    @Override
    public void printStackTrace(PrintWriter pw) {
        super.printStackTrace(pw);
    }
}
