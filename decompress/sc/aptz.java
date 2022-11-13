import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptz extends ahbh implements ahcw
{
    public static final aptz a;
    private static volatile ahdd f;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aptz.class, (ahbh)(a = new aptz()));
    }
    
    private aptz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aptz.f) == null) {
                    synchronized (aptz.class) {
                        if (aptz.f == null) {
                            aptz.f = (ahdd)new ahba((ahbh)aptz.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aptz.a;
            }
            case 4: {
                return new ahaz((ahbh)aptz.a);
            }
            case 3: {
                return new aptz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptz.a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0004\u0004\f", new Object[] { "b", "c", "d", "e" });
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
