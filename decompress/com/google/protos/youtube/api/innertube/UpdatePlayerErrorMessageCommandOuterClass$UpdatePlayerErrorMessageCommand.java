// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand extends ahbh implements ahcw
{
    public static final UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand a;
    private static volatile ahdd c;
    public static final ahbf updatePlayerErrorMessageCommand;
    public akwy b;
    private int d;
    private byte e;
    
    static {
        final UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand a2 = new UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand();
        ahbh.registerDefaultInstance((Class)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.class, (ahbh)(a = a2));
        updatePlayerErrorMessageCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 395993086, ahek.k, (Class)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.class);
    }
    
    private UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.c) == null) {
                    synchronized (UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.class) {
                        if (UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.c == null) {
                            UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.c = (ahdd)new ahba((ahbh)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.a);
            }
            case 3: {
                return new UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
