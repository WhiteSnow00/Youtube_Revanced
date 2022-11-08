// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint extends agzi implements ahax
{
    public static final YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint a;
    private static volatile ahbe h;
    public static final agzg ypcFixInstrumentEndpoint;
    public int b;
    public Object c;
    public int d;
    public Object e;
    public agyc f;
    public agyc g;
    private int i;
    private aioe j;
    private byte k;
    
    static {
        final YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint a2 = new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
        agzi.registerDefaultInstance((Class)YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class, (agzi)(a = a2));
        ypcFixInstrumentEndpoint = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 152316869, ahcm.k, (Class)YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class);
    }
    
    private YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint() {
        this.b = 0;
        this.d = 0;
        this.k = 2;
        this.f = agyc.b;
        this.g = agyc.b;
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
                final ahbe h;
                if ((h = YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.h) == null) {
                    synchronized (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.class) {
                        if (YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.h == null) {
                            YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.h = (ahbe)new agzb((agzi)YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.a;
            }
            case 4: {
                return new agza((agzi)YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.a);
            }
            case 3: {
                return new YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.a, "\u0001\u0007\u0002\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u100a\u0000\u0002\u143c\u0000\u0003\u143c\u0000\u0004\u143c\u0001\u0005\u143c\u0001\u0006\u100a\u0005\u0007\u1409\u0006", new Object[] { "c", "b", "e", "d", "i", "f", aioe.class, aioe.class, aioe.class, aioe.class, "g", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
