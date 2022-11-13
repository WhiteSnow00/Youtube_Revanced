// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RefreshConfigCommandOuterClass$RefreshConfigCommand extends ahbh implements ahcw
{
    public static final RefreshConfigCommandOuterClass$RefreshConfigCommand a;
    private static volatile ahdd b;
    public static final ahbf refreshConfigCommand;
    
    static {
        final RefreshConfigCommandOuterClass$RefreshConfigCommand a2 = new RefreshConfigCommandOuterClass$RefreshConfigCommand();
        ahbh.registerDefaultInstance((Class)RefreshConfigCommandOuterClass$RefreshConfigCommand.class, (ahbh)(a = a2));
        refreshConfigCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 191373512, ahek.k, (Class)RefreshConfigCommandOuterClass$RefreshConfigCommand.class);
    }
    
    private RefreshConfigCommandOuterClass$RefreshConfigCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = RefreshConfigCommandOuterClass$RefreshConfigCommand.b) == null) {
                    synchronized (RefreshConfigCommandOuterClass$RefreshConfigCommand.class) {
                        if (RefreshConfigCommandOuterClass$RefreshConfigCommand.b == null) {
                            RefreshConfigCommandOuterClass$RefreshConfigCommand.b = (ahdd)new ahba((ahbh)RefreshConfigCommandOuterClass$RefreshConfigCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return RefreshConfigCommandOuterClass$RefreshConfigCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RefreshConfigCommandOuterClass$RefreshConfigCommand.a);
            }
            case 3: {
                return new RefreshConfigCommandOuterClass$RefreshConfigCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RefreshConfigCommandOuterClass$RefreshConfigCommand.a, "\u0001\u0000", (Object[])null);
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
