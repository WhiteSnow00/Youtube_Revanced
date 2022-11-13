// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ProfileCardCommandOuterClass$ProfileCardCommand extends ahbh implements ahcw
{
    public static final ProfileCardCommandOuterClass$ProfileCardCommand a;
    private static volatile ahdd f;
    public static final ahbf profileCardCommand;
    public String b;
    public String c;
    public boolean d;
    public String e;
    private int g;
    
    static {
        final ProfileCardCommandOuterClass$ProfileCardCommand a2 = new ProfileCardCommandOuterClass$ProfileCardCommand();
        ahbh.registerDefaultInstance((Class)ProfileCardCommandOuterClass$ProfileCardCommand.class, (ahbh)(a = a2));
        profileCardCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 214503604, ahek.k, (Class)ProfileCardCommandOuterClass$ProfileCardCommand.class);
    }
    
    private ProfileCardCommandOuterClass$ProfileCardCommand() {
        this.b = "";
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ProfileCardCommandOuterClass$ProfileCardCommand.f) == null) {
                    synchronized (ProfileCardCommandOuterClass$ProfileCardCommand.class) {
                        if (ProfileCardCommandOuterClass$ProfileCardCommand.f == null) {
                            ProfileCardCommandOuterClass$ProfileCardCommand.f = (ahdd)new ahba((ahbh)ProfileCardCommandOuterClass$ProfileCardCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ProfileCardCommandOuterClass$ProfileCardCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ProfileCardCommandOuterClass$ProfileCardCommand.a);
            }
            case 3: {
                return new ProfileCardCommandOuterClass$ProfileCardCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ProfileCardCommandOuterClass$ProfileCardCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1008\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
