// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand extends ahbh implements ahcw
{
    public static final AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand a;
    public static final ahbf addIapBannerToLiveChatCommand;
    private static volatile ahdd k;
    public int b;
    public ahbx c;
    public anuv d;
    public aiqj e;
    public String f;
    public String g;
    public boolean h;
    public aiqj i;
    public ahan j;
    private byte l;
    
    static {
        final AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand a2 = new AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand();
        ahbh.registerDefaultInstance((Class)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class, (ahbh)(a = a2));
        addIapBannerToLiveChatCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 413219504, ahek.k, (Class)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class);
    }
    
    private AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand() {
        this.l = 2;
        this.c = emptyProtobufList();
        this.f = "";
        this.g = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k) == null) {
                    synchronized (AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.class) {
                        if (AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k == null) {
                            AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.k = (ahdd)new ahba((ahbh)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a);
            }
            case 3: {
                return new AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0003\u0001\u1409\u0000\u0004\u001b\u0005\u1409\u0001\u0006\u1008\u0002\u0007\u1008\u0003\b\u1007\u0004\n\u1409\u0005\u000b\u1009\u0006", new Object[] { "b", "d", "c", ahoq.class, "e", "f", "g", "h", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
