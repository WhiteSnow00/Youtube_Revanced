// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand extends agzi implements ahax
{
    public static final QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand a;
    private static volatile ahbe d;
    public static final agzg queueAddMenuItemCommand;
    public aioe b;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand a2 = new QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand();
        agzi.registerDefaultInstance((Class)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class, (agzi)(a = a2));
        queueAddMenuItemCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 469942096, ahcm.k, (Class)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class);
    }
    
    private QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand() {
        this.f = 2;
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
                if ((d = QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d) == null) {
                    synchronized (QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.class) {
                        if (QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d == null) {
                            QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.d = (ahbe)new agzb((agzi)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a;
            }
            case 4: {
                return new agza((agzi)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a);
            }
            case 3: {
                return new QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
