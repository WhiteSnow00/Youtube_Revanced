import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrw extends ahbh implements ahcw
{
    private static final aqrw a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrw.class, (ahbh)(a = new aqrw()));
    }
    
    private aqrw() {
    }
    
    public static aqrw a() {
        return aqrw.a;
    }
    
    public static aqrw b() {
        return aqrw.a;
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
                if ((b = aqrw.b) == null) {
                    synchronized (aqrw.class) {
                        if (aqrw.b == null) {
                            aqrw.b = (ahdd)new ahba((ahbh)aqrw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqrw.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqrw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
