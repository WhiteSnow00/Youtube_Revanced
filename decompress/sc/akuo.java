import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akuo extends ahbh implements ahcw
{
    public static final akuo a;
    private static volatile ahdd f;
    public int b;
    public aklg c;
    public String d;
    public String e;
    private akxf g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akuo.class, (ahbh)(a = new akuo()));
    }
    
    private akuo() {
        this.h = 2;
        this.d = "";
        this.e = "";
        final ahab b = ahab.b;
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
                final ahdd f;
                if ((f = akuo.f) == null) {
                    synchronized (akuo.class) {
                        if (akuo.f == null) {
                            akuo.f = (ahdd)new ahba((ahbh)akuo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akuo.a;
            }
            case 4: {
                return new ahaz((ahbh)akuo.a);
            }
            case 3: {
                return new akuo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akuo.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "g" });
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
