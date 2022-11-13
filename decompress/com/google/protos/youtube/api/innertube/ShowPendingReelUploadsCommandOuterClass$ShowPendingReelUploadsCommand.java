// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand extends ahbh implements ahcw
{
    public static final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a;
    private static volatile ahdd e;
    public static final ahbf showPendingReelUploadsCommand;
    public int b;
    public anuv c;
    public aiqj d;
    private byte f;
    
    static {
        final ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand a2 = new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
        ahbh.registerDefaultInstance((Class)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class, (ahbh)(a = a2));
        showPendingReelUploadsCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 291405045, ahek.k, (Class)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class);
    }
    
    private ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand() {
        this.f = 2;
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
                if ((e = ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e) == null) {
                    synchronized (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.class) {
                        if (ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e == null) {
                            ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.e = (ahdd)new ahba((ahbh)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a);
            }
            case 3: {
                return new ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
