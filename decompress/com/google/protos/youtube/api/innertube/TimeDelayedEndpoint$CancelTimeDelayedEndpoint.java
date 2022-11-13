// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class TimeDelayedEndpoint$CancelTimeDelayedEndpoint extends ahbh implements ahcw
{
    public static final TimeDelayedEndpoint$CancelTimeDelayedEndpoint a;
    public static final ahbf cancelTimeDelayedEndpoint;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        final TimeDelayedEndpoint$CancelTimeDelayedEndpoint a2 = new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
        ahbh.registerDefaultInstance((Class)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class, (ahbh)(a = a2));
        cancelTimeDelayedEndpoint = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 166907542, ahek.k, (Class)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class);
    }
    
    private TimeDelayedEndpoint$CancelTimeDelayedEndpoint() {
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
                if ((d = TimeDelayedEndpoint$CancelTimeDelayedEndpoint.d) == null) {
                    synchronized (TimeDelayedEndpoint$CancelTimeDelayedEndpoint.class) {
                        if (TimeDelayedEndpoint$CancelTimeDelayedEndpoint.d == null) {
                            TimeDelayedEndpoint$CancelTimeDelayedEndpoint.d = (ahdd)new ahba((ahbh)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return TimeDelayedEndpoint$CancelTimeDelayedEndpoint.a;
            }
            case 4: {
                return new ahaz((ahbh)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.a);
            }
            case 3: {
                return new TimeDelayedEndpoint$CancelTimeDelayedEndpoint();
            }
            case 2: {
                return newMessageInfo((MessageLite)TimeDelayedEndpoint$CancelTimeDelayedEndpoint.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
