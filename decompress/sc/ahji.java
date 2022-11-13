import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahji extends ahbh implements ahcw
{
    private static final ahji a;
    private static volatile ahdd b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ahji.class, (ahbh)(a = new ahji()));
    }
    
    private ahji() {
    }
    
    public static ahjh a() {
        return (ahjh)ahji.a.createBuilder();
    }
    
    static ahji b() {
        return ahji.a;
    }
    
    public static void c(final ahji ahji, final ahjg ahjg) {
        ahji.h(ahjg);
    }
    
    public static void d(final ahji ahji, final ahje ahje) {
        ahji.f(ahje);
    }
    
    public static void e(final ahji ahji, final ahjf ahjf) {
        ahji.g(ahjf);
    }
    
    private void f(final ahje ahje) {
        this.e = ahje.d;
        this.c |= 0x2;
    }
    
    private void g(final ahjf ahjf) {
        this.f = ahjf.d;
        this.c |= 0x4;
    }
    
    private void h(final ahjg ahjg) {
        this.d = ahjg.c;
        this.c |= 0x1;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ahji.b) == null) {
                    synchronized (ahji.class) {
                        if (ahji.b == null) {
                            ahji.b = (ahdd)new ahba((ahbh)ahji.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahji.a;
            }
            case 4: {
                return new ahjh();
            }
            case 3: {
                return new ahji();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahji.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002", new Object[] { "c", "d", ahjg.a(), "e", ahje.a(), "f", ahjf.a() });
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
