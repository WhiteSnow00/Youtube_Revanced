// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SubmitSurveyCommandOuterClass$SubmitSurveyCommand extends ahbh implements ahcw
{
    public static final SubmitSurveyCommandOuterClass$SubmitSurveyCommand a;
    private static volatile ahdd g;
    public static final ahbf submitSurveyCommand;
    public aolz b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    private int h;
    
    static {
        final SubmitSurveyCommandOuterClass$SubmitSurveyCommand a2 = new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
        ahbh.registerDefaultInstance((Class)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class, (ahbh)(a = a2));
        submitSurveyCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 288174649, ahek.k, (Class)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class);
    }
    
    private SubmitSurveyCommandOuterClass$SubmitSurveyCommand() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = SubmitSurveyCommandOuterClass$SubmitSurveyCommand.g) == null) {
                    synchronized (SubmitSurveyCommandOuterClass$SubmitSurveyCommand.class) {
                        if (SubmitSurveyCommandOuterClass$SubmitSurveyCommand.g == null) {
                            SubmitSurveyCommandOuterClass$SubmitSurveyCommand.g = (ahdd)new ahba((ahbh)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return SubmitSurveyCommandOuterClass$SubmitSurveyCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.a);
            }
            case 3: {
                return new SubmitSurveyCommandOuterClass$SubmitSurveyCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SubmitSurveyCommandOuterClass$SubmitSurveyCommand.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0005\u1007\u0004", new Object[] { "h", "b", "c", "d", "e", "f" });
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
