// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand extends ahbh implements ahcw
{
    public static final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a;
    private static volatile ahdd d;
    public static final ahbf logFirebaseEventCommand;
    public String b;
    public ahbx c;
    private int e;
    private byte f;
    
    static {
        final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a2 = new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
        ahbh.registerDefaultInstance((Class)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class, (ahbh)(a = a2));
        logFirebaseEventCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 245093374, ahek.k, (Class)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class);
    }
    
    private LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
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
                if ((d = LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d) == null) {
                    synchronized (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class) {
                        if (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d == null) {
                            LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d = (ahdd)new ahba((ahbh)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a);
            }
            case 3: {
                return new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "e", "b", "c", alkt.class });
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
