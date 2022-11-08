import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqu extends agzi implements ahax
{
    private static final agqu a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private Object e;
    private long f;
    private agqs g;
    private long h;
    
    static {
        agzi.registerDefaultInstance(agqu.class, a = new agqu());
    }
    
    private agqu() {
        this.d = 0;
    }
    
    public static agqt c() {
        return (agqt)agqu.a.createBuilder();
    }
    
    private void l(final long h) {
        this.c |= 0x80;
        this.h = h;
    }
    
    private void m(final agqs g) {
        g.getClass();
        this.g = g;
        this.c |= 0x40;
    }
    
    private void n(final agqv e) {
        e.getClass();
        this.e = e;
        this.d = 9;
    }
    
    private void o(final long f) {
        this.c |= 0x20;
        this.f = f;
    }
    
    private void p(final agra e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void q(final agrb e) {
        e.getClass();
        this.e = e;
        this.d = 1;
    }
    
    public long a() {
        return this.f;
    }
    
    public agqs b() {
        agqs agqs;
        if ((agqs = this.g) == null) {
            agqs = agqs.a;
        }
        return agqs;
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
                if ((b = agqu.b) == null) {
                    synchronized (agqu.class) {
                        if (agqu.b == null) {
                            agqu.b = (ahbe)new agzb((agzi)agqu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agqu.a;
            }
            case 4: {
                return new agqt();
            }
            case 3: {
                return new agqu();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqu.a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u1002\u0005\u0004\u1009\u0006\u0005\u1002\u0007\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "e", "d", "c", agrb.class, agra.class, "f", "g", "h", agqm.class, agqn.class, agqv.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean k() {
        return (this.c & 0x40) != 0x0;
    }
}
