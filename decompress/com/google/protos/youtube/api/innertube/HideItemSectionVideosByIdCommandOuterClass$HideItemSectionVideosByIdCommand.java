// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand extends agzi implements ahax
{
    public static final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand a;
    private static volatile ahbe d;
    public static final agzg hideItemSectionVideosByIdCommand;
    public int b;
    public String c;
    
    static {
        final HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand a2 = new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
        agzi.registerDefaultInstance((Class)HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class, (agzi)(a = a2));
        hideItemSectionVideosByIdCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 228198035, ahcm.k, (Class)HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class);
    }
    
    private HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.d) == null) {
                    synchronized (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.class) {
                        if (HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.d == null) {
                            HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.d = (ahbe)new agzb((agzi)HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.a;
            }
            case 4: {
                return new agza((agzi)HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.a);
            }
            case 3: {
                return new HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
