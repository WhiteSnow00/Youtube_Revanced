import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alql extends ahbh implements ahcw
{
    public static final alql a;
    private static volatile ahdd f;
    public int b;
    public ajut c;
    public String d;
    public long e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alql.class, (ahbh)(a = new alql()));
    }
    
    private alql() {
        this.g = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = alql.f) == null) {
                    synchronized (alql.class) {
                        if (alql.f == null) {
                            alql.f = (ahdd)new ahba((ahbh)alql.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alql.a;
            }
            case 4: {
                return new ahaz((ahbh)alql.a);
            }
            case 3: {
                return new alql();
            }
            case 2: {
                return newMessageInfo((MessageLite)alql.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1003\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
