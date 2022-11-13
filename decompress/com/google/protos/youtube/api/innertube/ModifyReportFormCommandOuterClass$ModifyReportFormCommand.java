// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ModifyReportFormCommandOuterClass$ModifyReportFormCommand extends ahbh implements ahcw
{
    public static final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a;
    private static volatile ahdd c;
    public static final ahbf modifyReportFormCommand;
    public int b;
    private int d;
    
    static {
        final ModifyReportFormCommandOuterClass$ModifyReportFormCommand a2 = new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
        ahbh.registerDefaultInstance((Class)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class, (ahbh)(a = a2));
        modifyReportFormCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 171313789, ahek.k, (Class)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class);
    }
    
    private ModifyReportFormCommandOuterClass$ModifyReportFormCommand() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c) == null) {
                    synchronized (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.class) {
                        if (ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c == null) {
                            ModifyReportFormCommandOuterClass$ModifyReportFormCommand.c = (ahdd)new ahba((ahbh)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a);
            }
            case 3: {
                return new ModifyReportFormCommandOuterClass$ModifyReportFormCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ModifyReportFormCommandOuterClass$ModifyReportFormCommand.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "d", "b", ampw.b });
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
