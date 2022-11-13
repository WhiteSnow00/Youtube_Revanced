import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqse extends ahbh implements ahcw
{
    public static final aqse a;
    private static volatile ahdd e;
    public int b;
    public ahab c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqse.class, (ahbh)(a = new aqse()));
    }
    
    private aqse() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqse.e) == null) {
                    synchronized (aqse.class) {
                        if (aqse.e == null) {
                            aqse.e = (ahdd)new ahba((ahbh)aqse.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqse.a;
            }
            case 4: {
                return new ahaz((ahbh)aqse.a);
            }
            case 3: {
                return new aqse();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqse.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
