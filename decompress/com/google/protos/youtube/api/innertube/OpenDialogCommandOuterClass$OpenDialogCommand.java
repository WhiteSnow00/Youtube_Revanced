// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenDialogCommandOuterClass$OpenDialogCommand extends agzi implements ahax
{
    public static final OpenDialogCommandOuterClass$OpenDialogCommand a;
    private static volatile ahbe d;
    public static final agzg openDialogCommand;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final OpenDialogCommandOuterClass$OpenDialogCommand a2 = new OpenDialogCommandOuterClass$OpenDialogCommand();
        agzi.registerDefaultInstance((Class)OpenDialogCommandOuterClass$OpenDialogCommand.class, (agzi)(a = a2));
        openDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 185598973, ahcm.k, (Class)OpenDialogCommandOuterClass$OpenDialogCommand.class);
    }
    
    private OpenDialogCommandOuterClass$OpenDialogCommand() {
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
                if ((d = OpenDialogCommandOuterClass$OpenDialogCommand.d) == null) {
                    synchronized (OpenDialogCommandOuterClass$OpenDialogCommand.class) {
                        if (OpenDialogCommandOuterClass$OpenDialogCommand.d == null) {
                            OpenDialogCommandOuterClass$OpenDialogCommand.d = (ahbe)new agzb((agzi)OpenDialogCommandOuterClass$OpenDialogCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return OpenDialogCommandOuterClass$OpenDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)OpenDialogCommandOuterClass$OpenDialogCommand.a);
            }
            case 3: {
                return new OpenDialogCommandOuterClass$OpenDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenDialogCommandOuterClass$OpenDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
