import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsa extends ahbh implements ahcw
{
    private static final aqsa a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqsa.class, (ahbh)(a = new aqsa()));
    }
    
    private aqsa() {
    }
    
    public static aqsa a() {
        return aqsa.a;
    }
    
    public static aqsa b() {
        return aqsa.a;
    }
    
    public boolean c() {
        return this.d;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqsa.b) == null) {
                    synchronized (aqsa.class) {
                        if (aqsa.b == null) {
                            aqsa.b = (ahdd)new ahba((ahbh)aqsa.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqsa.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqsa();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqsa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
