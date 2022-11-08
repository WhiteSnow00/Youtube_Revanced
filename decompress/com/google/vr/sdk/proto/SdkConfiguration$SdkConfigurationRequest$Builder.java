// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

public final class SdkConfiguration$SdkConfigurationRequest$Builder extends agza implements ahax
{
    private SdkConfiguration$SdkConfigurationRequest$Builder() {
        super((agzi)SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE);
    }
    
    public SdkConfiguration$SdkConfigurationRequest$Builder setRequestedParams(final afor afor) {
        this.copyOnWrite();
        ((SdkConfiguration$SdkConfigurationRequest)this.instance).setRequestedParams(afor);
        return this;
    }
    
    public SdkConfiguration$SdkConfigurationRequest$Builder setSdkVersion(final String s) {
        this.copyOnWrite();
        SdkConfiguration$SdkConfigurationRequest.access$100((SdkConfiguration$SdkConfigurationRequest)this.instance, "1.218.0");
        return this;
    }
}
