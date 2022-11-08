// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetSurveyCommandOuterClass$GetSurveyCommand extends agzi implements ahax
{
    public static final GetSurveyCommandOuterClass$GetSurveyCommand a;
    private static volatile ahbe e;
    public static final agzg getSurveyCommand;
    public int b;
    public akyt c;
    public int d;
    
    static {
        final GetSurveyCommandOuterClass$GetSurveyCommand a2 = new GetSurveyCommandOuterClass$GetSurveyCommand();
        agzi.registerDefaultInstance((Class)GetSurveyCommandOuterClass$GetSurveyCommand.class, (agzi)(a = a2));
        getSurveyCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 284673439, ahcm.k, (Class)GetSurveyCommandOuterClass$GetSurveyCommand.class);
    }
    
    private GetSurveyCommandOuterClass$GetSurveyCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = GetSurveyCommandOuterClass$GetSurveyCommand.e) == null) {
                    synchronized (GetSurveyCommandOuterClass$GetSurveyCommand.class) {
                        if (GetSurveyCommandOuterClass$GetSurveyCommand.e == null) {
                            GetSurveyCommandOuterClass$GetSurveyCommand.e = (ahbe)new agzb((agzi)GetSurveyCommandOuterClass$GetSurveyCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return GetSurveyCommandOuterClass$GetSurveyCommand.a;
            }
            case 4: {
                return new agza((agzi)GetSurveyCommandOuterClass$GetSurveyCommand.a);
            }
            case 3: {
                return new GetSurveyCommandOuterClass$GetSurveyCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetSurveyCommandOuterClass$GetSurveyCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", akwf.j });
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
