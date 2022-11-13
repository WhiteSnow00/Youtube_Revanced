// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateFlowCommandOuterClass$UpdateFlowCommand extends ahbh implements ahcw
{
    public static final UpdateFlowCommandOuterClass$UpdateFlowCommand a;
    private static volatile ahdd g;
    public static final ahbf updateFlowCommand;
    public int b;
    public String c;
    public ahbx d;
    public aiqj e;
    public aiqj f;
    private byte h;
    
    static {
        final UpdateFlowCommandOuterClass$UpdateFlowCommand a2 = new UpdateFlowCommandOuterClass$UpdateFlowCommand();
        ahbh.registerDefaultInstance((Class)UpdateFlowCommandOuterClass$UpdateFlowCommand.class, (ahbh)(a = a2));
        updateFlowCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 371825304, ahek.k, (Class)UpdateFlowCommandOuterClass$UpdateFlowCommand.class);
    }
    
    private UpdateFlowCommandOuterClass$UpdateFlowCommand() {
        this.h = 2;
        this.c = "";
        this.d = emptyProtobufList();
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
                final ahdd g;
                if ((g = UpdateFlowCommandOuterClass$UpdateFlowCommand.g) == null) {
                    synchronized (UpdateFlowCommandOuterClass$UpdateFlowCommand.class) {
                        if (UpdateFlowCommandOuterClass$UpdateFlowCommand.g == null) {
                            UpdateFlowCommandOuterClass$UpdateFlowCommand.g = (ahdd)new ahba((ahbh)UpdateFlowCommandOuterClass$UpdateFlowCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return UpdateFlowCommandOuterClass$UpdateFlowCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateFlowCommandOuterClass$UpdateFlowCommand.a);
            }
            case 3: {
                return new UpdateFlowCommandOuterClass$UpdateFlowCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateFlowCommandOuterClass$UpdateFlowCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u1409\u0002", new Object[] { "b", "c", "d", anuv.class, "e", "f" });
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
