import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmo extends ahbh implements ahcw
{
    private static final aqmo a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private Object e;
    private ahdy f;
    private String g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmo.class, (ahbh)(a = new aqmo()));
    }
    
    private aqmo() {
        this.d = 0;
        this.h = 2;
        this.g = "";
    }
    
    public static aqmn a() {
        return (aqmn)aqmo.a.createBuilder();
    }
    
    static aqmo b() {
        return aqmo.a;
    }
    
    public static void c(final aqmo aqmo, final ahdy ahdy) {
        aqmo.p(ahdy);
    }
    
    public static void d(final aqmo aqmo, final aqmm aqmm) {
        aqmo.o(aqmm);
    }
    
    public static void e(final aqmo aqmo, final aqmk aqmk) {
        aqmo.n(aqmk);
    }
    
    public static void f(final aqmo aqmo, final aqmc aqmc) {
        aqmo.k(aqmc);
    }
    
    public static void g(final aqmo aqmo, final aqma aqma) {
        aqmo.j(aqma);
    }
    
    public static void h(final aqmo aqmo, final aqmi aqmi) {
        aqmo.m(aqmi);
    }
    
    public static void i(final aqmo aqmo, final aqme aqme) {
        aqmo.l(aqme);
    }
    
    private void j(final aqma e) {
        e.getClass();
        this.e = e;
        this.d = 5;
    }
    
    private void k(final aqmc e) {
        e.getClass();
        this.e = e;
        this.d = 4;
    }
    
    private void l(final aqme e) {
        e.getClass();
        this.e = e;
        this.d = 9;
    }
    
    private void m(final aqmi e) {
        e.getClass();
        this.e = e;
        this.d = 8;
    }
    
    private void n(final aqmk e) {
        e.getClass();
        this.e = e;
        this.d = 3;
    }
    
    private void o(final aqmm e) {
        e.getClass();
        this.e = e;
        this.d = 2;
    }
    
    private void p(final ahdy f) {
        f.getClass();
        this.f = f;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqmo.b) == null) {
                    synchronized (aqmo.class) {
                        if (aqmo.b == null) {
                            aqmo.b = (ahdd)new ahba((ahbh)aqmo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmo.a;
            }
            case 4: {
                return new aqmn();
            }
            case 3: {
                return new aqmo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmo.a, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0002\u0001\u1009\u0000\u0002\u103c\u0000\u0003\u143c\u0000\u0004\u143c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\b\u103c\u0000\t\u103c\u0000", new Object[] { "e", "d", "c", "f", aqmm.class, aqmk.class, aqmc.class, aqma.class, aqmg.class, aqmi.class, aqme.class });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
