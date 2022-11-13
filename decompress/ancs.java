import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancs extends ahbh implements ahcw
{
    public static final ancs a;
    private static volatile ahdd e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahbh.registerDefaultInstance((Class)ancs.class, (ahbh)(a = new ancs()));
    }
    
    private ancs() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ancs.e) == null) {
                    synchronized (ancs.class) {
                        if (ancs.e == null) {
                            ancs.e = (ahdd)new ahba((ahbh)ancs.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ancs.a;
            }
            case 4: {
                return new ahaz((ahbh)ancs.a);
            }
            case 3: {
                return new ancs();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancs.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100b\u0000\u0002\u100c\u0001", new Object[] { "b", "c", "d", anic.i });
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
