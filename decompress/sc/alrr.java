import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alrr extends ahbh implements ahcw
{
    public static final alrr a;
    private static volatile ahdd g;
    public int b;
    public String c;
    public ajut d;
    public ajut e;
    public ahcr f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)alrr.class, (ahbh)(a = new alrr()));
    }
    
    private alrr() {
        this.f = ahcr.a;
        this.h = 2;
        this.c = "";
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
                if ((g = alrr.g) == null) {
                    synchronized (alrr.class) {
                        if (alrr.g == null) {
                            alrr.g = (ahdd)new ahba((ahbh)alrr.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alrr.a;
            }
            case 4: {
                return new ahaz((ahbh)alrr.a);
            }
            case 3: {
                return new alrr();
            }
            case 2: {
                return newMessageInfo((MessageLite)alrr.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0003\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u0432", new Object[] { "b", "c", "d", "e", "f", alrq.a });
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
