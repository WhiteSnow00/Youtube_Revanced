// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class NavigateBackCommandOuterClass$NavigateBackCommand extends ahbh implements ahcw
{
    public static final NavigateBackCommandOuterClass$NavigateBackCommand a;
    private static volatile ahdd b;
    public static final ahbf navigateBackCommand;
    
    static {
        final NavigateBackCommandOuterClass$NavigateBackCommand a2 = new NavigateBackCommandOuterClass$NavigateBackCommand();
        ahbh.registerDefaultInstance((Class)NavigateBackCommandOuterClass$NavigateBackCommand.class, (ahbh)(a = a2));
        navigateBackCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 368868921, ahek.k, (Class)NavigateBackCommandOuterClass$NavigateBackCommand.class);
    }
    
    private NavigateBackCommandOuterClass$NavigateBackCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = NavigateBackCommandOuterClass$NavigateBackCommand.b) == null) {
                    synchronized (NavigateBackCommandOuterClass$NavigateBackCommand.class) {
                        if (NavigateBackCommandOuterClass$NavigateBackCommand.b == null) {
                            NavigateBackCommandOuterClass$NavigateBackCommand.b = (ahdd)new ahba((ahbh)NavigateBackCommandOuterClass$NavigateBackCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return NavigateBackCommandOuterClass$NavigateBackCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)NavigateBackCommandOuterClass$NavigateBackCommand.a);
            }
            case 3: {
                return new NavigateBackCommandOuterClass$NavigateBackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)NavigateBackCommandOuterClass$NavigateBackCommand.a, "\u0001\u0000", (Object[])null);
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
