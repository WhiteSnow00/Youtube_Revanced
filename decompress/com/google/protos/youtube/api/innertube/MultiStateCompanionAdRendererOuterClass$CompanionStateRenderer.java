// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer extends ahbh implements ahcw
{
    public static final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a;
    public static final ahbf companionStateRenderer;
    private static volatile ahdd f;
    public int b;
    public String c;
    public anuv d;
    public boolean e;
    private aiqj g;
    private byte h;
    
    static {
        final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a2 = new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
        ahbh.registerDefaultInstance((Class)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class, (ahbh)(a = a2));
        companionStateRenderer = ahbh.newSingularGeneratedExtension((MessageLite)anuv.a, (Object)a2, (MessageLite)a2, (ahbm)null, 166494362, ahek.k, (Class)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class);
    }
    
    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer() {
        this.h = 2;
        this.c = "";
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
                if ((f = MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f) == null) {
                    synchronized (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class) {
                        if (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f == null) {
                            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.f = (ahdd)new ahba((ahbh)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a;
            }
            case 4: {
                return new ahaz((ahbh)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a);
            }
            case 3: {
                return new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", "g", "e" });
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
