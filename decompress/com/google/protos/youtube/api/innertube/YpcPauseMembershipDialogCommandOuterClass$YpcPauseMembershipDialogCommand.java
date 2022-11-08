// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand extends agzi implements ahax
{
    public static final YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand a;
    private static volatile ahbe c;
    public static final agzg ypcPauseMembershipDialogCommand;
    public anss b;
    private int d;
    private byte e;
    
    static {
        final YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand a2 = new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
        agzi.registerDefaultInstance((Class)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class, (agzi)(a = a2));
        ypcPauseMembershipDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 215581778, ahcm.k, (Class)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class);
    }
    
    private YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand() {
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
                final ahbe c;
                if ((c = YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.c) == null) {
                    synchronized (YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.class) {
                        if (YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.c == null) {
                            YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.c = (ahbe)new agzb((agzi)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.a);
            }
            case 3: {
                return new YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
