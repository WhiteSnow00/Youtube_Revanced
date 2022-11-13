// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand extends ahbh implements ahcw
{
    public static final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand a;
    private static volatile ahdd d;
    public static final ahbf showSystemInfoDialogCommand;
    public int b;
    public ajut c;
    private byte e;
    
    static {
        final ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand a2 = new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
        ahbh.registerDefaultInstance((Class)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class, (ahbh)(a = a2));
        showSystemInfoDialogCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 240199717, ahek.k, (Class)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class);
    }
    
    private ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d) == null) {
                    synchronized (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.class) {
                        if (ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d == null) {
                            ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.d = (ahdd)new ahba((ahbh)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a);
            }
            case 3: {
                return new ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
