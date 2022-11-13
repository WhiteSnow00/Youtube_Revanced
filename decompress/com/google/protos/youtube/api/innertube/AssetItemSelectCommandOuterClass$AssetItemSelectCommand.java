// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AssetItemSelectCommandOuterClass$AssetItemSelectCommand extends ahbh implements ahcw
{
    public static final AssetItemSelectCommandOuterClass$AssetItemSelectCommand a;
    public static final ahbf assetItemSelectCommand;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        final AssetItemSelectCommandOuterClass$AssetItemSelectCommand a2 = new AssetItemSelectCommandOuterClass$AssetItemSelectCommand();
        ahbh.registerDefaultInstance((Class)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class, (ahbh)(a = a2));
        assetItemSelectCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 437088376, ahek.k, (Class)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class);
    }
    
    private AssetItemSelectCommandOuterClass$AssetItemSelectCommand() {
        ahbh.emptyProtobufList();
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AssetItemSelectCommandOuterClass$AssetItemSelectCommand.c) == null) {
                    synchronized (AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class) {
                        if (AssetItemSelectCommandOuterClass$AssetItemSelectCommand.c == null) {
                            AssetItemSelectCommandOuterClass$AssetItemSelectCommand.c = (ahdd)new ahba((ahbh)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a);
            }
            case 3: {
                return new AssetItemSelectCommandOuterClass$AssetItemSelectCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[] { "b", ahvr.class });
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
