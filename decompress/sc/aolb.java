import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aolb extends ahbh implements ahcw
{
    public static final aolb a;
    private static volatile ahdd e;
    public int b;
    public long c;
    public long d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)aolb.class, (ahbh)(a = new aolb()));
    }
    
    private aolb() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aolb.e) == null) {
                    synchronized (aolb.class) {
                        if (aolb.e == null) {
                            aolb.e = (ahdd)new ahba((ahbh)aolb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aolb.a;
            }
            case 4: {
                return new ahaz((ahbh)aolb.a);
            }
            case 3: {
                return new aolb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aolb.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "f", "b", aola.a, "c", "d" });
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
