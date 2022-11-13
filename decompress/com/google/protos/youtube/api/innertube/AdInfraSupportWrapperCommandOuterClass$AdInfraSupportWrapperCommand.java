// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand extends ahbh implements ahcw
{
    public static final AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand a;
    public static final ahbf adInfraSupportWrapperCommand;
    private static volatile ahdd e;
    public int b;
    public aiqj c;
    public ahll d;
    private byte f;
    
    static {
        final AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand a2 = new AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand();
        ahbh.registerDefaultInstance((Class)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class, (ahbh)(a = a2));
        adInfraSupportWrapperCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 407180959, ahek.k, (Class)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class);
    }
    
    private AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e) == null) {
                    synchronized (AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class) {
                        if (AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e == null) {
                            AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e = (ahdd)new ahba((ahbh)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a);
            }
            case 3: {
                return new AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
