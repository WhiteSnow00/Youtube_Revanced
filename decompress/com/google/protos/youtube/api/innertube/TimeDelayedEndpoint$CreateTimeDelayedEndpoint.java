// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class TimeDelayedEndpoint$CreateTimeDelayedEndpoint extends ahbh implements ahcw
{
    public static final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a;
    public static final ahbf createTimeDelayedEndpoint;
    private static volatile ahdd h;
    public int b;
    public String c;
    public int d;
    public ahbx e;
    public aiqj f;
    public ahbx g;
    private byte i;
    
    static {
        final TimeDelayedEndpoint$CreateTimeDelayedEndpoint a2 = new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
        ahbh.registerDefaultInstance((Class)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class, (ahbh)(a = a2));
        createTimeDelayedEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 165976025, ahek.k, (Class)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class);
    }
    
    private TimeDelayedEndpoint$CreateTimeDelayedEndpoint() {
        this.i = 2;
        this.c = "";
        this.e = emptyProtobufList();
        this.g = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = TimeDelayedEndpoint$CreateTimeDelayedEndpoint.h) == null) {
                    synchronized (TimeDelayedEndpoint$CreateTimeDelayedEndpoint.class) {
                        if (TimeDelayedEndpoint$CreateTimeDelayedEndpoint.h == null) {
                            TimeDelayedEndpoint$CreateTimeDelayedEndpoint.h = (ahdd)new ahba((ahbh)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return TimeDelayedEndpoint$CreateTimeDelayedEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.a);
            }
            case 3: {
                return new TimeDelayedEndpoint$CreateTimeDelayedEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)TimeDelayedEndpoint$CreateTimeDelayedEndpoint.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0003\u0001\u1008\u0000\u0002\u1004\u0001\u0003\u041b\u0004\u1409\u0002\u0005\u041b", new Object[] { "b", "c", "d", "e", aiqj.class, "f", "g", aiqj.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
