// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand extends ahbh implements ahcw
{
    public static final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a;
    public static final ahbf addFollowUpSurveyCommand;
    private static volatile ahdd e;
    public int b;
    public ahbx c;
    public ajut d;
    private byte f;
    
    static {
        final AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand a2 = new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
        ahbh.registerDefaultInstance((Class)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class, (ahbh)(a = a2));
        addFollowUpSurveyCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 194801007, ahek.k, (Class)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class);
    }
    
    private AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand() {
        this.f = 2;
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e) == null) {
                    synchronized (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.class) {
                        if (AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e == null) {
                            AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.e = (ahdd)new ahba((ahbh)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a);
            }
            case 3: {
                return new AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u041b\u0002\u1409\u0000", new Object[] { "b", "c", anuv.class, "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
