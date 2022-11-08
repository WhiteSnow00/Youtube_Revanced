// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ProfileCardCommandOuterClass$ProfileCardCommand extends agzi implements ahax
{
    public static final ProfileCardCommandOuterClass$ProfileCardCommand a;
    private static volatile ahbe f;
    public static final agzg profileCardCommand;
    public String b;
    public String c;
    public boolean d;
    public String e;
    private int g;
    
    static {
        final ProfileCardCommandOuterClass$ProfileCardCommand a2 = new ProfileCardCommandOuterClass$ProfileCardCommand();
        agzi.registerDefaultInstance((Class)ProfileCardCommandOuterClass$ProfileCardCommand.class, (agzi)(a = a2));
        profileCardCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 214503604, ahcm.k, (Class)ProfileCardCommandOuterClass$ProfileCardCommand.class);
    }
    
    private ProfileCardCommandOuterClass$ProfileCardCommand() {
        this.b = "";
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = ProfileCardCommandOuterClass$ProfileCardCommand.f) == null) {
                    synchronized (ProfileCardCommandOuterClass$ProfileCardCommand.class) {
                        if (ProfileCardCommandOuterClass$ProfileCardCommand.f == null) {
                            ProfileCardCommandOuterClass$ProfileCardCommand.f = (ahbe)new agzb((agzi)ProfileCardCommandOuterClass$ProfileCardCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ProfileCardCommandOuterClass$ProfileCardCommand.a;
            }
            case 4: {
                return new agza((agzi)ProfileCardCommandOuterClass$ProfileCardCommand.a);
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
