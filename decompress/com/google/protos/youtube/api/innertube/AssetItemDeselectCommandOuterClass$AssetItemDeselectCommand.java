// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand extends agzi implements ahax
{
    public static final AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand a;
    public static final agzg assetItemDeselectCommand;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        final AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand a2 = new AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand();
        agzi.registerDefaultInstance((Class)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class, (agzi)(a = a2));
        assetItemDeselectCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 444949225, ahcm.k, (Class)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class);
    }
    
    private AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand() {
        this.b = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c) == null) {
                    synchronized (AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.class) {
                        if (AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c == null) {
                            AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.c = (ahbe)new agzb((agzi)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a;
            }
            case 4: {
                return new agza((agzi)AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.a);
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
