// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint extends ahbh implements ahcw
{
    public static final AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint a;
    public static final ahbf androidOsApplicationSettingsEndpoint;
    private static volatile ahdd d;
    public int b;
    public String c;
    private int e;
    
    static {
        final AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint a2 = new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
        ahbh.registerDefaultInstance((Class)AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class, (ahbh)(a = a2));
        androidOsApplicationSettingsEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 128828810, ahek.k, (Class)AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class);
    }
    
    private AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.d) == null) {
                    synchronized (AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class) {
                        if (AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.d == null) {
                            AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.d = (ahdd)new ahba((ahbh)AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.a);
            }
            case 3: {
                return new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001", new Object[] { "e", "b", ahpe.s, "c" });
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
