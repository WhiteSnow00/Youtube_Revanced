import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albl extends ahbh implements ahcw
{
    public static final albl a;
    private static volatile ahdd g;
    public int b;
    public aklg c;
    public String d;
    public aiwy e;
    public aiwz f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)albl.class, (ahbh)(a = new albl()));
    }
    
    private albl() {
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
                if ((g = albl.g) == null) {
                    synchronized (albl.class) {
                        if (albl.g == null) {
                            albl.g = (ahdd)new ahba((ahbh)albl.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return albl.a;
            }
            case 4: {
                return new ahaz((ahbh)albl.a);
            }
            case 3: {
                return new albl();
            }
            case 2: {
                return newMessageInfo((MessageLite)albl.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
