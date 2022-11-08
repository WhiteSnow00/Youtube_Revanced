// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharingProviderDataCommandOuterClass$SharingProviderDataCommand extends agzi implements ahax
{
    public static final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a;
    private static volatile ahbe g;
    public static final agzg sharingProviderDataCommand;
    public int b;
    public String c;
    public boolean d;
    public aioe e;
    public aioe f;
    private byte h;
    
    static {
        final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a2 = new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
        agzi.registerDefaultInstance((Class)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class, (agzi)(a = a2));
        sharingProviderDataCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 377332428, ahcm.k, (Class)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class);
    }
    
    private SharingProviderDataCommandOuterClass$SharingProviderDataCommand() {
        this.h = 2;
        this.c = "";
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
                final ahbe g;
                if ((g = SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g) == null) {
                    synchronized (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class) {
                        if (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g == null) {
                            SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g = (ahbe)new agzb((agzi)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a;
            }
            case 4: {
                return new agza((agzi)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a);
            }
            case 3: {
                return new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
