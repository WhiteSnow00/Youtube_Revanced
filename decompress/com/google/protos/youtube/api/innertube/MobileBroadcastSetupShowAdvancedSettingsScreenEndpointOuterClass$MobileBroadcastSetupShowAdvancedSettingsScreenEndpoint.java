// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint extends agzi implements ahax
{
    public static final MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint a;
    private static volatile ahbe d;
    public static final agzg mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
    public int b;
    public amgx c;
    private byte e;
    
    static {
        final MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint a2 = new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
        agzi.registerDefaultInstance((Class)MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class, (agzi)(a = a2));
        mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 134103788, ahcm.k, (Class)MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class);
    }
    
    private MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.d) == null) {
                    synchronized (MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class) {
                        if (MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.d == null) {
                            MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.d = (ahbe)new agzb((agzi)MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.a;
            }
            case 4: {
                return new agza((agzi)MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.a);
            }
            case 3: {
                return new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
