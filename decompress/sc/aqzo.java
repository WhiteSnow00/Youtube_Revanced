import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzo extends ahbh implements ahcw
{
    private static final aqzo a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzo.class, (ahbh)(a = new aqzo()));
    }
    
    private aqzo() {
    }
    
    public static aqzo a() {
        return aqzo.a;
    }
    
    public static aqzo b() {
        return aqzo.a;
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
                if ((b = aqzo.b) == null) {
                    synchronized (aqzo.class) {
                        if (aqzo.b == null) {
                            aqzo.b = (ahdd)new ahba((ahbh)aqzo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzo.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqzo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
