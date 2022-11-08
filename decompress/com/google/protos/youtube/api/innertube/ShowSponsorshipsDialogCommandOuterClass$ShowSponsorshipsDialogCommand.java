// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand extends agzi implements ahax
{
    public static final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand a;
    private static volatile ahbe c;
    public static final agzg showSponsorshipsDialogCommand;
    public aioe b;
    private int d;
    private byte e;
    
    static {
        final ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand a2 = new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
        agzi.registerDefaultInstance((Class)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class, (agzi)(a = a2));
        showSponsorshipsDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 209133170, ahcm.k, (Class)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class);
    }
    
    private ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand() {
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
                if ((c = ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.c) == null) {
                    synchronized (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.class) {
                        if (ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.c == null) {
                            ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.c = (ahbe)new agzb((agzi)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.a);
            }
            case 3: {
                return new ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0000", new Object[] { "d", "b" });
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
