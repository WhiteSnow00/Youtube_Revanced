// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineAuthCommandOuterClass$InlineAuthCommand extends agzi implements ahax
{
    public static final InlineAuthCommandOuterClass$InlineAuthCommand a;
    public static final agzg inlineAuthCommand;
    private static volatile ahbe j;
    public int b;
    public aioe c;
    public aioe d;
    public aioe e;
    public aioe f;
    public anss g;
    public agzy h;
    public aioe i;
    private byte k;
    
    static {
        final InlineAuthCommandOuterClass$InlineAuthCommand a2 = new InlineAuthCommandOuterClass$InlineAuthCommand();
        agzi.registerDefaultInstance((Class)InlineAuthCommandOuterClass$InlineAuthCommand.class, (agzi)(a = a2));
        inlineAuthCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 196607391, ahcm.k, (Class)InlineAuthCommandOuterClass$InlineAuthCommand.class);
    }
    
    private InlineAuthCommandOuterClass$InlineAuthCommand() {
        this.k = 2;
        this.h = emptyProtobufList();
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
                final ahbe j;
                if ((j = InlineAuthCommandOuterClass$InlineAuthCommand.j) == null) {
                    synchronized (InlineAuthCommandOuterClass$InlineAuthCommand.class) {
                        if (InlineAuthCommandOuterClass$InlineAuthCommand.j == null) {
                            InlineAuthCommandOuterClass$InlineAuthCommand.j = (ahbe)new agzb((agzi)InlineAuthCommandOuterClass$InlineAuthCommand.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return InlineAuthCommandOuterClass$InlineAuthCommand.a;
            }
            case 4: {
                return new agza((agzi)InlineAuthCommandOuterClass$InlineAuthCommand.a);
            }
            case 3: {
                return new InlineAuthCommandOuterClass$InlineAuthCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)InlineAuthCommandOuterClass$InlineAuthCommand.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h", anss.class, "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
