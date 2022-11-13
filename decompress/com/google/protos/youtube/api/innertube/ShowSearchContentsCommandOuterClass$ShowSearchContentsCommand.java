// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand extends ahbh implements ahcw
{
    public static final ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand a;
    private static volatile ahdd b;
    public static final ahbf showSearchContentsCommand;
    
    static {
        final ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand a2 = new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
        ahbh.registerDefaultInstance((Class)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class, (ahbh)(a = a2));
        showSearchContentsCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 242013526, ahek.k, (Class)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class);
    }
    
    private ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b) == null) {
                    synchronized (ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.class) {
                        if (ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b == null) {
                            ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.b = (ahdd)new ahba((ahbh)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a);
            }
            case 3: {
                return new ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.a, "\u0001\u0000", (Object[])null);
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
