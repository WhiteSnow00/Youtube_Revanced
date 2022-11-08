// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand extends agzi implements ahax
{
    public static final ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand a;
    private static volatile ahbe f;
    public static final agzg showMiniplayerCommand;
    public int b;
    public aioe c;
    public boolean d;
    public boolean e;
    private ajsq g;
    private byte h;
    
    static {
        final ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand a2 = new ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand();
        agzi.registerDefaultInstance((Class)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class, (agzi)(a = a2));
        showMiniplayerCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 339694216, ahcm.k, (Class)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class);
    }
    
    private ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand() {
        this.h = 2;
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
                final ahbe f;
                if ((f = ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f) == null) {
                    synchronized (ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.class) {
                        if (ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f == null) {
                            ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.f = (ahbe)new agzb((agzi)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a);
            }
            case 3: {
                return new ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0002\u0002\u1409\u0000\u0003\u1007\u0001\u0004\u1409\u0002\u0005\u1007\u0003", new Object[] { "b", "c", "d", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
