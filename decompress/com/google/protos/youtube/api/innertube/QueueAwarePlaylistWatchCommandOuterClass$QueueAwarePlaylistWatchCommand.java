// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand extends ahbh implements ahcw
{
    public static final QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand a;
    private static volatile ahdd d;
    public static final ahbf queueAwarePlaylistWatchCommand;
    public aiqj b;
    public aiqj c;
    private int e;
    private byte f;
    
    static {
        final QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand a2 = new QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand();
        ahbh.registerDefaultInstance((Class)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class, (ahbh)(a = a2));
        queueAwarePlaylistWatchCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 471082452, ahek.k, (Class)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class);
    }
    
    private QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand() {
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
                if ((d = QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d) == null) {
                    synchronized (QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.class) {
                        if (QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d == null) {
                            QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.d = (ahdd)new ahba((ahbh)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a);
            }
            case 3: {
                return new QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "e", "b", "c" });
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
