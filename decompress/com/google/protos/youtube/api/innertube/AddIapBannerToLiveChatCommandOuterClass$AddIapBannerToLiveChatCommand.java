// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand extends agzi implements ahax
{
    public static final AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand a;
    public static final agzg addIapBannerToLiveChatCommand;
    private static volatile ahbe k;
    public int b;
    public agzy c;
    public anss d;
    public aioe e;
    public String f;
    public String g;
    public boolean h;
    public aioe i;
    public agyo j;
    private byte l;
    
    static {
        final AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand a2 = new AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand();
        agzi.registerDefaultInstance((Class)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class, (agzi)(a = a2));
        addIapBannerToLiveChatCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 413219504, ahcm.k, (Class)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class);
    }
    
    private AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand() {
        this.l = 2;
        this.c = emptyProtobufList();
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k) == null) {
                    synchronized (AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class) {
                        if (AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k == null) {
                            AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k = (ahbe)new agzb((agzi)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a;
            }
            case 4: {
                return new agza((agzi)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a);
            }
            case 3: {
                return new AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0003\u0001\u1409\u0000\u0004\u001b\u0005\u1409\u0001\u0006\u1008\u0002\u0007\u1008\u0003\b\u1007\u0004\n\u1409\u0005\u000b\u1009\u0006", new Object[] { "b", "d", "c", ahms.class, "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
