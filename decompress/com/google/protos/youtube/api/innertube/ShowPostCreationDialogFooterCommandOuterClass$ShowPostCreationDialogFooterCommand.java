// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand extends agzi implements ahax
{
    public static final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a;
    private static volatile ahbe d;
    public static final agzg showPostCreationDialogFooterCommand;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand a2 = new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
        agzi.registerDefaultInstance((Class)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class, (agzi)(a = a2));
        showPostCreationDialogFooterCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 369262379, ahcm.k, (Class)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class);
    }
    
    private ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand() {
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
                if ((d = ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d) == null) {
                    synchronized (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.class) {
                        if (ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d == null) {
                            ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.d = (ahbe)new agzb((agzi)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a);
            }
            case 3: {
                return new ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
