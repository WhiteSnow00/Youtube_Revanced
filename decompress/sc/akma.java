import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akma extends ahbh implements ahcw
{
    public static final akma a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)akma.class, (ahbh)(a = new akma()));
    }
    
    private akma() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akma.b) == null) {
                    synchronized (akma.class) {
                        if (akma.b == null) {
                            akma.b = (ahdd)new ahba((ahbh)akma.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akma.a;
            }
            case 4: {
                return new ahaz((ahbh)akma.a);
            }
            case 3: {
                return new akma();
            }
            case 2: {
                return newMessageInfo((MessageLite)akma.a, "\u0001\u0000", (Object[])null);
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
