// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer extends agzi implements ahax
{
    public static final DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer a;
    private static volatile ahbe d;
    public static final agzg downloadsPageEntryPointRenderer;
    public int b;
    public anss c;
    private byte e;
    
    static {
        final DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer a2 = new DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer();
        agzi.registerDefaultInstance((Class)DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.class, (agzi)(a = a2));
        downloadsPageEntryPointRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 474376530, ahcm.k, (Class)DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.class);
    }
    
    private DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer() {
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
                if ((d = DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.d) == null) {
                    synchronized (DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.class) {
                        if (DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.d == null) {
                            DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.d = (ahbe)new agzb((agzi)DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.a;
            }
            case 4: {
                return new agza((agzi)DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.a);
            }
            case 3: {
                return new DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
