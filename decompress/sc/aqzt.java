import java.util.List;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzt extends ahbh implements aqzu
{
    private static final aqzt a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    private aqzr f;
    private ahfu g;
    private ahft h;
    private int i;
    private ahbx j;
    private ahfu k;
    private long l;
    private aray m;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzt.class, (ahbh)(a = new aqzt()));
    }
    
    private aqzt() {
        this.j = emptyProtobufList();
    }
    
    private void C(final aqzd aqzd) {
        aqzd.getClass();
        this.F();
        this.j.add((Object)aqzd);
    }
    
    private void D() {
        this.c &= 0xFFFFFF7F;
        this.l = 0L;
    }
    
    private void E() {
        this.j = emptyProtobufList();
    }
    
    private void F() {
        final ahbx j = this.j;
        if (!j.c()) {
            this.j = ahbh.mutableCopy(j);
        }
    }
    
    private void G(final ahft h) {
        h.getClass();
        this.h = h;
        this.c |= 0x10;
    }
    
    private void H(final int e) {
        this.c |= 0x2;
        this.e = e;
    }
    
    private void I(final ahfu g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    private void J(final aqzr f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    private void K(final int d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    public static aqzs j() {
        return (aqzs)aqzt.a.createBuilder();
    }
    
    static aqzt k() {
        return aqzt.a;
    }
    
    public static aqzt l() {
        return aqzt.a;
    }
    
    public static aqzt m(final byte[] array, final ExtensionRegistryLite extensionRegistryLite) {
        return (aqzt)ahbh.parseFrom((ahbh)aqzt.a, array, extensionRegistryLite);
    }
    
    public static void p(final aqzt aqzt, final int n) {
        aqzt.K(n);
    }
    
    public static void q(final aqzt aqzt, final int n) {
        aqzt.H(n);
    }
    
    public static void r(final aqzt aqzt, final aqzr aqzr) {
        aqzt.J(aqzr);
    }
    
    public static void s(final aqzt aqzt, final ahfu ahfu) {
        aqzt.I(ahfu);
    }
    
    public static void t(final aqzt aqzt, final ahft ahft) {
        aqzt.G(ahft);
    }
    
    static void u(final aqzt aqzt, final aqzd aqzd) {
        aqzt.C(aqzd);
    }
    
    public static void v(final aqzt aqzt) {
        aqzt.E();
    }
    
    public static void w(final aqzt aqzt) {
        aqzt.D();
    }
    
    public boolean A() {
        return (this.c & 0x40) != 0x0;
    }
    
    public boolean B() {
        return (this.c & 0x20) != 0x0;
    }
    
    public int a() {
        return this.e;
    }
    
    public int b() {
        return this.j.size();
    }
    
    public int c() {
        return this.d;
    }
    
    public int d() {
        return this.i;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzt.b) == null) {
                    synchronized (aqzt.class) {
                        if (aqzt.b == null) {
                            aqzt.b = (ahdd)new ahba((ahbh)aqzt.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzt.a;
            }
            case 4: {
                return new aqzs();
            }
            case 3: {
                return new aqzt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzt.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1004\u0005\u0006\u001b\u0007\u1002\u0007\t\u1009\b\n\u1009\u0006\u000b\u1009\u0004", new Object[] { "c", "d", "e", "f", "g", "i", "j", aqzd.class, "l", "m", "k", "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public long e() {
        return this.l;
    }
    
    public ahfu f() {
        ahfu ahfu;
        if ((ahfu = this.g) == null) {
            ahfu = ahfu.a;
        }
        return ahfu;
    }
    
    public ahfu g() {
        ahfu ahfu;
        if ((ahfu = this.k) == null) {
            ahfu = ahfu.a;
        }
        return ahfu;
    }
    
    public aqzd h(final int n) {
        return (aqzd)this.j.get(0);
    }
    
    public aqzr i() {
        aqzr aqzr;
        if ((aqzr = this.f) == null) {
            aqzr = aqzr.a;
        }
        return aqzr;
    }
    
    public aray n() {
        aray aray;
        if ((aray = this.m) == null) {
            aray = aray.a;
        }
        return aray;
    }
    
    public List o() {
        return (List)this.j;
    }
    
    public boolean x() {
        return (this.c & 0x100) != 0x0;
    }
    
    public boolean y() {
        return (this.c & 0x8) != 0x0;
    }
    
    public boolean z() {
        return (this.c & 0x4) != 0x0;
    }
}
