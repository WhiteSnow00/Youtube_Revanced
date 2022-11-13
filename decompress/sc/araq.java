import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class araq extends ahbh implements ahcw
{
    public static final araq a;
    private static volatile ahdd e;
    public int b;
    public aqxx c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)araq.class, (ahbh)(a = new araq()));
    }
    
    private araq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = araq.e) == null) {
                    synchronized (araq.class) {
                        if (araq.e == null) {
                            araq.e = (ahdd)new ahba((ahbh)araq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return araq.a;
            }
            case 4: {
                return new ahaz((ahbh)araq.a);
            }
            case 3: {
                return new araq();
            }
            case 2: {
                return newMessageInfo((MessageLite)araq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
