// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand extends agzi implements ahax
{
    public static final AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand a;
    public static final agzg addItemToChatTeaserCommand;
    private static volatile ahbe g;
    public anss b;
    public agyo c;
    public alpc d;
    public long e;
    public String f;
    private int h;
    private byte i;
    
    static {
        final AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand a2 = new AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand();
        agzi.registerDefaultInstance((Class)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class, (agzi)(a = a2));
        addItemToChatTeaserCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 392792774, ahcm.k, (Class)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class);
    }
    
    private AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand() {
        this.i = 2;
        this.f = "";
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
                final ahbe g;
                if ((g = AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g) == null) {
                    synchronized (AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class) {
                        if (AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g == null) {
                            AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g = (ahbe)new agzb((agzi)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a;
            }
            case 4: {
                return new agza((agzi)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a);
            }
            case 3: {
                return new AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1003\u0003\u0005\u1008\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
