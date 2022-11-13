// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SectionReloadCommandOuterClass$SectionReloadCommand extends ahbh implements ahcw
{
    public static final SectionReloadCommandOuterClass$SectionReloadCommand a;
    private static volatile ahdd f;
    public static final ahbf sectionReloadCommand;
    public int b;
    public int c;
    public Object d;
    public String e;
    private byte g;
    
    static {
        final SectionReloadCommandOuterClass$SectionReloadCommand a2 = new SectionReloadCommandOuterClass$SectionReloadCommand();
        ahbh.registerDefaultInstance((Class)SectionReloadCommandOuterClass$SectionReloadCommand.class, (ahbh)(a = a2));
        sectionReloadCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 354135686, ahek.k, (Class)SectionReloadCommandOuterClass$SectionReloadCommand.class);
    }
    
    private SectionReloadCommandOuterClass$SectionReloadCommand() {
        this.c = 0;
        this.g = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = SectionReloadCommandOuterClass$SectionReloadCommand.f) == null) {
                    synchronized (SectionReloadCommandOuterClass$SectionReloadCommand.class) {
                        if (SectionReloadCommandOuterClass$SectionReloadCommand.f == null) {
                            SectionReloadCommandOuterClass$SectionReloadCommand.f = (ahdd)new ahba((ahbh)SectionReloadCommandOuterClass$SectionReloadCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return SectionReloadCommandOuterClass$SectionReloadCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)SectionReloadCommandOuterClass$SectionReloadCommand.a);
            }
            case 3: {
                return new SectionReloadCommandOuterClass$SectionReloadCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SectionReloadCommandOuterClass$SectionReloadCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u143c\u0000\u0002\u1008\u0002\u0003\u103b\u0000", new Object[] { "d", "c", "b", aiyg.class, "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
