// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer extends agzi implements ahax
{
    public static final PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer a;
    private static volatile ahbe e;
    public static final agzg postEphemeralityDialogRenderer;
    public int b;
    public ajsq c;
    public anss d;
    private byte f;
    
    static {
        final PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer a2 = new PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer();
        agzi.registerDefaultInstance((Class)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class, (agzi)(a = a2));
        postEphemeralityDialogRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 427886063, ahcm.k, (Class)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class);
    }
    
    private PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer() {
        this.f = 2;
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
                final ahbe e;
                if ((e = PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e) == null) {
                    synchronized (PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.class) {
                        if (PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e == null) {
                            PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.e = (ahbe)new agzb((agzi)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a;
            }
            case 4: {
                return new agza((agzi)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a);
            }
            case 3: {
                return new PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
