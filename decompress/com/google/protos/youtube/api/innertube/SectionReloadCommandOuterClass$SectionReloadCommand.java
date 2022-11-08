// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SectionReloadCommandOuterClass$SectionReloadCommand extends agzi implements ahax
{
    public static final SectionReloadCommandOuterClass$SectionReloadCommand a;
    private static volatile ahbe f;
    public static final agzg sectionReloadCommand;
    public int b;
    public int c;
    public Object d;
    public String e;
    private byte g;
    
    static {
        final SectionReloadCommandOuterClass$SectionReloadCommand a2 = new SectionReloadCommandOuterClass$SectionReloadCommand();
        agzi.registerDefaultInstance((Class)SectionReloadCommandOuterClass$SectionReloadCommand.class, (agzi)(a = a2));
        sectionReloadCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 354135686, ahcm.k, (Class)SectionReloadCommandOuterClass$SectionReloadCommand.class);
    }
    
    private SectionReloadCommandOuterClass$SectionReloadCommand() {
        this.c = 0;
        this.g = 2;
        this.e = "";
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
                final ahbe f;
                if ((f = SectionReloadCommandOuterClass$SectionReloadCommand.f) == null) {
                    synchronized (SectionReloadCommandOuterClass$SectionReloadCommand.class) {
                        if (SectionReloadCommandOuterClass$SectionReloadCommand.f == null) {
                            SectionReloadCommandOuterClass$SectionReloadCommand.f = (ahbe)new agzb((agzi)SectionReloadCommandOuterClass$SectionReloadCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return SectionReloadCommandOuterClass$SectionReloadCommand.a;
            }
            case 4: {
                return new agza((agzi)SectionReloadCommandOuterClass$SectionReloadCommand.a);
            }
            case 3: {
                return new SectionReloadCommandOuterClass$SectionReloadCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SectionReloadCommandOuterClass$SectionReloadCommand.a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u143c\u0000\u0002\u1008\u0002\u0003\u103b\u0000", new Object[] { "d", "c", "b", aiwb.class, "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
