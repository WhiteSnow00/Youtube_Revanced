import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancu extends ahbh implements ahcw
{
    public static final ancu a;
    private static volatile ahdd f;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    
    static {
        ahbh.registerDefaultInstance((Class)ancu.class, (ahbh)(a = new ancu()));
    }
    
    private ancu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ancu.f) == null) {
                    synchronized (ancu.class) {
                        if (ancu.f == null) {
                            ancu.f = (ahdd)new ahba((ahbh)ancu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ancu.a;
            }
            case 4: {
                return new ahaz((ahbh)ancu.a);
            }
            case 3: {
                return new ancu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancu.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
