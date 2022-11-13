// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand extends ahbh implements ahcw
{
    public static final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand a;
    public static final ahbf applyCoWatchActionCommand;
    private static volatile ahdd f;
    public int b;
    public int c;
    public aiqj d;
    public aiqj e;
    private byte g;
    
    static {
        final ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand a2 = new ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand();
        ahbh.registerDefaultInstance((Class)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class, (ahbh)(a = a2));
        applyCoWatchActionCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 443723397, ahek.k, (Class)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class);
    }
    
    private ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f) == null) {
                    synchronized (ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.class) {
                        if (ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f == null) {
                            ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.f = (ahdd)new ahba((ahbh)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a);
            }
            case 3: {
                return new ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u100c\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "b", "c", aill.j, "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
