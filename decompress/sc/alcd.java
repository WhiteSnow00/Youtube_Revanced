import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcd extends ahbh implements ahcw
{
    public static final alcd a;
    private static volatile ahdd h;
    public int b;
    public aklg c;
    public String d;
    public int e;
    public String f;
    public String g;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)alcd.class, (ahbh)(a = new alcd()));
    }
    
    private alcd() {
        this.i = 2;
        this.d = "";
        this.f = "";
        this.g = "";
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
                final ahdd h;
                if ((h = alcd.h) == null) {
                    synchronized (alcd.class) {
                        if (alcd.h == null) {
                            alcd.h = (ahdd)new ahba((ahbh)alcd.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alcd.a;
            }
            case 4: {
                return new ahaz((ahbh)alcd.a);
            }
            case 3: {
                return new alcd();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcd.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u1008\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", apuh.m, "f", "g" });
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
