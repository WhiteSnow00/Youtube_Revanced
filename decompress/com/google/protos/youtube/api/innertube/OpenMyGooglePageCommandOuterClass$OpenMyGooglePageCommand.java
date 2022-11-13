// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand extends ahbh implements ahcw
{
    public static final OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand a;
    private static volatile ahdd e;
    public static final ahbf openMyGooglePageCommand;
    public int b;
    public int c;
    public ahcr d;
    
    static {
        final OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand a2 = new OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand();
        ahbh.registerDefaultInstance((Class)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class, (ahbh)(a = a2));
        openMyGooglePageCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 432546775, ahek.k, (Class)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class);
    }
    
    private OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand() {
        this.d = ahcr.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e) == null) {
                    synchronized (OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class) {
                        if (OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e == null) {
                            OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e = (ahdd)new ahba((ahbh)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a);
            }
            case 3: {
                return new OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1004\u0000\u00022", new Object[] { "b", "c", "d", amxw.a });
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
