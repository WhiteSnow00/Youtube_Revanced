// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand extends ahbh implements ahcw
{
    public static final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand a;
    public static final ahbf adsClickWrapperCommand;
    private static volatile ahdd e;
    public int b;
    public aiqj c;
    public ahoz d;
    private byte f;
    
    static {
        final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand a2 = new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
        ahbh.registerDefaultInstance((Class)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class, (ahbh)(a = a2));
        adsClickWrapperCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 310408312, ahek.k, (Class)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class);
    }
    
    private AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand() {
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
                if ((e = AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e) == null) {
                    synchronized (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class) {
                        if (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e == null) {
                            AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e = (ahdd)new ahba((ahbh)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a);
            }
            case 3: {
                return new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
