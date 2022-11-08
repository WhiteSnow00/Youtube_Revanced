// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SetClientSettingEndpointOuterClass$SetClientSettingEndpoint extends agzi implements ahax
{
    public static final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a;
    private static volatile ahbe d;
    public static final agzg setClientSettingEndpoint;
    public agzy b;
    public agzy c;
    private byte e;
    
    static {
        final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a2 = new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
        agzi.registerDefaultInstance((Class)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, (agzi)(a = a2));
        setClientSettingEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 81212182, ahcm.k, (Class)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class);
    }
    
    private SetClientSettingEndpointOuterClass$SetClientSettingEndpoint() {
        this.e = 2;
        this.b = emptyProtobufList();
        this.c = emptyProtobufList();
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
                if ((d = SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d) == null) {
                    synchronized (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class) {
                        if (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d == null) {
                            SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.d = (ahbe)new agzb((agzi)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a;
            }
            case 4: {
                return new agza((agzi)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a);
            }
            case 3: {
                return new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002\u041b", new Object[] { "b", anxf.class, "c", aioe.class });
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
