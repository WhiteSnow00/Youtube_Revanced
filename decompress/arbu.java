import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbu extends ahcz implements aheo
{
    private static final arbu a;
    private static volatile ahev b;
    private int c;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(arbu.class, a = new arbu());
    }
    
    private arbu() {
        this.c = 0;
    }
    
    private void A(final arcy d) {
        d.getClass();
        this.d = d;
        this.c = 3;
    }
    
    private void B(final ardf d) {
        d.getClass();
        this.d = d;
        this.c = 1;
    }
    
    private void C(final arcq arcq) {
        this.d = arcq.e;
        this.c = 13;
    }
    
    private void D(final ardk d) {
        d.getClass();
        this.d = d;
        this.c = 7;
    }
    
    public static arbp a() {
        return (arbp)arbu.a.createBuilder();
    }
    
    static arbu b() {
        return arbu.a;
    }
    
    public static void d(final arbu arbu, final ardf ardf) {
        arbu.B(ardf);
    }
    
    public static void e(final arbu arbu, final arco arco) {
        arbu.v(arco);
    }
    
    public static void f(final arbu arbu, final arcy arcy) {
        arbu.A(arcy);
    }
    
    public static void g(final arbu arbu, final arbr arbr) {
        arbu.u(arbr);
    }
    
    public static void h(final arbu arbu, final araq araq) {
        arbu.r(araq);
    }
    
    public static void i(final arbu arbu, final ardk ardk) {
        arbu.D(ardk);
    }
    
    public static void j(final arbu arbu, final arbj arbj) {
        arbu.t(arbj);
    }
    
    public static void k(final arbu arbu, final arcv arcv) {
        arbu.y(arcv);
    }
    
    public static void l(final arbu arbu, final arbg arbg) {
        arbu.s(arbg);
    }
    
    public static void m(final arbu arbu, final arbs arbs) {
        arbu.w(arbs);
    }
    
    public static void n(final arbu arbu, final arcq arcq) {
        arbu.C(arcq);
    }
    
    public static void o(final arbu arbu, final arcx arcx) {
        arbu.z(arcx);
    }
    
    public static void p(final arbu arbu, final arcs arcs) {
        arbu.x(arcs);
    }
    
    private void r(final araq d) {
        d.getClass();
        this.d = d;
        this.c = 6;
    }
    
    private void s(final arbg d) {
        d.getClass();
        this.d = d;
        this.c = 11;
    }
    
    private void t(final arbj d) {
        d.getClass();
        this.d = d;
        this.c = 8;
    }
    
    private void u(final arbr d) {
        d.getClass();
        this.d = d;
        this.c = 4;
    }
    
    private void v(final arco d) {
        d.getClass();
        this.d = d;
        this.c = 2;
    }
    
    private void w(final arbs d) {
        d.getClass();
        this.d = d;
        this.c = 12;
    }
    
    private void x(final arcs d) {
        d.getClass();
        this.d = d;
        this.c = 15;
    }
    
    private void y(final arcv d) {
        d.getClass();
        this.d = d;
        this.c = 9;
    }
    
    private void z(final arcx d) {
        d.getClass();
        this.d = d;
        this.c = 14;
    }
    
    public arcv c() {
        if (this.c == 9) {
            return (arcv)this.d;
        }
        return arcv.e();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arbu.b) == null) {
                    synchronized (arbu.class) {
                        if (arbu.b == null) {
                            arbu.b = (ahev)new ahcs((ahcz)arbu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arbu.a;
            }
            case 4: {
                return new arbp();
            }
            case 3: {
                return new arbu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbu.a, "\u0001\u000f\u0001\u0000\u0001\u000f\u000f\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u103c\u0000\u0005\u103c\u0000\u0006\u103c\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000\f\u103c\u0000\r\u103f\u0000\u000e\u103c\u0000\u000f\u103c\u0000", new Object[] { "d", "c", ardf.class, arco.class, arcy.class, arbr.class, arbt.class, araq.class, ardk.class, arbj.class, arcv.class, araw.class, arbg.class, arbs.class, arcq.a(), arcx.class, arcs.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public boolean q() {
        return this.c == 9;
    }
}
