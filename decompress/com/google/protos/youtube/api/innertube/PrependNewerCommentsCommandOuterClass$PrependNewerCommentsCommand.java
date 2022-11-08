// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand extends agzi implements ahax
{
    public static final PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand a;
    private static volatile ahbe c;
    public static final agzg prependNewerCommentsCommand;
    public agzy b;
    private byte d;
    
    static {
        final PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand a2 = new PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand();
        agzi.registerDefaultInstance((Class)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class, (agzi)(a = a2));
        prependNewerCommentsCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 375135162, ahcm.k, (Class)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class);
    }
    
    private PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand() {
        this.d = 2;
        this.b = emptyProtobufList();
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
                final ahbe c;
                if ((c = PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c) == null) {
                    synchronized (PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.class) {
                        if (PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c == null) {
                            PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.c = (ahbe)new agzb((agzi)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a;
            }
            case 4: {
                return new agza((agzi)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a);
            }
            case 3: {
                return new PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
