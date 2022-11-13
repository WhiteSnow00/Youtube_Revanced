import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzl extends ahbh implements ahcw
{
    private static final aqzl a;
    private static volatile ahdd b;
    private int c;
    private Object d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzl.class, (ahbh)(a = new aqzl()));
    }
    
    private aqzl() {
        this.c = 0;
    }
    
    public static aqzl d() {
        return aqzl.a;
    }
    
    public aqyo a() {
        if (this.c == 8) {
            return (aqyo)this.d;
        }
        return aqyo.b();
    }
    
    public aqzi b() {
        if (this.c == 6) {
            return (aqzi)this.d;
        }
        return aqzi.c();
    }
    
    public aqzj c() {
        if (this.c == 9) {
            return (aqzj)this.d;
        }
        return aqzj.c();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzl.b) == null) {
                    synchronized (aqzl.class) {
                        if (aqzl.b == null) {
                            aqzl.b = (ahdd)new ahba((ahbh)aqzl.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzl.a;
            }
            case 4: {
                return new ahaz((ahbh)d());
            }
            case 3: {
                return new aqzl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzl.a, "\u0001\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000", new Object[] { "d", "c", arad.class, aqzm.class, aqzn.class, aqzk.class, aqzp.class, aqzi.class, aqzt.class, aqyo.class, aqzj.class, aqzo.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public aqzm e() {
        if (this.c == 2) {
            return (aqzm)this.d;
        }
        return aqzm.b();
    }
    
    public aqzo f() {
        if (this.c == 10) {
            return (aqzo)this.d;
        }
        return aqzo.b();
    }
    
    public aqzt g() {
        if (this.c == 7) {
            return (aqzt)this.d;
        }
        return aqzt.l();
    }
    
    public arad h() {
        if (this.c == 1) {
            return (arad)this.d;
        }
        return arad.f();
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
