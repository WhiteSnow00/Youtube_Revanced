import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfd extends ahbh implements ahcw
{
    public static final anfd a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public String d;
    private String f;
    private ajut g;
    private aida h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)anfd.class, (ahbh)(a = new anfd()));
    }
    
    private anfd() {
        this.i = 2;
        this.c = "";
        this.d = "";
        this.f = "";
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
                final ahdd e;
                if ((e = anfd.e) == null) {
                    synchronized (anfd.class) {
                        if (anfd.e == null) {
                            anfd.e = (ahdd)new ahba((ahbh)anfd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anfd.a;
            }
            case 4: {
                return new ahaz((ahbh)anfd.a);
            }
            case 3: {
                return new anfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfd.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "f", "g", "h" });
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
