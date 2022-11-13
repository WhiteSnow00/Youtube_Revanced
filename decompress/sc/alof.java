import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alof extends ahbh implements ahcw
{
    public static final alof a;
    private static volatile ahdd f;
    public int b;
    public String c;
    public int d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)alof.class, (ahbh)(a = new alof()));
    }
    
    private alof() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = alof.f) == null) {
                    synchronized (alof.class) {
                        if (alof.f == null) {
                            alof.f = (ahdd)new ahba((ahbh)alof.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alof.a;
            }
            case 4: {
                return new ahaz((ahbh)alof.a);
            }
            case 3: {
                return new alof();
            }
            case 2: {
                return newMessageInfo((MessageLite)alof.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", alog.a(), "e" });
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
