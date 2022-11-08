import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agff extends agzi implements ahax
{
    private static final agff a;
    private static volatile ahbe b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    
    static {
        agzi.registerDefaultInstance(agff.class, a = new agff());
    }
    
    private agff() {
    }
    
    public static agfe a() {
        return (agfe)agff.a.createBuilder();
    }
    
    private void k(final int h) {
        this.c |= 0x10;
        this.h = h;
    }
    
    private void l(final agfc agfc) {
        this.f = agfc.f;
        this.c |= 0x4;
    }
    
    private void m(final boolean e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void n(final int g) {
        this.c |= 0x8;
        this.g = g;
    }
    
    private void o(final int j) {
        this.c |= 0x40;
        this.j = j;
    }
    
    private void p(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void q(final int i) {
        this.c |= 0x20;
        this.i = i;
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
                if ((b = agff.b) == null) {
                    synchronized (agff.class) {
                        if (agff.b == null) {
                            agff.b = (ahbe)new agzb((agzi)agff.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return agff.a;
            }
            case 4: {
                return new agfe();
            }
            case 3: {
                return new agff();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agff.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u100b\u0003\u0005\u100b\u0004\u0006\u100b\u0005\u0007\u100b\u0006", new Object[] { "c", "d", "e", "f", agfc.b(), "g", "h", "i", "j" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean j() {
        return (this.c & 0x10) != 0x0;
    }
}
