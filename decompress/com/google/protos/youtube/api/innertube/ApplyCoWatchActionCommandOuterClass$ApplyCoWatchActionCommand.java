// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand extends agzi implements ahax
{
    public static final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand a;
    public static final agzg applyCoWatchActionCommand;
    private static volatile ahbe f;
    public int b;
    public int c;
    public aioe d;
    public aioe e;
    private byte g;
    
    static {
        final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand a2 = new ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand();
        agzi.registerDefaultInstance((Class)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class, (agzi)(a = a2));
        applyCoWatchActionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 443723397, ahcm.k, (Class)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class);
    }
    
    private ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand() {
        this.g = 2;
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
                final ahbe f;
                if ((f = ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f) == null) {
                    synchronized (ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class) {
                        if (ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f == null) {
                            ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f = (ahbe)new agzb((agzi)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a;
            }
            case 4: {
                return new agza((agzi)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a);
            }
            case 3: {
                return new ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", aijn.j, "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
