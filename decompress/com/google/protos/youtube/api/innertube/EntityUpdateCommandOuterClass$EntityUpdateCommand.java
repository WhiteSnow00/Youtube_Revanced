// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class EntityUpdateCommandOuterClass$EntityUpdateCommand extends agzi implements ahax
{
    public static final EntityUpdateCommandOuterClass$EntityUpdateCommand a;
    private static volatile ahbe c;
    public static final agzg entityUpdateCommand;
    public ajnr b;
    private int d;
    private byte e;
    
    static {
        final EntityUpdateCommandOuterClass$EntityUpdateCommand a2 = new EntityUpdateCommandOuterClass$EntityUpdateCommand();
        agzi.registerDefaultInstance((Class)EntityUpdateCommandOuterClass$EntityUpdateCommand.class, (agzi)(a = a2));
        entityUpdateCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 300347778, ahcm.k, (Class)EntityUpdateCommandOuterClass$EntityUpdateCommand.class);
    }
    
    private EntityUpdateCommandOuterClass$EntityUpdateCommand() {
        this.e = 2;
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
                if ((c = EntityUpdateCommandOuterClass$EntityUpdateCommand.c) == null) {
                    synchronized (EntityUpdateCommandOuterClass$EntityUpdateCommand.class) {
                        if (EntityUpdateCommandOuterClass$EntityUpdateCommand.c == null) {
                            EntityUpdateCommandOuterClass$EntityUpdateCommand.c = (ahbe)new agzb((agzi)EntityUpdateCommandOuterClass$EntityUpdateCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return EntityUpdateCommandOuterClass$EntityUpdateCommand.a;
            }
            case 4: {
                return new agza((agzi)EntityUpdateCommandOuterClass$EntityUpdateCommand.a);
            }
            case 3: {
                return new EntityUpdateCommandOuterClass$EntityUpdateCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)EntityUpdateCommandOuterClass$EntityUpdateCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
