// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class InlineAuthCommandOuterClass$InlineAuthCommand extends ahbh implements ahcw
{
    public static final InlineAuthCommandOuterClass$InlineAuthCommand a;
    public static final ahbf inlineAuthCommand;
    private static volatile ahdd j;
    public int b;
    public aiqj c;
    public aiqj d;
    public aiqj e;
    public aiqj f;
    public anuv g;
    public ahbx h;
    public aiqj i;
    private byte k;
    
    static {
        final InlineAuthCommandOuterClass$InlineAuthCommand a2 = new InlineAuthCommandOuterClass$InlineAuthCommand();
        ahbh.registerDefaultInstance((Class)InlineAuthCommandOuterClass$InlineAuthCommand.class, (ahbh)(a = a2));
        inlineAuthCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 196607391, ahek.k, (Class)InlineAuthCommandOuterClass$InlineAuthCommand.class);
    }
    
    private InlineAuthCommandOuterClass$InlineAuthCommand() {
        this.k = 2;
        this.h = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = InlineAuthCommandOuterClass$InlineAuthCommand.j) == null) {
                    synchronized (InlineAuthCommandOuterClass$InlineAuthCommand.class) {
                        if (InlineAuthCommandOuterClass$InlineAuthCommand.j == null) {
                            InlineAuthCommandOuterClass$InlineAuthCommand.j = (ahdd)new ahba((ahbh)InlineAuthCommandOuterClass$InlineAuthCommand.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return InlineAuthCommandOuterClass$InlineAuthCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)InlineAuthCommandOuterClass$InlineAuthCommand.a);
            }
            case 3: {
                return new InlineAuthCommandOuterClass$InlineAuthCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)InlineAuthCommandOuterClass$InlineAuthCommand.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u041b\u0007\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h", anuv.class, "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
