import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alps extends ahbh implements ahcw
{
    public static final alps a;
    private static volatile ahdd d;
    public int b;
    public long c;
    
    static {
        ahbh.registerDefaultInstance((Class)alps.class, (ahbh)(a = new alps()));
    }
    
    private alps() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = alps.d) == null) {
                    synchronized (alps.class) {
                        if (alps.d == null) {
                            alps.d = (ahdd)new ahba((ahbh)alps.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alps.a;
            }
            case 4: {
                return new ahaz((ahbh)alps.a);
            }
            case 3: {
                return new alps();
            }
            case 2: {
                return newMessageInfo((MessageLite)alps.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1003\u0001", new Object[] { "b", "c" });
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
