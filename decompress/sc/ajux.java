import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajux extends ahbh implements ahcw
{
    public static final ajux a;
    private static volatile ahdd f;
    public String b;
    public String c;
    public boolean d;
    public String e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajux.class, (ahbh)(a = new ajux()));
    }
    
    private ajux() {
        this.b = "";
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajux.f) == null) {
                    synchronized (ajux.class) {
                        if (ajux.f == null) {
                            ajux.f = (ahdd)new ahba((ahbh)ajux.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajux.a;
            }
            case 4: {
                return new ahaz((ahbh)ajux.a);
            }
            case 3: {
                return new ajux();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajux.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0005\u1008\u0004", new Object[] { "g", "b", "c", "d", "e" });
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
