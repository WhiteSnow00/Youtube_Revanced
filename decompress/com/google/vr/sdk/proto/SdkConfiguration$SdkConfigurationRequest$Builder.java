// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public final class SdkConfiguration$SdkConfigurationRequest$Builder extends ahaz implements ahcw
{
    private SdkConfiguration$SdkConfigurationRequest$Builder() {
        super((ahbh)SdkConfiguration$SdkConfigurationRequest.access$000());
    }
    
    public SdkConfiguration$SdkConfigurationRequest$Builder(final SdkConfiguration$1 sdkConfiguration$1) {
        this();
    }
    
    public SdkConfiguration$SdkConfigurationRequest$Builder setRequestedParams(final afqs afqs) {
        this.copyOnWrite();
        SdkConfiguration$SdkConfigurationRequest.access$400((SdkConfiguration$SdkConfigurationRequest)this.instance, afqs);
        return this;
    }
    
    public SdkConfiguration$SdkConfigurationRequest$Builder setSdkVersion(final String s) {
        this.copyOnWrite();
        SdkConfiguration$SdkConfigurationRequest.access$100((SdkConfiguration$SdkConfigurationRequest)this.instance, "1.219.0");
        return this;
    }
}
