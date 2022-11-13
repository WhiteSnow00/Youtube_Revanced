// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand extends ahbh implements ahcw
{
    public static final SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand a;
    private static volatile ahdd d;
    public static final ahbf silentSubmitUserFeedbackCommand;
    public String b;
    public ahcr c;
    private int e;
    
    static {
        final SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand a2 = new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
        ahbh.registerDefaultInstance((Class)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class, (ahbh)(a = a2));
        silentSubmitUserFeedbackCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 193239995, ahek.k, (Class)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class);
    }
    
    private SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand() {
        this.c = ahcr.a;
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.d) == null) {
                    synchronized (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.class) {
                        if (SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.d == null) {
                            SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.d = (ahdd)new ahba((ahbh)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.a);
            }
            case 3: {
                return new SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1008\u0000\u00022", new Object[] { "e", "b", "c", aohh.a });
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
