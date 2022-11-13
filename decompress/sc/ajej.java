import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajej extends ahbh implements ahcw
{
    private static final ajej a;
    private static volatile ahdd b;
    private int c;
    private ajei d;
    private ajee e;
    private ajed f;
    private ajeg g;
    private ajef h;
    private ajeh i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajej.class, (ahbh)(a = new ajej()));
    }
    
    private ajej() {
    }
    
    public static ajec a() {
        return (ajec)ajej.a.createBuilder();
    }
    
    static ajej e() {
        return ajej.a;
    }
    
    public static ajej f(final ahab ahab, final ExtensionRegistryLite extensionRegistryLite) {
        return (ajej)ahbh.parseFrom((ahbh)ajej.a, ahab, extensionRegistryLite);
    }
    
    public static void g(final ajej ajej, final ajei ajei) {
        ajej.r(ajei);
    }
    
    public static void h(final ajej ajej, final ajee ajee) {
        ajej.m(ajee);
    }
    
    public static void i(final ajej ajej, final ajed ajed) {
        ajej.n(ajed);
    }
    
    public static void j(final ajej ajej, final ajeg ajeg) {
        ajej.p(ajeg);
    }
    
    public static void k(final ajej ajej, final ajef ajef) {
        ajej.o(ajef);
    }
    
    public static void l(final ajej ajej, final ajeh ajeh) {
        ajej.q(ajeh);
    }
    
    private void m(final ajee e) {
        e.getClass();
        this.e = e;
        this.c |= 0x2;
    }
    
    private void n(final ajed f) {
        f.getClass();
        this.f = f;
        this.c |= 0x4;
    }
    
    private void o(final ajef h) {
        h.getClass();
        this.h = h;
        this.c |= 0x10;
    }
    
    private void p(final ajeg g) {
        g.getClass();
        this.g = g;
        this.c |= 0x8;
    }
    
    private void q(final ajeh i) {
        i.getClass();
        this.i = i;
        this.c |= 0x20;
    }
    
    private void r(final ajei d) {
        d.getClass();
        this.d = d;
        this.c |= 0x1;
    }
    
    public ajed b() {
        ajed ajed;
        if ((ajed = this.f) == null) {
            ajed = ajed.a;
        }
        return ajed;
    }
    
    public ajee c() {
        ajee ajee;
        if ((ajee = this.e) == null) {
            ajee = ajee.a;
        }
        return ajee;
    }
    
    public ajei d() {
        ajei ajei;
        if ((ajei = this.d) == null) {
            ajei = ajei.a;
        }
        return ajei;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ajej.b) == null) {
                    synchronized (ajej.class) {
                        if (ajej.b == null) {
                            ajej.b = (ahdd)new ahba((ahbh)ajej.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajej.a;
            }
            case 4: {
                return new ajec();
            }
            case 3: {
                return new ajej();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajej.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004\u0006\u1009\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
