// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand extends agzi implements ahax
{
    public static final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand a;
    private static volatile ahbe d;
    public static final agzg showSystemInfoDialogCommand;
    public int b;
    public ajsq c;
    private byte e;
    
    static {
        final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand a2 = new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
        agzi.registerDefaultInstance((Class)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class, (agzi)(a = a2));
        showSystemInfoDialogCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 240199717, ahcm.k, (Class)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class);
    }
    
    private ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand() {
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
                if ((d = ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d) == null) {
                    synchronized (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class) {
                        if (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d == null) {
                            ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d = (ahbe)new agzb((agzi)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a);
            }
            case 3: {
                return new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
