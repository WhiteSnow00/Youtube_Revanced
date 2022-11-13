// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SharingProviderDataCommandOuterClass$SharingProviderDataCommand extends ahbh implements ahcw
{
    public static final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a;
    private static volatile ahdd g;
    public static final ahbf sharingProviderDataCommand;
    public int b;
    public String c;
    public boolean d;
    public aiqj e;
    public aiqj f;
    private byte h;
    
    static {
        final SharingProviderDataCommandOuterClass$SharingProviderDataCommand a2 = new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
        ahbh.registerDefaultInstance((Class)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class, (ahbh)(a = a2));
        sharingProviderDataCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 377332428, ahek.k, (Class)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class);
    }
    
    private SharingProviderDataCommandOuterClass$SharingProviderDataCommand() {
        this.h = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g) == null) {
                    synchronized (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.class) {
                        if (SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g == null) {
                            SharingProviderDataCommandOuterClass$SharingProviderDataCommand.g = (ahdd)new ahba((ahbh)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a);
            }
            case 3: {
                return new SharingProviderDataCommandOuterClass$SharingProviderDataCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SharingProviderDataCommandOuterClass$SharingProviderDataCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
