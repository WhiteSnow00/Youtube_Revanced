// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LoadMarkersCommandOuterClass$LoadMarkersCommand extends ahbh implements ahcw
{
    public static final LoadMarkersCommandOuterClass$LoadMarkersCommand a;
    private static volatile ahdd d;
    public static final ahbf loadMarkersCommand;
    public ahbx b;
    public ahbx c;
    
    static {
        final LoadMarkersCommandOuterClass$LoadMarkersCommand a2 = new LoadMarkersCommandOuterClass$LoadMarkersCommand();
        ahbh.registerDefaultInstance((Class)LoadMarkersCommandOuterClass$LoadMarkersCommand.class, (ahbh)(a = a2));
        loadMarkersCommand = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 407683780, ahek.k, (Class)LoadMarkersCommandOuterClass$LoadMarkersCommand.class);
    }
    
    private LoadMarkersCommandOuterClass$LoadMarkersCommand() {
        this.b = ahbh.emptyProtobufList();
        this.c = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = LoadMarkersCommandOuterClass$LoadMarkersCommand.d) == null) {
                    synchronized (LoadMarkersCommandOuterClass$LoadMarkersCommand.class) {
                        if (LoadMarkersCommandOuterClass$LoadMarkersCommand.d == null) {
                            LoadMarkersCommandOuterClass$LoadMarkersCommand.d = (ahdd)new ahba((ahbh)LoadMarkersCommandOuterClass$LoadMarkersCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LoadMarkersCommandOuterClass$LoadMarkersCommand.a;
            }
            case 4: {
                return new ahaz((ahbh)LoadMarkersCommandOuterClass$LoadMarkersCommand.a);
            }
            case 3: {
                return new LoadMarkersCommandOuterClass$LoadMarkersCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)LoadMarkersCommandOuterClass$LoadMarkersCommand.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[] { "b", "c" });
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
