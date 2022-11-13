import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktz extends ahbh implements ahcw
{
    public static final aktz a;
    private static volatile ahdd e;
    public int b;
    public boolean c;
    public boolean d;
    
    static {
        ahbh.registerDefaultInstance((Class)aktz.class, (ahbh)(a = new aktz()));
    }
    
    private aktz() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aktz.e) == null) {
                    synchronized (aktz.class) {
                        if (aktz.e == null) {
                            aktz.e = (ahdd)new ahba((ahbh)aktz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aktz.a;
            }
            case 4: {
                return new ahaz((ahbh)aktz.a);
            }
            case 3: {
                return new aktz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
