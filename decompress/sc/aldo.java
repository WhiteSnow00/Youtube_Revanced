import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aldo extends ahbh implements ahcw
{
    public static final aldo a;
    private static volatile ahdd g;
    public int b;
    public aklg c;
    public long d;
    public String e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)aldo.class, (ahbh)(a = new aldo()));
    }
    
    private aldo() {
        this.h = 2;
        this.e = "";
        this.f = "";
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
                final ahdd g;
                if ((g = aldo.g) == null) {
                    synchronized (aldo.class) {
                        if (aldo.g == null) {
                            aldo.g = (ahdd)new ahba((ahbh)aldo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aldo.a;
            }
            case 4: {
                return new ahaz((ahbh)aldo.a);
            }
            case 3: {
                return new aldo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aldo.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
