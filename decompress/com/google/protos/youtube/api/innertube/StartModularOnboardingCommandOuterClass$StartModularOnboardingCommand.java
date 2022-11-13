// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand extends ahbh implements ahcw
{
    public static final StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand a;
    private static volatile ahdd h;
    public static final ahbf startModularOnboardingCommand;
    public aima b;
    public String c;
    public String d;
    public aiqj e;
    public boolean f;
    public boolean g;
    private int i;
    private byte j;
    
    static {
        final StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand a2 = new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
        ahbh.registerDefaultInstance((Class)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class, (ahbh)(a = a2));
        startModularOnboardingCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 301098174, ahek.k, (Class)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class);
    }
    
    private StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand() {
        this.j = 2;
        this.c = "";
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.h) == null) {
                    synchronized (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class) {
                        if (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.h == null) {
                            StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.h = (ahdd)new ahba((ahbh)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.a);
            }
            case 3: {
                return new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "i", "b", "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
