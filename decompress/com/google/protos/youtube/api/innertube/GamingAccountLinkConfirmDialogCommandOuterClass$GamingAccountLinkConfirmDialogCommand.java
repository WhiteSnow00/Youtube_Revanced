// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand extends agzi implements ahax
{
    public static final GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand a;
    private static volatile ahbe d;
    public static final agzg gamingAccountLinkConfirmDialogCommand;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand a2 = new GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand();
        agzi.registerDefaultInstance((Class)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class, (agzi)(a = a2));
        gamingAccountLinkConfirmDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 194168203, ahcm.k, (Class)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class);
    }
    
    private GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand() {
        this.e = 2;
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
                if ((d = GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.d) == null) {
                    synchronized (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.class) {
                        if (GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.d == null) {
                            GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.d = (ahbe)new agzb((agzi)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.a);
            }
            case 3: {
                return new GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
