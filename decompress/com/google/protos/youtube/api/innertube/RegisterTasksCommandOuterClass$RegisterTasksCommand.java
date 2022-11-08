// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RegisterTasksCommandOuterClass$RegisterTasksCommand extends agzi implements ahax
{
    public static final RegisterTasksCommandOuterClass$RegisterTasksCommand a;
    private static volatile ahbe c;
    public static final agzg registerTasksCommand;
    public agzy b;
    private byte d;
    
    static {
        final RegisterTasksCommandOuterClass$RegisterTasksCommand a2 = new RegisterTasksCommandOuterClass$RegisterTasksCommand();
        agzi.registerDefaultInstance((Class)RegisterTasksCommandOuterClass$RegisterTasksCommand.class, (agzi)(a = a2));
        registerTasksCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 377621461, ahcm.k, (Class)RegisterTasksCommandOuterClass$RegisterTasksCommand.class);
    }
    
    private RegisterTasksCommandOuterClass$RegisterTasksCommand() {
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
                if ((c = RegisterTasksCommandOuterClass$RegisterTasksCommand.c) == null) {
                    synchronized (RegisterTasksCommandOuterClass$RegisterTasksCommand.class) {
                        if (RegisterTasksCommandOuterClass$RegisterTasksCommand.c == null) {
                            RegisterTasksCommandOuterClass$RegisterTasksCommand.c = (ahbe)new agzb((agzi)RegisterTasksCommandOuterClass$RegisterTasksCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RegisterTasksCommandOuterClass$RegisterTasksCommand.a;
            }
            case 4: {
                return new agza((agzi)RegisterTasksCommandOuterClass$RegisterTasksCommand.a);
            }
            case 3: {
                return new RegisterTasksCommandOuterClass$RegisterTasksCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RegisterTasksCommandOuterClass$RegisterTasksCommand.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aopq.class });
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
