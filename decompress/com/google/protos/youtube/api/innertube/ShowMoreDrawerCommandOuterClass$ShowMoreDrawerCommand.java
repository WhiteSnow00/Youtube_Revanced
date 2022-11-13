// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand extends ahbh implements ahcw
{
    public static final ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand a;
    private static volatile ahdd c;
    public static final ahbf showMoreDrawerCommand;
    public amym b;
    private int d;
    private byte e;
    
    static {
        final ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand a2 = new ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand();
        ahbh.registerDefaultInstance((Class)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class, (ahbh)(a = a2));
        showMoreDrawerCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 441221881, ahek.k, (Class)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class);
    }
    
    private ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand() {
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
                final ahdd c;
                if ((c = ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c) == null) {
                    synchronized (ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class) {
                        if (ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c == null) {
                            ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c = (ahdd)new ahba((ahbh)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a);
            }
            case 3: {
                return new ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
