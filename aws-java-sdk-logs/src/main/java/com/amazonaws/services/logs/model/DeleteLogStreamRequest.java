/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#deleteLogStream(DeleteLogStreamRequest) DeleteLogStream operation}.
 * <p>
 * Deletes a log stream and permanently deletes all the archived log
 * events associated with it.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#deleteLogStream(DeleteLogStreamRequest)
 */
public class DeleteLogStreamRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    private String logGroupName;

    private String logStreamName;

    /**
     * Default constructor for a new DeleteLogStreamRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteLogStreamRequest() {}
    
    /**
     * Constructs a new DeleteLogStreamRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param logGroupName
     * @param logStreamName
     */
    public DeleteLogStreamRequest(String logGroupName, String logStreamName) {
        setLogGroupName(logGroupName);
        setLogStreamName(logStreamName);
    }

    /**
     * Returns the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The value of the LogGroupName property for this object.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * Sets the value of the LogGroupName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The new value for the LogGroupName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteLogStreamRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Returns the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return The value of the LogStreamName property for this object.
     */
    public String getLogStreamName() {
        return logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     */
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }
    
    /**
     * Sets the value of the LogStreamName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param logStreamName The new value for the LogStreamName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteLogStreamRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getLogStreamName() != null) sb.append("LogStreamName: " + getLogStreamName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getLogStreamName() == null) ? 0 : getLogStreamName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteLogStreamRequest == false) return false;
        DeleteLogStreamRequest other = (DeleteLogStreamRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getLogStreamName() == null ^ this.getLogStreamName() == null) return false;
        if (other.getLogStreamName() != null && other.getLogStreamName().equals(this.getLogStreamName()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteLogStreamRequest clone() {
        
            return (DeleteLogStreamRequest) super.clone();
    }

}
    