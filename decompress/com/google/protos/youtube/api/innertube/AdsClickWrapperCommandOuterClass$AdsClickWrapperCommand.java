// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand extends agzi implements ahax
{
    public static final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand a;
    public static final agzg adsClickWrapperCommand;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public ahnb d;
    private byte f;
    
    static {
        final AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand a2 = new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
        agzi.registerDefaultInstance((Class)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class, (agzi)(a = a2));
        adsClickWrapperCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 310408312, ahcm.k, (Class)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class);
    }
    
    private AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand() {
        this.f = 2;
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
                final ahbe e;
                if ((e = AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e) == null) {
                    synchronized (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.class) {
                        if (AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e == null) {
                            AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.e = (ahbe)new agzb((agzi)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a;
            }
            case 4: {
                return new agza((agzi)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a);
            }
            case 3: {
                return new AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
