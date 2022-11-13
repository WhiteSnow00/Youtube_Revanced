// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand extends ahbh implements ahcw
{
    public static final QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand a;
    private static volatile ahdd d;
    public static final ahbf queueAddMenuItemCommand;
    public aiqj b;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        final QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand a2 = new QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand();
        ahbh.registerDefaultInstance((Class)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class, (ahbh)(a = a2));
        queueAddMenuItemCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 469942096, ahek.k, (Class)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class);
    }
    
    private QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand() {
        this.f = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d) == null) {
                    synchronized (QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class) {
                        if (QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d == null) {
                            QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d = (ahdd)new ahba((ahbh)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a);
            }
            case 3: {
                return new QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
