import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktn extends ahbh implements ahcw
{
    public static final aktn a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    
    static {
        ahbh.registerDefaultInstance((Class)aktn.class, (ahbh)(a = new aktn()));
    }
    
    private aktn() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aktn.d) == null) {
                    synchronized (aktn.class) {
                        if (aktn.d == null) {
                            aktn.d = (ahdd)new ahba((ahbh)aktn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aktn.a;
            }
            case 4: {
                return new ahaz((ahbh)aktn.a);
            }
            case 3: {
                return new aktn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktn.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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
