// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer extends agzi implements ahax
{
    public static final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a;
    public static final agzg companionStateRenderer;
    private static volatile ahbe f;
    public int b;
    public String c;
    public anss d;
    public boolean e;
    private aioe g;
    private byte h;
    
    static {
        final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a2 = new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
        agzi.registerDefaultInstance((Class)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class, (agzi)(a = a2));
        companionStateRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 166494362, ahcm.k, (Class)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class);
    }
    
    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer() {
        this.h = 2;
        this.c = "";
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
                if ((f = MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f) == null) {
                    synchronized (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class) {
                        if (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f == null) {
                            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f = (ahbe)new agzb((agzi)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a;
            }
            case 4: {
                return new agza((agzi)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a);
            }
            case 3: {
                return new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "g", "e" });
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
