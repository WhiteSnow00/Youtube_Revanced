import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anva extends ahbh implements ahcw
{
    public static final anva a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anva.class, (ahbh)(a = new anva()));
    }
    
    private anva() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anva.b) == null) {
                    synchronized (anva.class) {
                        if (anva.b == null) {
                            anva.b = (ahdd)new ahba((ahbh)anva.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anva.a;
            }
            case 4: {
                return new ahaz((ahbh)anva.a);
            }
            case 3: {
                return new anva();
            }
            case 2: {
                return newMessageInfo((MessageLite)anva.a, "\u0001\u0000", (Object[])null);
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
