import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqwx extends agzi implements ahax
{
    private static final aqwx a;
    private static volatile ahbe b;
    private int c;
    private Object d;
    
    static {
        agzi.registerDefaultInstance(aqwx.class, a = new aqwx());
    }
    
    private aqwx() {
        this.c = 0;
    }
    
    public static /* synthetic */ aqwx d() {
        return aqwx.a;
    }
    
    public aqwa a() {
        if (this.c == 8) {
            return (aqwa)this.d;
        }
        return aqwa.b();
    }
    
    public aqwu b() {
        if (this.c == 6) {
            return (aqwu)this.d;
        }
        return aqwu.c();
    }
    
    public aqwv c() {
        if (this.c == 9) {
            return (aqwv)this.d;
        }
        return aqwv.c();
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
                if ((b = aqwx.b) == null) {
                    synchronized (aqwx.class) {
                        if (aqwx.b == null) {
                            aqwx.b = (ahbe)new agzb((agzi)aqwx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqwx.a;
            }
            case 4: {
                return new agza((agzi)d());
            }
            case 3: {
                return new aqwx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aqwx.a, "\u0001\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000", new Object[] { "d", "c", aqxp.class, aqwy.class, aqwz.class, aqww.class, aqxb.class, aqwu.class, aqxf.class, aqwa.class, aqwv.class, aqxa.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aqwy e() {
        if (this.c == 2) {
            return (aqwy)this.d;
        }
        return aqwy.b();
    }
    
    public aqxa f() {
        if (this.c == 10) {
            return (aqxa)this.d;
        }
        return aqxa.b();
    }
    
    public aqxf g() {
        if (this.c == 7) {
            return (aqxf)this.d;
        }
        return aqxf.l();
    }
    
    public aqxp h() {
        if (this.c == 1) {
            return (aqxp)this.d;
        }
        return aqxp.f();
    }
    
    public boolean i() {
        return this.c == 7;
    }
    
    public boolean j() {
        return this.c == 6;
    }
    
    public boolean k() {
        return this.c == 8;
    }
    
    public boolean l() {
        return this.c == 9;
    }
    
    public boolean m() {
        return this.c == 4;
    }
    
    public boolean n() {
        return this.c == 2;
    }
    
    public boolean o() {
        return this.c == 3;
    }
    
    public boolean p() {
        return this.c == 1;
    }
    
    public boolean q() {
        return this.c == 10;
    }
    
    public boolean r() {
        return this.c == 5;
    }
}
