// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand extends agzi implements ahax
{
    public static final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand a;
    private static volatile ahbe d;
    public static final agzg showReelsCommentsOverlayCommand;
    public int b;
    public Object c;
    private byte e;
    
    static {
        final ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand a2 = new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
        agzi.registerDefaultInstance((Class)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, (agzi)(a = a2));
        showReelsCommentsOverlayCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 206635851, ahcm.k, (Class)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class);
    }
    
    private ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d) == null) {
                    synchronized (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class) {
                        if (ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d == null) {
                            ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.d = (ahbe)new agzb((agzi)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a);
            }
            case 3: {
                return new ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000", new Object[] { "c", "b", anss.class, anss.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
