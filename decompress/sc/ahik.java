import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahik extends ahbh implements ahcw
{
    public static final ahik a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahim d;
    
    static {
        ahbh.registerDefaultInstance((Class)ahik.class, (ahbh)(a = new ahik()));
    }
    
    private ahik() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ahik.e) == null) {
                    synchronized (ahik.class) {
                        if (ahik.e == null) {
                            ahik.e = (ahdd)new ahba((ahbh)ahik.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ahik.a;
            }
            case 4: {
                return new ahaz((ahbh)ahik.a);
            }
            case 3: {
                return new ahik();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahik.a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u1008\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d" });
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
