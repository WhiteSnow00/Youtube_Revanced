import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolw extends ahbh implements ahcw
{
    public static final aolw a;
    private static volatile ahdd d;
    public int b;
    public ahab c;
    
    static {
        ahbh.registerDefaultInstance((Class)aolw.class, (ahbh)(a = new aolw()));
    }
    
    private aolw() {
        this.c = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aolw.d) == null) {
                    synchronized (aolw.class) {
                        if (aolw.d == null) {
                            aolw.d = (ahdd)new ahba((ahbh)aolw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aolw.a;
            }
            case 4: {
                return new ahaz((ahbh)aolw.a);
            }
            case 3: {
                return new aolw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
