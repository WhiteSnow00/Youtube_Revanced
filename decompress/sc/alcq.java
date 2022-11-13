import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcq extends ahbh implements ahcw
{
    public static final alcq a;
    private static volatile ahdd g;
    public int b;
    public akli c;
    public String d;
    public int e;
    public alcr f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alcq.class, (ahbh)(a = new alcq()));
    }
    
    private alcq() {
        this.h = 2;
        this.d = "";
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
                if ((g = alcq.g) == null) {
                    synchronized (alcq.class) {
                        if (alcq.g == null) {
                            alcq.g = (ahdd)new ahba((ahbh)alcq.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alcq.a;
            }
            case 4: {
                return new ahaz((ahbh)alcq.a);
            }
            case 3: {
                return new alcq();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcq.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0002\u0001\u1409\u0000\u0003\u1008\u0001\u0004\u100c\u0002\u0005\u1409\u0003", new Object[] { "b", "c", "d", "e", akwi.q, "f" });
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
