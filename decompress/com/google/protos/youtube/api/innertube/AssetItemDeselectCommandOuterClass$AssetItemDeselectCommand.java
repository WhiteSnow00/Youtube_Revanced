// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand extends ahbh implements ahcw
{
    public static final AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand a;
    public static final ahbf assetItemDeselectCommand;
    private static volatile ahdd c;
    public ahbx b;
    
    static {
        final AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand a2 = new AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand();
        ahbh.registerDefaultInstance((Class)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class, (ahbh)(a = a2));
        assetItemDeselectCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 444949225, ahek.k, (Class)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class);
    }
    
    private AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand() {
        this.b = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c) == null) {
                    synchronized (AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class) {
                        if (AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c == null) {
                            AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c = (ahdd)new ahba((ahbh)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a);
            }
            case 3: {
                return new AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[] { "b" });
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
