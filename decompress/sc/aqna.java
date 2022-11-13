import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqna extends ahbh implements ahcw
{
    public static final aqna a;
    private static volatile ahdd f;
    public int b;
    public double c;
    public double d;
    public int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqna.class, (ahbh)(a = new aqna()));
    }
    
    private aqna() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqna.f) == null) {
                    synchronized (aqna.class) {
                        if (aqna.f == null) {
                            aqna.f = (ahdd)new ahba((ahbh)aqna.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqna.a;
            }
            case 4: {
                return new ahaz((ahbh)aqna.a);
            }
            case 3: {
                return new aqna();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqna.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1000\u0000\u0002\u1000\u0001\u0003\u100b\u0002", new Object[] { "b", "c", "d", "e" });
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
