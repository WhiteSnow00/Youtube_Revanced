// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand extends ahbh implements ahcw
{
    public static final ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand a;
    private static volatile ahdd f;
    public static final ahbf showTransientPlayerScrimOverlayCommand;
    public anuv b;
    public int c;
    public int d;
    public int e;
    private int g;
    private byte h;
    
    static {
        final ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand a2 = new ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand();
        ahbh.registerDefaultInstance((Class)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class, (ahbh)(a = a2));
        showTransientPlayerScrimOverlayCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 408748412, ahek.k, (Class)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class);
    }
    
    private ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand() {
        this.h = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f) == null) {
                    synchronized (ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class) {
                        if (ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f == null) {
                            ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f = (ahdd)new ahba((ahbh)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a);
            }
            case 3: {
                return new ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
