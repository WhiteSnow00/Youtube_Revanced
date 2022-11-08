// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer extends agzi implements ahax
{
    public static final FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer a;
    private static volatile ahbe e;
    public static final agzg filterChipBarElementRenderer;
    public int b;
    public anss c;
    public String d;
    private byte f;
    
    static {
        final FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer a2 = new FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer();
        agzi.registerDefaultInstance((Class)FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.class, (agzi)(a = a2));
        filterChipBarElementRenderer = agzi.newSingularGeneratedExtension((MessageLite)anss.a, (Object)a2, (MessageLite)a2, (agzn)null, 420115721, ahcm.k, (Class)FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.class);
    }
    
    private FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer() {
        this.f = 2;
        this.d = "";
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
                if ((e = FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.e) == null) {
                    synchronized (FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.class) {
                        if (FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.e == null) {
                            FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.e = (ahbe)new agzb((agzi)FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.a;
            }
            case 4: {
                return new agza((agzi)FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.a);
            }
            case 3: {
                return new FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer();
            }
            case 2: {
                return newMessageInfo((MessageLite)FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
