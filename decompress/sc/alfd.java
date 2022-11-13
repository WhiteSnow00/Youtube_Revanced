import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfd extends ahbh implements ahcw
{
    public static final alfd a;
    private static volatile ahdd g;
    public int b;
    public aklg c;
    public String d;
    public apxo e;
    public String f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alfd.class, (ahbh)(a = new alfd()));
    }
    
    private alfd() {
        this.h = 2;
        this.d = "";
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
                if ((g = alfd.g) == null) {
                    synchronized (alfd.class) {
                        if (alfd.g == null) {
                            alfd.g = (ahdd)new ahba((ahbh)alfd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alfd.a;
            }
            case 4: {
                return new ahaz((ahbh)alfd.a);
            }
            case 3: {
                return new alfd();
            }
            case 2: {
                return newMessageInfo((MessageLite)alfd.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
