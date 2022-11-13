// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand extends ahbh implements ahcw
{
    public static final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a;
    private static volatile ahdd d;
    public static final ahbf showPostCreationDialogFooterCommand;
    public int b;
    public anuv c;
    private byte e;
    
    static {
        final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a2 = new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
        ahbh.registerDefaultInstance((Class)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class, (ahbh)(a = a2));
        showPostCreationDialogFooterCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 369262379, ahek.k, (Class)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class);
    }
    
    private ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand() {
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
                if ((d = ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d) == null) {
                    synchronized (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class) {
                        if (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d == null) {
                            ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d = (ahdd)new ahba((ahbh)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a);
            }
            case 3: {
                return new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
