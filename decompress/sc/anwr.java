import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwr extends ahbh implements ahcw
{
    public static final anwr a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anwr.class, (ahbh)(a = new anwr()));
    }
    
    private anwr() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anwr.b) == null) {
                    synchronized (anwr.class) {
                        if (anwr.b == null) {
                            anwr.b = (ahdd)new ahba((ahbh)anwr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwr.a;
            }
            case 4: {
                return new ahaz((ahbh)anwr.a);
            }
            case 3: {
                return new anwr();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwr.a, "\u0001\u0000", (Object[])null);
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
