import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqxm extends agzi implements ahax
{
    private static final aqxm a;
    private static volatile ahbe b;
    private int c;
    private long d;
    private aqyl e;
    private long f;
    private aqym g;
    private int h;
    
    static {
        agzi.registerDefaultInstance(aqxm.class, a = new aqxm());
    }
    
    private aqxm() {
    }
    
    public static aqxk b() {
        return (aqxk)aqxm.a.createBuilder();
    }
    
    public static aqxm e() {
        return aqxm.a;
    }
    
    private void k(final long d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void l(final aqxl aqxl) {
        this.h = aqxl.d;
        this.c |= 0x10;
    }
    
    private void m(final aqyl e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void n(final long f) {
        this.c |= 0x4;
        this.f = f;
    }
    
    private void o(final aqym g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    public long a() {
        return this.f;
    }
    
    public aqxl c() {
        aqxl aqxl;
        if ((aqxl = aqxl.b(this.h)) == null) {
            aqxl = aqxl.a;
        }
        return aqxl;
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
                if ((b = aqxm.b) == null) {
                    synchronized (aqxm.class) {
                        if (aqxm.b == null) {
                            aqxm.b = (ahbe)new agzb((agzi)aqxm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqxm.a;
            }
            case 4: {
                return new aqxk();
            }
            case 3: {
                return new aqxm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqxm.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001\u0003\u1002\u0002\u0004\u1009\u0003\u0005\u100c\u0004", new Object[] { "c", "d", "e", "f", "g", "h", aqxl.a() });
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
