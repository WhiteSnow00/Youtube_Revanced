// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand extends ahbh implements ahcw
{
    public static final ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand a;
    private static volatile ahdd f;
    public static final ahbf showMiniplayerCommand;
    public int b;
    public aiqj c;
    public boolean d;
    public boolean e;
    private ajut g;
    private byte h;
    
    static {
        final ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand a2 = new ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand();
        ahbh.registerDefaultInstance((Class)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class, (ahbh)(a = a2));
        showMiniplayerCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 339694216, ahek.k, (Class)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class);
    }
    
    private ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f) == null) {
                    synchronized (ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class) {
                        if (ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f == null) {
                            ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f = (ahdd)new ahba((ahbh)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a);
            }
            case 3: {
                return new ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u1409\u0000\u0003\u1007\u0001\u0004\u1409\u0002\u0005\u1007\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
