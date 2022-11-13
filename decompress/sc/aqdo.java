import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdo extends ahbh implements ahcw
{
    public static final aqdo a;
    private static volatile ahdd c;
    public String b;
    private int d;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdo.class, (ahbh)(a = new aqdo()));
    }
    
    private aqdo() {
        this.b = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = aqdo.c) == null) {
                    synchronized (aqdo.class) {
                        if (aqdo.c == null) {
                            aqdo.c = (ahdd)new ahba((ahbh)aqdo.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqdo.a;
            }
            case 4: {
                return new ahaz((ahbh)aqdo.a);
            }
            case 3: {
                return new aqdo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdo.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "d", "b" });
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
