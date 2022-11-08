// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand extends agzi implements ahax
{
    public static final AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand a;
    public static final agzg adInfraSupportWrapperCommand;
    private static volatile ahbe e;
    public int b;
    public aioe c;
    public ahjn d;
    private byte f;
    
    static {
        final AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand a2 = new AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand();
        agzi.registerDefaultInstance((Class)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class, (agzi)(a = a2));
        adInfraSupportWrapperCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 407180959, ahcm.k, (Class)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class);
    }
    
    private AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand() {
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
                if ((e = AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e) == null) {
                    synchronized (AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.class) {
                        if (AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e == null) {
                            AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.e = (ahbe)new agzb((agzi)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a;
            }
            case 4: {
                return new agza((agzi)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a);
            }
            case 3: {
                return new AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
