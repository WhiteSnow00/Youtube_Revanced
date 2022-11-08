// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AssetItemSelectCommandOuterClass$AssetItemSelectCommand extends agzi implements ahax
{
    public static final AssetItemSelectCommandOuterClass$AssetItemSelectCommand a;
    public static final agzg assetItemSelectCommand;
    private static volatile ahbe d;
    public agzy b;
    public agzy c;
    
    static {
        final AssetItemSelectCommandOuterClass$AssetItemSelectCommand a2 = new AssetItemSelectCommandOuterClass$AssetItemSelectCommand();
        agzi.registerDefaultInstance((Class)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class, (agzi)(a = a2));
        assetItemSelectCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 437088376, ahcm.k, (Class)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class);
    }
    
    private AssetItemSelectCommandOuterClass$AssetItemSelectCommand() {
        this.b = agzi.emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = AssetItemSelectCommandOuterClass$AssetItemSelectCommand.d) == null) {
                    synchronized (AssetItemSelectCommandOuterClass$AssetItemSelectCommand.class) {
                        if (AssetItemSelectCommandOuterClass$AssetItemSelectCommand.d == null) {
                            AssetItemSelectCommandOuterClass$AssetItemSelectCommand.d = (ahbe)new agzb((agzi)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a;
            }
            case 4: {
                return new agza((agzi)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a);
            }
            case 3: {
                return new AssetItemSelectCommandOuterClass$AssetItemSelectCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AssetItemSelectCommandOuterClass$AssetItemSelectCommand.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[] { "b", "c", ahtt.class });
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
