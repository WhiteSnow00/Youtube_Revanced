// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand extends agzi implements ahax
{
    public static final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand a;
    private static volatile ahbe c;
    public static final agzg openSuperStickerBuyFlowCommand;
    public agyc b;
    private int d;
    
    static {
        final OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand a2 = new OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand();
        agzi.registerDefaultInstance((Class)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class, (agzi)(a = a2));
        openSuperStickerBuyFlowCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 198340511, ahcm.k, (Class)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class);
    }
    
    private OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand() {
        this.b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c) == null) {
                    synchronized (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.class) {
                        if (OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c == null) {
                            OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.c = (ahbe)new agzb((agzi)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a;
            }
            case 4: {
                return new agza((agzi)OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.a);
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
