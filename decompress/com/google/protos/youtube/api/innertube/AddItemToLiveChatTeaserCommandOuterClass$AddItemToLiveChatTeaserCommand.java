// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand extends ahbh implements ahcw
{
    public static final AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand a;
    public static final ahbf addItemToChatTeaserCommand;
    private static volatile ahdd g;
    public anuv b;
    public ahan c;
    public alrf d;
    public long e;
    public String f;
    private int h;
    private byte i;
    
    static {
        final AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand a2 = new AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand();
        ahbh.registerDefaultInstance((Class)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class, (ahbh)(a = a2));
        addItemToChatTeaserCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 392792774, ahek.k, (Class)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class);
    }
    
    private AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand() {
        this.i = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g) == null) {
                    synchronized (AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.class) {
                        if (AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g == null) {
                            AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.g = (ahdd)new ahba((ahbh)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a);
            }
            case 3: {
                return new AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1003\u0003\u0005\u1008\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
