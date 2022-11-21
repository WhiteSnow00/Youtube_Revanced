// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.elements.interfaces;

public final class PerformanceEventInfo
{
    final Long commandExtensionId;
    final JsPerformanceEventInfo jsPerformanceEventInfo;
    final Integer materializationCount;
    final Integer measurementCount;
    final String nodeIdentifier;
    final String templateUri;
    
    public PerformanceEventInfo(final String templateUri, final String nodeIdentifier, final Integer materializationCount, final Integer measurementCount, final Long commandExtensionId, final JsPerformanceEventInfo jsPerformanceEventInfo) {
        this.templateUri = templateUri;
        this.nodeIdentifier = nodeIdentifier;
        this.materializationCount = materializationCount;
        this.measurementCount = measurementCount;
        this.commandExtensionId = commandExtensionId;
        this.jsPerformanceEventInfo = jsPerformanceEventInfo;
    }
    
    public Long getCommandExtensionId() {
        return this.commandExtensionId;
    }
    
    public JsPerformanceEventInfo getJsPerformanceEventInfo() {
        return this.jsPerformanceEventInfo;
    }
    
    public Integer getMaterializationCount() {
        return this.materializationCount;
    }
    
    public Integer getMeasurementCount() {
        return this.measurementCount;
    }
    
    public String getNodeIdentifier() {
        return this.nodeIdentifier;
    }
    
    public String getTemplateUri() {
        return this.templateUri;
    }
    
    @Override
    public String toString() {
        final String templateUri = this.templateUri;
        final String nodeIdentifier = this.nodeIdentifier;
        final Integer materializationCount = this.materializationCount;
        final Integer measurementCount = this.measurementCount;
        final Long commandExtensionId = this.commandExtensionId;
        final String value = String.valueOf(this.jsPerformanceEventInfo);
        final StringBuilder sb = new StringBuilder("PerformanceEventInfo{templateUri=");
        sb.append(templateUri);
        sb.append(",nodeIdentifier=");
        sb.append(nodeIdentifier);
        sb.append(",materializationCount=");
        sb.append(materializationCount);
        sb.append(",measurementCount=");
        sb.append(measurementCount);
        sb.append(",commandExtensionId=");
        sb.append(commandExtensionId);
        sb.append(",jsPerformanceEventInfo=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
