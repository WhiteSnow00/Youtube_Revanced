// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ResetSearchBarCommandOuterClass$ResetSearchBarCommand extends ahbh implements ahcw
{
    public static final ResetSearchBarCommandOuterClass$ResetSearchBarCommand a;
    private static volatile ahdd b;
    public static final ahbf resetSearchBarCommand;
    
    static {
        final ResetSearchBarCommandOuterClass$ResetSearchBarCommand a2 = new ResetSearchBarCommandOuterClass$ResetSearchBarCommand();
        ahbh.registerDefaultInstance((Class)ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class, (ahbh)(a = a2));
        resetSearchBarCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 245120411, ahek.k, (Class)ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class);
    }
    
    private ResetSearchBarCommandOuterClass$ResetSearchBarCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ResetSearchBarCommandOuterClass$ResetSearchBarCommand.b) == null) {
                    synchronized (ResetSearchBarCommandOuterClass$ResetSearchBarCommand.class) {
                        if (ResetSearchBarCommandOuterClass$ResetSearchBarCommand.b == null) {
                            ResetSearchBarCommandOuterClass$ResetSearchBarCommand.b = (ahdd)new ahba((ahbh)ResetSearchBarCommandOuterClass$ResetSearchBarCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ResetSearchBarCommandOuterClass$ResetSearchBarCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ResetSearchBarCommandOuterClass$ResetSearchBarCommand.a);
            }
            case 3: {
                return new ResetSearchBarCommandOuterClass$ResetSearchBarCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ResetSearchBarCommandOuterClass$ResetSearchBarCommand.a, "\u0001\u0000", (Object[])null);
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
