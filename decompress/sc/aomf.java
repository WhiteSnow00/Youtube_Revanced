import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aomf extends ahbh implements ahcw
{
    public static final aomf a;
    private static volatile ahdd d;
    public int b;
    public boolean c;
    private int e;
    
    static {
        ahbh.registerDefaultInstance((Class)aomf.class, (ahbh)(a = new aomf()));
    }
    
    private aomf() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aomf.d) == null) {
                    synchronized (aomf.class) {
                        if (aomf.d == null) {
                            aomf.d = (ahdd)new ahba((ahbh)aomf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aomf.a;
            }
            case 4: {
                return new ahaz((ahbh)aomf.a);
            }
            case 3: {
                return new aomf();
            }
            case 2: {
                return newMessageInfo((MessageLite)aomf.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1007\u0001", new Object[] { "e", "b", aola.i, "c" });
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
