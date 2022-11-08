// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class LoadMarkersCommandOuterClass$LoadMarkersCommand extends agzi implements ahax
{
    public static final LoadMarkersCommandOuterClass$LoadMarkersCommand a;
    private static volatile ahbe d;
    public static final agzg loadMarkersCommand;
    public agzy b;
    public agzy c;
    
    static {
        final LoadMarkersCommandOuterClass$LoadMarkersCommand a2 = new LoadMarkersCommandOuterClass$LoadMarkersCommand();
        agzi.registerDefaultInstance((Class)LoadMarkersCommandOuterClass$LoadMarkersCommand.class, (agzi)(a = a2));
        loadMarkersCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 407683780, ahcm.k, (Class)LoadMarkersCommandOuterClass$LoadMarkersCommand.class);
    }
    
    private LoadMarkersCommandOuterClass$LoadMarkersCommand() {
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = LoadMarkersCommandOuterClass$LoadMarkersCommand.d) == null) {
                    synchronized (LoadMarkersCommandOuterClass$LoadMarkersCommand.class) {
                        if (LoadMarkersCommandOuterClass$LoadMarkersCommand.d == null) {
                            LoadMarkersCommandOuterClass$LoadMarkersCommand.d = (ahbe)new agzb((agzi)LoadMarkersCommandOuterClass$LoadMarkersCommand.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return LoadMarkersCommandOuterClass$LoadMarkersCommand.a;
            }
            case 4: {
                return new agza((agzi)LoadMarkersCommandOuterClass$LoadMarkersCommand.a);
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
