// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand extends agzi implements ahax
{
    public static final MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand a;
    private static volatile ahbe c;
    public static final agzg markBelowPlayerSurveyDisplayedCommand;
    public String b;
    private int d;
    
    static {
        final MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand a2 = new MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand();
        agzi.registerDefaultInstance((Class)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.class, (agzi)(a = a2));
        markBelowPlayerSurveyDisplayedCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 288176941, ahcm.k, (Class)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.class);
    }
    
    private MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.c) == null) {
                    synchronized (MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.class) {
                        if (MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.c == null) {
                            MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.c = (ahbe)new agzb((agzi)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.a;
            }
            case 4: {
                return new agza((agzi)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.a);
            }
            case 3: {
                return new MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
