import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcy extends ahbh implements ahcw
{
    public static final alcy a;
    private static volatile ahdd d;
    public int b;
    public String c;
    
    static {
        ahbh.registerDefaultInstance((Class)alcy.class, (ahbh)(a = new alcy()));
    }
    
    private alcy() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alcy.d) == null) {
                    synchronized (alcy.class) {
                        if (alcy.d == null) {
                            alcy.d = (ahdd)new ahba((ahbh)alcy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alcy.a;
            }
            case 4: {
                return new ahaz((ahbh)alcy.a);
            }
            case 3: {
                return new alcy();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcy.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
