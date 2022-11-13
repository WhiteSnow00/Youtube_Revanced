import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akom extends ahbh implements ahcw
{
    public static final akom a;
    private static volatile ahdd f;
    public int b;
    public int c;
    public int d;
    public String e;
    
    static {
        ahbh.registerDefaultInstance((Class)akom.class, (ahbh)(a = new akom()));
    }
    
    private akom() {
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = akom.f) == null) {
                    synchronized (akom.class) {
                        if (akom.f == null) {
                            akom.f = (ahdd)new ahba((ahbh)akom.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akom.a;
            }
            case 4: {
                return new ahaz((ahbh)akom.a);
            }
            case 3: {
                return new akom();
            }
            case 2: {
                return newMessageInfo((MessageLite)akom.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
