import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albm extends ahbh implements ahcw
{
    public static final albm a;
    private static volatile ahdd e;
    public int b;
    public akli c;
    public String d;
    private anuv f;
    private ajvo g;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)albm.class, (ahbh)(a = new albm()));
    }
    
    private albm() {
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
                final ahdd e;
                if ((e = albm.e) == null) {
                    synchronized (albm.class) {
                        if (albm.e == null) {
                            albm.e = (ahdd)new ahba((ahbh)albm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albm.a;
            }
            case 4: {
                return new ahaz((ahbh)albm.a);
            }
            case 3: {
                return new albm();
            }
            case 2: {
                return newMessageInfo((MessageLite)albm.a, "\u0001\u0004\u0000\u0001\u0001\u0309\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1008\u0002\u0005\u1409\u0003\u0309\u1409\u0004", new Object[] { "b", "c", "d", "f", "g" });
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
