// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand extends agzi implements ahax
{
    public static final ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand a;
    private static volatile ahbe f;
    public static final agzg showTransientPlayerScrimOverlayCommand;
    public anss b;
    public int c;
    public int d;
    public int e;
    private int g;
    private byte h;
    
    static {
        final ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand a2 = new ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand();
        agzi.registerDefaultInstance((Class)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class, (agzi)(a = a2));
        showTransientPlayerScrimOverlayCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 408748412, ahcm.k, (Class)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class);
    }
    
    private ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand() {
        this.h = 2;
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
                if ((f = ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f) == null) {
                    synchronized (ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.class) {
                        if (ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f == null) {
                            ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.f = (ahbe)new agzb((agzi)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a);
            }
            case 3: {
                return new ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
