// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand extends ahbh implements ahcw
{
    public static final UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand a;
    private static volatile ahdd d;
    public static final ahbf updateLatestEventCreationTimestampCommand;
    public long b;
    public String c;
    private int e;
    
    static {
        final UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand a2 = new UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand();
        ahbh.registerDefaultInstance((Class)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.class, (ahbh)(a = a2));
        updateLatestEventCreationTimestampCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 410014803, ahek.k, (Class)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.class);
    }
    
    private UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.d) == null) {
                    synchronized (UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.class) {
                        if (UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.d == null) {
                            UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.d = (ahdd)new ahba((ahbh)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.a);
            }
            case 3: {
                return new UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1003\u0000\u0002\u1008\u0001", new Object[] { "e", "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
