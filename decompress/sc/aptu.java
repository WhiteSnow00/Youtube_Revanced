import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptu extends ahbh implements ahcw
{
    public static final aptu a;
    private static volatile ahdd d;
    public int b;
    public aptg c;
    
    static {
        ahbh.registerDefaultInstance((Class)aptu.class, (ahbh)(a = new aptu()));
    }
    
    private aptu() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aptu.d) == null) {
                    synchronized (aptu.class) {
                        if (aptu.d == null) {
                            aptu.d = (ahdd)new ahba((ahbh)aptu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptu.a;
            }
            case 4: {
                return new ahaz((ahbh)aptu.a);
            }
            case 3: {
                return new aptu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptu.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1009\u0000", new Object[] { "b", "c" });
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
