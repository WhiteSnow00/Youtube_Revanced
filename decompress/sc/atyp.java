import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atyp extends ahbh implements ahcw
{
    public static final atyp a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public int d;
    public ahbp e;
    public ahbp f;
    
    static {
        ahbh.registerDefaultInstance((Class)atyp.class, (ahbh)(a = new atyp()));
    }
    
    private atyp() {
        this.e = emptyIntList();
        this.f = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = atyp.g) == null) {
                    synchronized (atyp.class) {
                        if (atyp.g == null) {
                            atyp.g = (ahdd)new ahba((ahbh)atyp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atyp.a;
            }
            case 4: {
                return new ahaz((float[][])null, (byte[])null);
            }
            case 3: {
                return new atyp();
            }
            case 2: {
                return newMessageInfo((MessageLite)atyp.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003'\u0004'", new Object[] { "b", "c", "d", "e", "f" });
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
