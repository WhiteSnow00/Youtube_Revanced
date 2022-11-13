import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqe extends ahbh implements ahcw
{
    public static final apqe a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public int e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)apqe.class, (ahbh)(a = new apqe()));
    }
    
    private apqe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apqe.f) == null) {
                    synchronized (apqe.class) {
                        if (apqe.f == null) {
                            apqe.f = (ahdd)new ahba((ahbh)apqe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqe.a;
            }
            case 4: {
                return new ahaz((ahbh)apqe.a);
            }
            case 3: {
                return new apqe();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqe.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1004\u0003", new Object[] { "g", "b", "c", "d", "e" });
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
