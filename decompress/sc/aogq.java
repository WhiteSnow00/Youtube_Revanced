import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogq extends ahbh implements ahcw
{
    public static final aogq a;
    public static final ahbf b;
    private static volatile ahdd d;
    public boolean c;
    private int e;
    
    static {
        final aogq a2 = new aogq();
        ahbh.registerDefaultInstance((Class)aogq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aiqj.a, (Object)a2, (MessageLite)a2, (ahbm)null, 365619327, ahek.k, (Class)aogq.class);
    }
    
    private aogq() {
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aogq.d) == null) {
                    synchronized (aogq.class) {
                        if (aogq.d == null) {
                            aogq.d = (ahdd)new ahba((ahbh)aogq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogq.a;
            }
            case 4: {
                return new ahaz((ahbh)aogq.a);
            }
            case 3: {
                return new aogq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "e", "c" });
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
