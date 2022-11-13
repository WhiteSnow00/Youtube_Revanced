// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand extends ahbh implements ahcw
{
    public static final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a;
    private static volatile ahdd b;
    public static final ahbf showNoConnectionBarCommand;
    
    static {
        final ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand a2 = new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
        ahbh.registerDefaultInstance((Class)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class, (ahbh)(a = a2));
        showNoConnectionBarCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 246536901, ahek.k, (Class)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class);
    }
    
    private ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b) == null) {
                    synchronized (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.class) {
                        if (ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b == null) {
                            ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.b = (ahdd)new ahba((ahbh)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a);
            }
            case 3: {
                return new ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.a, "\u0001\u0000", (Object[])null);
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
