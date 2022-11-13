// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand extends ahbh implements ahcw
{
    public static final PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand a;
    private static volatile ahdd c;
    public static final ahbf prependNewerCommentsCommand;
    public ahbx b;
    private byte d;
    
    static {
        final PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand a2 = new PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand();
        ahbh.registerDefaultInstance((Class)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class, (ahbh)(a = a2));
        prependNewerCommentsCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 375135162, ahek.k, (Class)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class);
    }
    
    private PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand() {
        this.d = 2;
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c) == null) {
                    synchronized (PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class) {
                        if (PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c == null) {
                            PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c = (ahdd)new ahba((ahbh)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a);
            }
            case 3: {
                return new PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anuv.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
