import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcj extends ahbh implements ahcw
{
    public static final alcj a;
    private static volatile ahdd e;
    public akli b;
    public String c;
    public alck d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alcj.class, (ahbh)(a = new alcj()));
    }
    
    private alcj() {
        this.g = 2;
        this.c = "";
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
                final ahdd e;
                if ((e = alcj.e) == null) {
                    synchronized (alcj.class) {
                        if (alcj.e == null) {
                            alcj.e = (ahdd)new ahba((ahbh)alcj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alcj.a;
            }
            case 4: {
                return new ahaz((ahbh)alcj.a);
            }
            case 3: {
                return new alcj();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcj.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
