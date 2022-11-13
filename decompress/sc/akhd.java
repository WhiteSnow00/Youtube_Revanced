import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akhd extends ahbh implements ahcw
{
    public static final akhd a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public aouw d;
    
    static {
        ahbh.registerDefaultInstance((Class)akhd.class, (ahbh)(a = new akhd()));
    }
    
    private akhd() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = akhd.e) == null) {
                    synchronized (akhd.class) {
                        if (akhd.e == null) {
                            akhd.e = (ahdd)new ahba((ahbh)akhd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akhd.a;
            }
            case 4: {
                return new ahaz((ahbh)akhd.a);
            }
            case 3: {
                return new akhd();
            }
            case 2: {
                return newMessageInfo((MessageLite)akhd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
