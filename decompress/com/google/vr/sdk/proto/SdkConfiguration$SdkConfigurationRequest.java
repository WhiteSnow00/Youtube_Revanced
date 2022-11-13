// 
// Decompiled by Procyon v0.6.0
// 

package com.google.vr.sdk.proto;

import com.google.protobuf.MessageLite;

public final class SdkConfiguration$SdkConfigurationRequest extends ahbh implements ahcw
{
    private static final SdkConfiguration$SdkConfigurationRequest DEFAULT_INSTANCE;
    private static volatile ahdd PARSER;
    public static final int REQUESTED_PARAMS_FIELD_NUMBER = 2;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private afqs requestedParams_;
    private String sdkVersion_;
    
    static {
        ahbh.registerDefaultInstance((Class)SdkConfiguration$SdkConfigurationRequest.class, (ahbh)(DEFAULT_INSTANCE = new SdkConfiguration$SdkConfigurationRequest()));
    }
    
    private SdkConfiguration$SdkConfigurationRequest() {
        this.sdkVersion_ = "";
    }
    
    static SdkConfiguration$SdkConfigurationRequest access$000() {
        return SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE;
    }
    
    static void access$100(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest, final String s) {
        sdkConfiguration$SdkConfigurationRequest.setSdkVersion("1.219.0");
    }
    
    static void access$400(final SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest, final afqs requestedParams) {
        sdkConfiguration$SdkConfigurationRequest.setRequestedParams(requestedParams);
    }
    
    public static SdkConfiguration$SdkConfigurationRequest$Builder newBuilder() {
        return (SdkConfiguration$SdkConfigurationRequest$Builder)SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE.createBuilder();
    }
    
    private void setRequestedParams(final afqs requestedParams_) {
        requestedParams_.getClass();
        this.requestedParams_ = requestedParams_;
        this.bitField0_ |= 0x2;
    }
    
    private void setSdkVersion(final String s) {
        this.bitField0_ |= 0x1;
        this.sdkVersion_ = "1.219.0";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd parser;
                if ((parser = SdkConfiguration$SdkConfigurationRequest.PARSER) == null) {
                    synchronized (SdkConfiguration$SdkConfigurationRequest.class) {
                        if (SdkConfiguration$SdkConfigurationRequest.PARSER == null) {
                            SdkConfiguration$SdkConfigurationRequest.PARSER = (ahdd)new ahba((ahbh)SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE);
                        }
                    }
                }
                return parser;
            }
            case 5: {
                return SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE;
            }
            case 4: {
                return new SdkConfiguration$SdkConfigurationRequest$Builder(null);
            }
            case 3: {
                return new SdkConfiguration$SdkConfigurationRequest();
            }
            case 2: {
                return newMessageInfo((MessageLite)SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001", new Object[] { "bitField0_", "sdkVersion_", "requestedParams_" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
