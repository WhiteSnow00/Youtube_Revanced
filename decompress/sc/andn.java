import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andn extends ahbh implements ahcw
{
    public static final andn a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andn.class, (ahbh)(a = new andn()));
    }
    
    private andn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andn.b) == null) {
                    synchronized (andn.class) {
                        if (andn.b == null) {
                            andn.b = (ahdd)new ahba((ahbh)andn.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andn.a;
            }
            case 4: {
                return new ahaz((ahbh)andn.a);
            }
            case 3: {
                return new andn();
            }
            case 2: {
                return newMessageInfo((MessageLite)andn.a, "\u0001\u0000", (Object[])null);
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
