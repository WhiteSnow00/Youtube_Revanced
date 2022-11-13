import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqj extends ahbh implements ahcw
{
    public static final apqj a;
    private static volatile ahdd f;
    public boolean b;
    public int c;
    public boolean d;
    public int e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)apqj.class, (ahbh)(a = new apqj()));
    }
    
    private apqj() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = apqj.f) == null) {
                    synchronized (apqj.class) {
                        if (apqj.f == null) {
                            apqj.f = (ahdd)new ahba((ahbh)apqj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apqj.a;
            }
            case 4: {
                return new ahaz((ahbh)apqj.a);
            }
            case 3: {
                return new apqj();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqj.a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1004\u0001\u0005\u1007\u0002\u0007\u1004\u0004", new Object[] { "g", "b", "c", "d", "e" });
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
