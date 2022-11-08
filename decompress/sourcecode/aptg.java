import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptg extends agzi implements ahax
{
    private static final aptg a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private long e;
    private String f;
    private int g;
    private int h;
    private long i;
    private int j;
    private String k;
    
    static {
        agzi.registerDefaultInstance((Class)aptg.class, (agzi)(a = new aptg()));
    }
    
    private aptg() {
        this.f = "";
        this.k = "";
    }
    
    public static aptf a() {
        return (aptf)aptg.a.createBuilder();
    }
    
    private void k(final String k) {
        k.getClass();
        this.c |= 0x200;
        this.k = k;
    }
    
    private void l(final String f) {
        f.getClass();
        this.c |= 0x8;
        this.f = f;
    }
    
    private void m(final long i) {
        this.c |= 0x40;
        this.i = i;
    }
    
    private void n(final long e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void o(final int g) {
        this.c |= 0x10;
        this.g = g;
    }
    
    private void p(final int h) {
        this.c |= 0x20;
        this.h = h;
    }
    
    private void q(final apti apti) {
        this.j = apti.f;
        this.c |= 0x100;
    }
    
    private void r(final apth apth) {
        this.d = apth.y;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aptg.b) == null) {
                    synchronized (aptg.class) {
                        if (aptg.b == null) {
                            aptg.b = (ahbe)new agzb((agzi)aptg.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aptg.a;
            }
            case 4: {
                return new aptf();
            }
            case 3: {
                return new aptg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptg.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1002\u0006\b\u100c\b\t\u1008\t\n\u1004\u0005", new Object[] { "c", "d", apth.a(), "e", "f", "g", "i", "j", apti.a(), "k", "h" });
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
