import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akdo extends ahbh implements ahcw
{
    public static final akdo a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akdo.class, (ahbh)(a = new akdo()));
    }
    
    private akdo() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akdo.b) == null) {
                    synchronized (akdo.class) {
                        if (akdo.b == null) {
                            akdo.b = (ahdd)new ahba((ahbh)akdo.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akdo.a;
            }
            case 4: {
                return new ahaz((ahbh)akdo.a);
            }
            case 3: {
                return new akdo();
            }
            case 2: {
                return newMessageInfo((MessageLite)akdo.a, "\u0001\u0000", (Object[])null);
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
