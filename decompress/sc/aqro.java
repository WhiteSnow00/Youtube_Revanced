import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqro extends ahbh implements ahcw
{
    public static final aqro a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqro.class, (ahbh)(a = new aqro()));
    }
    
    private aqro() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqro.e) == null) {
                    synchronized (aqro.class) {
                        if (aqro.e == null) {
                            aqro.e = (ahdd)new ahba((ahbh)aqro.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqro.a;
            }
            case 4: {
                return new ahaz((ahbh)aqro.a);
            }
            case 3: {
                return new aqro();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqro.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1004\u0001", new Object[] { "b", "c", ames.a(), "d" });
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