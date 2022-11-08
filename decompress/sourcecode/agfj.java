import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agfj extends agzi implements ahax
{
    private static final agfj a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    
    static {
        agzi.registerDefaultInstance(agfj.class, a = new agfj());
    }
    
    private agfj() {
    }
    
    public static agfi a() {
        return (agfi)agfj.a.createBuilder();
    }
    
    private void k(final int h) {
        this.c |= 0x10;
        this.h = h;
    }
    
    private void l(final int k) {
        this.c |= 0x80;
        this.k = k;
    }
    
    private void m(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void n(final int i) {
        this.c |= 0x20;
        this.i = i;
    }
    
    private void o(final int f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void p(final int g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void q(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void r(final int j) {
        this.c |= 0x40;
        this.j = j;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = agfj.b) == null) {
                    synchronized (agfj.class) {
                        if (agfj.b == null) {
                            agfj.b = (ahbe)new agzb((agzi)agfj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agfj.a;
            }
            case 4: {
                return new agfi();
            }
            case 3: {
                return new agfj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agfj.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100b\u0001\u0003\u100b\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006\b\u100b\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
