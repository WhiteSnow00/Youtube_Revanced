// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ExecuteEntityCommandOuterClass$ExecuteEntityCommand extends agzi implements ahax
{
    public static final ExecuteEntityCommandOuterClass$ExecuteEntityCommand a;
    private static volatile ahbe d;
    public static final agzg executeEntityCommand;
    public int b;
    public String c;
    
    static {
        final ExecuteEntityCommandOuterClass$ExecuteEntityCommand a2 = new ExecuteEntityCommandOuterClass$ExecuteEntityCommand();
        agzi.registerDefaultInstance((Class)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.class, (agzi)(a = a2));
        executeEntityCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 445684868, ahcm.k, (Class)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.class);
    }
    
    private ExecuteEntityCommandOuterClass$ExecuteEntityCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ExecuteEntityCommandOuterClass$ExecuteEntityCommand.d) == null) {
                    synchronized (ExecuteEntityCommandOuterClass$ExecuteEntityCommand.class) {
                        if (ExecuteEntityCommandOuterClass$ExecuteEntityCommand.d == null) {
                            ExecuteEntityCommandOuterClass$ExecuteEntityCommand.d = (ahbe)new agzb((agzi)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ExecuteEntityCommandOuterClass$ExecuteEntityCommand.a;
            }
            case 4: {
                return new agza((agzi)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.a);
            }
            case 3: {
                return new ExecuteEntityCommandOuterClass$ExecuteEntityCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ExecuteEntityCommandOuterClass$ExecuteEntityCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
