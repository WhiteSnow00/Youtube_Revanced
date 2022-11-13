import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aque extends ahbh implements ahcw
{
    public static final aque a;
    private static volatile ahdd f;
    public int b;
    public float c;
    public float d;
    public float e;
    
    static {
        ahbh.registerDefaultInstance((Class)aque.class, (ahbh)(a = new aque()));
    }
    
    private aque() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aque.f) == null) {
                    synchronized (aque.class) {
                        if (aque.f == null) {
                            aque.f = (ahdd)new ahba((ahbh)aque.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aque.a;
            }
            case 4: {
                return new ahaz((ahbh)aque.a);
            }
            case 3: {
                return new aque();
            }
            case 2: {
                return newMessageInfo((MessageLite)aque.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "b", "c", "d", "e" });
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
