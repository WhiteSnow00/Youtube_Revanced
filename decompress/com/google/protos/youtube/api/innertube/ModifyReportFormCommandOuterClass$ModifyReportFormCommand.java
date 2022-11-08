// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyReportFormCommandOuterClass$ModifyReportFormCommand extends agzi implements ahax
{
    public static final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a;
    private static volatile ahbe c;
    public static final agzg modifyReportFormCommand;
    public int b;
    private int d;
    
    static {
        final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a2 = new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
        agzi.registerDefaultInstance((Class)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class, (agzi)(a = a2));
        modifyReportFormCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 171313789, ahcm.k, (Class)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class);
    }
    
    private ModifyReportFormCommandOuterClass$ModifyReportFormCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c) == null) {
                    synchronized (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class) {
                        if (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c == null) {
                            ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c = (ahbe)new agzb((agzi)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a;
            }
            case 4: {
                return new agza((agzi)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a);
            }
            case 3: {
                return new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", amcq.u });
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
