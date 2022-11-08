import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahnq extends agzi implements ahax
{
    private static final ahnq a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private ahnk e;
    private agyc f;
    private int g;
    private agyc h;
    private ahno i;
    
    static {
        agzi.registerDefaultInstance(ahnq.class, a = new ahnq());
    }
    
    private ahnq() {
        this.f = agyc.b;
        this.h = agyc.b;
    }
    
    public static ahnp a() {
        return (ahnp)ahnq.a.createBuilder();
    }
    
    private void i(final ahnk e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void j(final ahno i) {
        this.i = i;
        this.c |= 0x20;
    }
    
    private void k(final int g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void l(final ahnc ahnc) {
        this.d = ahnc.Y;
        this.c |= 0x1;
    }
    
    private void m(final agyc f) {
        f.getClass();
        this.c |= 0x4;
        this.f = f;
    }
    
    private void n(final agyc h) {
        h.getClass();
        this.c |= 0x10;
        this.h = h;
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
                if ((b = ahnq.b) == null) {
                    synchronized (ahnq.class) {
                        if (ahnq.b == null) {
                            ahnq.b = (ahbe)new agzb((agzi)ahnq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahnq.a;
            }
            case 4: {
                return new ahnp();
            }
            case 3: {
                return new ahnq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahnq.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0003\u1009\u0001\u0004\u100a\u0002\u0005\u1004\u0003\u0006\u100a\u0004\u0007\u1009\u0005", new Object[] { "c", "d", ahnc.a(), "e", "f", "g", "h", "i" });
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
