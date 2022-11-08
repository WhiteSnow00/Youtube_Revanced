// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class GetDownloadActionCommandOuterClass$GetDownloadActionCommand extends agzi implements ahax
{
    public static final GetDownloadActionCommandOuterClass$GetDownloadActionCommand a;
    public static final agzg getDownloadActionCommand;
    private static volatile ahbe k;
    public int b;
    public int c;
    public Object d;
    public boolean e;
    public boolean f;
    public int g;
    public String h;
    public boolean i;
    public String j;
    
    static {
        final GetDownloadActionCommandOuterClass$GetDownloadActionCommand a2 = new GetDownloadActionCommandOuterClass$GetDownloadActionCommand();
        agzi.registerDefaultInstance((Class)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.class, (agzi)(a = a2));
        getDownloadActionCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 382320942, ahcm.k, (Class)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.class);
    }
    
    private GetDownloadActionCommandOuterClass$GetDownloadActionCommand() {
        this.c = 0;
        this.h = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = GetDownloadActionCommandOuterClass$GetDownloadActionCommand.k) == null) {
                    synchronized (GetDownloadActionCommandOuterClass$GetDownloadActionCommand.class) {
                        if (GetDownloadActionCommandOuterClass$GetDownloadActionCommand.k == null) {
                            GetDownloadActionCommandOuterClass$GetDownloadActionCommand.k = (ahbe)new agzb((agzi)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return GetDownloadActionCommandOuterClass$GetDownloadActionCommand.a;
            }
            case 4: {
                return new agza((agzi)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.a);
            }
            case 3: {
                return new GetDownloadActionCommandOuterClass$GetDownloadActionCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)GetDownloadActionCommandOuterClass$GetDownloadActionCommand.a, "\u0001\b\u0001\u0001\u0001\u000b\b\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000\u0003\u100c\u0004\u0005\u1008\u0006\u0006\u1007\u0007\t\u1007\u0002\n\u1007\u0003\u000b\u1008\n", new Object[] { "d", "c", "b", "g", amuv.a(), "h", "i", "e", "f", "j" });
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
