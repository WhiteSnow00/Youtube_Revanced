// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand extends agzi implements ahax
{
    public static final ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand a;
    private static volatile ahbe c;
    public static final agzg showMoreDrawerCommand;
    public amwi b;
    private int d;
    private byte e;
    
    static {
        final ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand a2 = new ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand();
        agzi.registerDefaultInstance((Class)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class, (agzi)(a = a2));
        showMoreDrawerCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 441221881, ahcm.k, (Class)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class);
    }
    
    private ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand() {
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
                if ((c = ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c) == null) {
                    synchronized (ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.class) {
                        if (ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c == null) {
                            ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.c = (ahbe)new agzb((agzi)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a);
            }
            case 3: {
                return new ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
