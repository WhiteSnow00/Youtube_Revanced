import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akts extends ahbh implements ahcw
{
    public static final akts a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public alsl d;
    public alsm e;
    
    static {
        ahbh.registerDefaultInstance((Class)akts.class, (ahbh)(a = new akts()));
    }
    
    private akts() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akts.f) == null) {
                    synchronized (akts.class) {
                        if (akts.f == null) {
                            akts.f = (ahdd)new ahba((ahbh)akts.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akts.a;
            }
            case 4: {
                return new ahaz((ahbh)akts.a);
            }
            case 3: {
                return new akts();
            }
            case 2: {
                return newMessageInfo((MessageLite)akts.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
