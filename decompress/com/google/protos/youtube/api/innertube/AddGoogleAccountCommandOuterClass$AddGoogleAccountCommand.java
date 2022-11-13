// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand extends ahbh implements ahcw
{
    public static final AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand a;
    public static final ahbf addGoogleAccountCommand;
    private static volatile ahdd b;
    
    static {
        final AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand a2 = new AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand();
        ahbh.registerDefaultInstance((Class)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class, (ahbh)(a = a2));
        addGoogleAccountCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 393898374, ahek.k, (Class)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class);
    }
    
    private AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b) == null) {
                    synchronized (AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.class) {
                        if (AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b == null) {
                            AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.b = (ahdd)new ahba((ahbh)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a);
            }
            case 3: {
                return new AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.a, "\u0001\u0000", (Object[])null);
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
