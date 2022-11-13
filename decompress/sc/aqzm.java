import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzm extends ahbh implements ahcw
{
    private static final aqzm a;
    private static volatile ahdd b;
    private int c;
    private boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzm.class, (ahbh)(a = new aqzm()));
    }
    
    private aqzm() {
    }
    
    public static aqzm a() {
        return aqzm.a;
    }
    
    public static aqzm b() {
        return aqzm.a;
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
                if ((b = aqzm.b) == null) {
                    synchronized (aqzm.class) {
                        if (aqzm.b == null) {
                            aqzm.b = (ahdd)new ahba((ahbh)aqzm.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzm.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqzm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzm.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "c", "d" });
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
