// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class JsPerformanceEventInfo
{
    final Integer bindingExtensionId;
    final String functionName;
    final long identifier;
    final boolean isSynchronous;
    final String moduleIdentifier;
    final int statusCode;
    final String statusMessage;
    
    public JsPerformanceEventInfo(final long identifier, final int statusCode, final String statusMessage, final String moduleIdentifier, final String functionName, final boolean isSynchronous, final Integer bindingExtensionId) {
        this.identifier = identifier;
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
        this.moduleIdentifier = moduleIdentifier;
        this.functionName = functionName;
        this.isSynchronous = isSynchronous;
        this.bindingExtensionId = bindingExtensionId;
    }
    
    public Integer getBindingExtensionId() {
        return this.bindingExtensionId;
    }
    
    public String getFunctionName() {
        return this.functionName;
    }
    
    public long getIdentifier() {
        return this.identifier;
    }
    
    public boolean getIsSynchronous() {
        return this.isSynchronous;
    }
    
    public String getModuleIdentifier() {
        return this.moduleIdentifier;
    }
    
    public int getStatusCode() {
        return this.statusCode;
    }
    
    public String getStatusMessage() {
        return this.statusMessage;
    }
    
    @Override
    public String toString() {
        final long identifier = this.identifier;
        final int statusCode = this.statusCode;
        final String statusMessage = this.statusMessage;
        final String moduleIdentifier = this.moduleIdentifier;
        final String functionName = this.functionName;
        final boolean isSynchronous = this.isSynchronous;
        final Integer bindingExtensionId = this.bindingExtensionId;
        final StringBuilder sb = new StringBuilder("JsPerformanceEventInfo{identifier=");
        sb.append(identifier);
        sb.append(",statusCode=");
        sb.append(statusCode);
        sb.append(",statusMessage=");
        sb.append(statusMessage);
        sb.append(",moduleIdentifier=");
        sb.append(moduleIdentifier);
        sb.append(",functionName=");
        sb.append(functionName);
        sb.append(",isSynchronous=");
        sb.append(isSynchronous);
        sb.append(",bindingExtensionId=");
        sb.append(bindingExtensionId);
        sb.append("}");
        return sb.toString();
    }
}
