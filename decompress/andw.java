import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class andw extends ahbh implements ahcw
{
    public static final andw a;
    private static volatile ahdd b;
    
    static {
        ahbh.registerDefaultInstance((Class)andw.class, (ahbh)(a = new andw()));
    }
    
    private andw() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = andw.b) == null) {
                    synchronized (andw.class) {
                        if (andw.b == null) {
                            andw.b = (ahdd)new ahba((ahbh)andw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return andw.a;
            }
            case 4: {
                return new ahaz((ahbh)andw.a);
            }
            case 3: {
                return new andw();
            }
            case 2: {
                return newMessageInfo((MessageLite)andw.a, "\u0001\u0000", (Object[])null);
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
