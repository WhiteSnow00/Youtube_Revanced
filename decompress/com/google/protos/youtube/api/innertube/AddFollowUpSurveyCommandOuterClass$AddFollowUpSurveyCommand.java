// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand extends agzi implements ahax
{
    public static final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a;
    public static final agzg addFollowUpSurveyCommand;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public ajsq d;
    private byte f;
    
    static {
        final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a2 = new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
        agzi.registerDefaultInstance((Class)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class, (agzi)(a = a2));
        addFollowUpSurveyCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 194801007, ahcm.k, (Class)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class);
    }
    
    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e) == null) {
                    synchronized (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class) {
                        if (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e == null) {
                            AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e = (ahbe)new agzb((agzi)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a;
            }
            case 4: {
                return new agza((agzi)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a);
            }
            case 3: {
                return new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "b", "c", anss.class, "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
