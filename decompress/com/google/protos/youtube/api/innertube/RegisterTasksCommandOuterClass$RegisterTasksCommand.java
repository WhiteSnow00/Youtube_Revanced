// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class RegisterTasksCommandOuterClass$RegisterTasksCommand extends ahbh implements ahcw
{
    public static final RegisterTasksCommandOuterClass$RegisterTasksCommand a;
    private static volatile ahdd c;
    public static final ahbf registerTasksCommand;
    public ahbx b;
    private byte d;
    
    static {
        final RegisterTasksCommandOuterClass$RegisterTasksCommand a2 = new RegisterTasksCommandOuterClass$RegisterTasksCommand();
        ahbh.registerDefaultInstance((Class)RegisterTasksCommandOuterClass$RegisterTasksCommand.class, (ahbh)(a = a2));
        registerTasksCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 377621461, ahek.k, (Class)RegisterTasksCommandOuterClass$RegisterTasksCommand.class);
    }
    
    private RegisterTasksCommandOuterClass$RegisterTasksCommand() {
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
                if ((c = RegisterTasksCommandOuterClass$RegisterTasksCommand.c) == null) {
                    synchronized (RegisterTasksCommandOuterClass$RegisterTasksCommand.class) {
                        if (RegisterTasksCommandOuterClass$RegisterTasksCommand.c == null) {
                            RegisterTasksCommandOuterClass$RegisterTasksCommand.c = (ahdd)new ahba((ahbh)RegisterTasksCommandOuterClass$RegisterTasksCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return RegisterTasksCommandOuterClass$RegisterTasksCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)RegisterTasksCommandOuterClass$RegisterTasksCommand.a);
            }
            case 3: {
                return new RegisterTasksCommandOuterClass$RegisterTasksCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)RegisterTasksCommandOuterClass$RegisterTasksCommand.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", aort.class });
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
