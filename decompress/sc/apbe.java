import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbe extends ahbh implements ahcw
{
    public static final apbe a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)apbe.class, (ahbh)(a = new apbe()));
    }
    
    private apbe() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = apbe.b) == null) {
                    synchronized (apbe.class) {
                        if (apbe.b == null) {
                            apbe.b = (ahdd)new ahba((ahbh)apbe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apbe.a;
            }
            case 4: {
                return new ahaz((ahbh)apbe.a);
            }
            case 3: {
                return new apbe();
            }
            case 2: {
                return newMessageInfo((MessageLite)apbe.a, "\u0001\u0000", (Object[])null);
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
