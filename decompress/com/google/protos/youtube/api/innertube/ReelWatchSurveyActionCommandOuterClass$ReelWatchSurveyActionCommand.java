// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand extends agzi implements ahax
{
    public static final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand a;
    private static volatile ahbe d;
    public static final agzg reelWatchSurveyActionCommand;
    public String b;
    public int c;
    private int e;
    
    static {
        final ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand a2 = new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
        agzi.registerDefaultInstance((Class)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, (agzi)(a = a2));
        reelWatchSurveyActionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 326347078, ahcm.k, (Class)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class);
    }
    
    private ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d) == null) {
                    synchronized (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class) {
                        if (ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d == null) {
                            ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.d = (ahbe)new agzb((agzi)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a;
            }
            case 4: {
                return new agza((agzi)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a);
            }
            case 3: {
                return new ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "e", "b", "c", anqs.j });
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
