// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenDialogCommandOuterClass$OpenDialogCommand extends ahbh implements ahcw
{
    public static final OpenDialogCommandOuterClass$OpenDialogCommand a;
    private static volatile ahdd d;
    public static final ahbf openDialogCommand;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        final OpenDialogCommandOuterClass$OpenDialogCommand a2 = new OpenDialogCommandOuterClass$OpenDialogCommand();
        ahbh.registerDefaultInstance((Class)OpenDialogCommandOuterClass$OpenDialogCommand.class, (ahbh)(a = a2));
        openDialogCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 185598973, ahek.k, (Class)OpenDialogCommandOuterClass$OpenDialogCommand.class);
    }
    
    private OpenDialogCommandOuterClass$OpenDialogCommand() {
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
                if ((d = OpenDialogCommandOuterClass$OpenDialogCommand.d) == null) {
                    synchronized (OpenDialogCommandOuterClass$OpenDialogCommand.class) {
                        if (OpenDialogCommandOuterClass$OpenDialogCommand.d == null) {
                            OpenDialogCommandOuterClass$OpenDialogCommand.d = (ahdd)new ahba((ahbh)OpenDialogCommandOuterClass$OpenDialogCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return OpenDialogCommandOuterClass$OpenDialogCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenDialogCommandOuterClass$OpenDialogCommand.a);
            }
            case 3: {
                return new OpenDialogCommandOuterClass$OpenDialogCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenDialogCommandOuterClass$OpenDialogCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
