// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand extends ahbh implements ahcw
{
    public static final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand a;
    private static volatile ahdd d;
    public static final ahbf reelWatchSurveyActionCommand;
    public String b;
    public int c;
    private int e;
    
    static {
        final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand a2 = new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
        ahbh.registerDefaultInstance((Class)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, (ahbh)(a = a2));
        reelWatchSurveyActionCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 326347078, ahek.k, (Class)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class);
    }
    
    private ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand() {
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
                if ((d = ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d) == null) {
                    synchronized (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class) {
                        if (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d == null) {
                            ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d = (ahdd)new ahba((ahbh)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a);
            }
            case 3: {
                return new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", ansm.k });
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
