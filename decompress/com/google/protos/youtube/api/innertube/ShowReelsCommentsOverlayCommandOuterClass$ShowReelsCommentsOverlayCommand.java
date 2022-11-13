// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand extends ahbh implements ahcw
{
    public static final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand a;
    private static volatile ahdd d;
    public static final ahbf showReelsCommentsOverlayCommand;
    public int b;
    public Object c;
    private byte e;
    
    static {
        final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand a2 = new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
        ahbh.registerDefaultInstance((Class)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, (ahbh)(a = a2));
        showReelsCommentsOverlayCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 206635851, ahek.k, (Class)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class);
    }
    
    private ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand() {
        this.b = 0;
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d) == null) {
                    synchronized (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class) {
                        if (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d == null) {
                            ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d = (ahdd)new ahba((ahbh)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a);
            }
            case 3: {
                return new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000", new Object[] { "c", "b", anuv.class, anuv.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
