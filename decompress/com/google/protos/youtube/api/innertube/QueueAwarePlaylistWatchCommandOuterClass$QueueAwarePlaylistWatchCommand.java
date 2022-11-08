// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand extends agzi implements ahax
{
    public static final QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand a;
    private static volatile ahbe d;
    public static final agzg queueAwarePlaylistWatchCommand;
    public aioe b;
    public aioe c;
    private int e;
    private byte f;
    
    static {
        final QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand a2 = new QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand();
        agzi.registerDefaultInstance((Class)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class, (agzi)(a = a2));
        queueAwarePlaylistWatchCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 471082452, ahcm.k, (Class)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class);
    }
    
    private QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand() {
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
                if ((d = QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d) == null) {
                    synchronized (QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class) {
                        if (QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d == null) {
                            QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d = (ahbe)new agzb((agzi)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a;
            }
            case 4: {
                return new agza((agzi)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a);
            }
            case 3: {
                return new QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
