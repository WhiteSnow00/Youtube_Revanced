// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand extends ahbh implements ahcw
{
    public static final ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand a;
    private static volatile ahdd h;
    public static final ahbf toggleEngagementPanelCommand;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public aogh f;
    public aiqj g;
    private byte i;
    
    static {
        final ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand a2 = new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
        ahbh.registerDefaultInstance((Class)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class, (ahbh)(a = a2));
        toggleEngagementPanelCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 369951587, ahek.k, (Class)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class);
    }
    
    private ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand() {
        this.c = 0;
        this.i = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.h) == null) {
                    synchronized (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class) {
                        if (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.h == null) {
                            ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.h = (ahdd)new ahba((ahbh)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.a);
            }
            case 3: {
                return new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u103b\u0000\u0002\u103c\u0000\u0003\u1007\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "d", "c", "b", ajpl.class, "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
