// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand extends agzi implements ahax
{
    public static final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a;
    private static volatile ahbe d;
    public static final agzg logFirebaseEventCommand;
    public String b;
    public agzy c;
    private int e;
    private byte f;
    
    static {
        final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a2 = new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
        agzi.registerDefaultInstance((Class)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class, (agzi)(a = a2));
        logFirebaseEventCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 245093374, ahcm.k, (Class)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class);
    }
    
    private LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand() {
        this.f = 2;
        this.b = "";
        this.c = emptyProtobufList();
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
                if ((d = LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d) == null) {
                    synchronized (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class) {
                        if (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d == null) {
                            LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.d = (ahbe)new agzb((agzi)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a;
            }
            case 4: {
                return new agza((agzi)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a);
            }
            case 3: {
                return new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u041b", new Object[] { "e", "b", "c", aliq.class });
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
