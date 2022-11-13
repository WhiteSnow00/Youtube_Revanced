// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand extends ahbh implements ahcw
{
    public static final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand a;
    private static volatile ahdd c;
    public static final ahbf openSuperStickerBuyFlowCommand;
    public ahab b;
    private int d;
    
    static {
        final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand a2 = new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
        ahbh.registerDefaultInstance((Class)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class, (ahbh)(a = a2));
        openSuperStickerBuyFlowCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 198340511, ahek.k, (Class)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class);
    }
    
    private OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand() {
        this.b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c) == null) {
                    synchronized (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class) {
                        if (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c == null) {
                            OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c = (ahdd)new ahba((ahbh)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a);
            }
            case 3: {
                return new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "d", "b" });
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
