// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand extends ahbh implements ahcw
{
    public static final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand a;
    private static volatile ahdd e;
    public static final ahbf toggleMultiSelectVideoItemCommand;
    public int b;
    public String c;
    public String d;
    
    static {
        final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand a2 = new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
        ahbh.registerDefaultInstance((Class)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class, (ahbh)(a = a2));
        toggleMultiSelectVideoItemCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 229250685, ahek.k, (Class)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class);
    }
    
    private ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand() {
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.e) == null) {
                    synchronized (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class) {
                        if (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.e == null) {
                            ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.e = (ahdd)new ahba((ahbh)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.a);
            }
            case 3: {
                return new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
