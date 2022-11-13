import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancm extends ahbh implements ahcw
{
    private static final ancm a;
    private static volatile ahdd b;
    private int c;
    private String d;
    private ahab e;
    
    static {
        ahbh.registerDefaultInstance((Class)ancm.class, (ahbh)(a = new ancm()));
    }
    
    private ancm() {
        this.d = "";
        this.e = ahab.b;
    }
    
    public static ancl a() {
        return (ancl)ancm.a.createBuilder();
    }
    
    static ancm b() {
        return ancm.a;
    }
    
    public static void c(final ancm ancm, final String s) {
        ancm.e(s);
    }
    
    public static void d(final ancm ancm, final ahab ahab) {
        ancm.f(ahab);
    }
    
    private void e(final String d) {
        this.c |= 0x1;
        this.d = d;
    }
    
    private void f(final ahab e) {
        e.getClass();
        this.c |= 0x2;
        this.e = e;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = ancm.b) == null) {
                    synchronized (ancm.class) {
                        if (ancm.b == null) {
                            ancm.b = (ahdd)new ahba((ahbh)ancm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ancm.a;
            }
            case 4: {
                return new ancl();
            }
            case 3: {
                return new ancm();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancm.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "c", "d", "e" });
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
