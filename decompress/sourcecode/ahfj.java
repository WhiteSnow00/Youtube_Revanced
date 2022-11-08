import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahfj extends agzi implements ahax
{
    private static final ahfj a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h;
    
    static {
        agzi.registerDefaultInstance(ahfj.class, a = new ahfj());
    }
    
    private ahfj() {
        this.h = "";
    }
    
    public static ahfi a() {
        return (ahfi)ahfj.a.createBuilder();
    }
    
    private void k(final ahfm ahfm) {
        this.e = ahfm.u;
        this.c |= 0x2;
    }
    
    private void l(final ahfl ahfl) {
        this.g = ahfl.n;
        this.c |= 0x20;
    }
    
    private void m(final ahfn ahfn) {
        this.f = ahfn.e;
        this.c |= 0x8;
    }
    
    private void n(final ahfo ahfo) {
        this.d = ahfo.ae;
        this.c |= 0x1;
    }
    
    private void o(final String h) {
        h.getClass();
        this.c |= 0x40;
        this.h = h;
    }
    
    public ahfl c() {
        ahfl ahfl;
        if ((ahfl = ahfl.b(this.g)) == null) {
            ahfl = ahfl.a;
        }
        return ahfl;
    }
    
    public ahfm d() {
        ahfm ahfm;
        if ((ahfm = ahfm.b(this.e)) == null) {
            ahfm = ahfm.a;
        }
        return ahfm;
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
                if ((b = ahfj.b) == null) {
                    synchronized (ahfj.class) {
                        if (ahfj.b == null) {
                            ahfj.b = (ahbe)new agzb((agzi)ahfj.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahfj.a;
            }
            case 4: {
                return new ahfi();
            }
            case 3: {
                return new ahfj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahfj.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0004\u100c\u0003\u0006\u100c\u0005\u0007\u1008\u0006", new Object[] { "c", "d", ahfo.a(), "e", ahfm.a(), "f", ahfn.a(), "g", ahfl.a(), "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public ahfo e() {
        ahfo ahfo;
        if ((ahfo = ahfo.b(this.d)) == null) {
            ahfo = ahfo.a;
        }
        return ahfo;
    }
}
