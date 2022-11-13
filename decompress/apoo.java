import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apoo extends ahbh implements ahcw
{
    public static final apoo a;
    private static volatile ahdd f;
    public int b;
    public apon c;
    public float d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)apoo.class, (ahbh)(a = new apoo()));
    }
    
    private apoo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apoo.f) == null) {
                    synchronized (apoo.class) {
                        if (apoo.f == null) {
                            apoo.f = (ahdd)new ahba((ahbh)apoo.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apoo.a;
            }
            case 4: {
                return new ahaz((ahbh)apoo.a);
            }
            case 3: {
                return new apoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)apoo.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e" });
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
