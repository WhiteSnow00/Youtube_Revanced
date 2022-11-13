import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqzp extends ahbh implements ahcw
{
    private static final aqzp a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)aqzp.class, (ahbh)(a = new aqzp()));
    }
    
    private aqzp() {
    }
    
    public static aqzp a() {
        return aqzp.a;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = aqzp.b) == null) {
                    synchronized (aqzp.class) {
                        if (aqzp.b == null) {
                            aqzp.b = (ahdd)new ahba((ahbh)aqzp.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqzp.a;
            }
            case 4: {
                return new ahaz((ahbh)a());
            }
            case 3: {
                return new aqzp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqzp.a, "\u0001\u0000", (Object[])null);
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
