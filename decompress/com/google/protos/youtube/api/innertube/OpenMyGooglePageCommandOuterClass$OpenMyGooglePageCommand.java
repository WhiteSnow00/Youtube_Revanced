// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand extends agzi implements ahax
{
    public static final OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand a;
    private static volatile ahbe e;
    public static final agzg openMyGooglePageCommand;
    public int b;
    public int c;
    public ahas d;
    
    static {
        final OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand a2 = new OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand();
        agzi.registerDefaultInstance((Class)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class, (agzi)(a = a2));
        openMyGooglePageCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 432546775, ahcm.k, (Class)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class);
    }
    
    private OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand() {
        this.d = ahas.a;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e) == null) {
                    synchronized (OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.class) {
                        if (OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e == null) {
                            OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.e = (ahbe)new agzb((agzi)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a;
            }
            case 4: {
                return new agza((agzi)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a);
            }
            case 3: {
                return new OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u1004\u0000\u00022", new Object[] { "b", "c", "d", amvs.a });
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
