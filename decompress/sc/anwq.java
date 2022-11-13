import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwq extends ahbh implements ahcw
{
    public static final anwq a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)anwq.class, (ahbh)(a = new anwq()));
    }
    
    private anwq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = anwq.b) == null) {
                    synchronized (anwq.class) {
                        if (anwq.b == null) {
                            anwq.b = (ahdd)new ahba((ahbh)anwq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return anwq.a;
            }
            case 4: {
                return new ahaz((ahbh)anwq.a);
            }
            case 3: {
                return new anwq();
            }
            case 2: {
                return newMessageInfo((MessageLite)anwq.a, "\u0001\u0000", (Object[])null);
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
