import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpj extends ahbh implements ahcw
{
    public static final alpj a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public anuv d;
    public String e;
    public aiqj f;
    private anuv h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alpj.class, (ahbh)(a = new alpj()));
    }
    
    private alpj() {
        this.i = 2;
        this.c = "";
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = alpj.g) == null) {
                    synchronized (alpj.class) {
                        if (alpj.g == null) {
                            alpj.g = (ahdd)new ahba((ahbh)alpj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alpj.a;
            }
            case 4: {
                return new ahaz((ahbh)alpj.a);
            }
            case 3: {
                return new alpj();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpj.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001\u1409\u0001\u0002\u1409\u0002\u0003\u1008\u0000\u0004\u1008\u0003\u0005\u1409\u0004", new Object[] { "b", "h", "d", "c", "e", "f" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}