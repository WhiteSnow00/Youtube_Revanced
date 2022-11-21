import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogq extends ahcz implements aheo
{
    public static final aogq a;
    private static volatile ahev e;
    public int b;
    public long c;
    public ahcf d;
    
    static {
        ahcz.registerDefaultInstance(aogq.class, a = new aogq());
    }
    
    private aogq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aogq.e) == null) {
                    synchronized (aogq.class) {
                        if (aogq.e == null) {
                            aogq.e = (ahev)new ahcs((ahcz)aogq.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogq.a;
            }
            case 4: {
                return new ahcr((ahcz)aogq.a);
            }
            case 3: {
                return new aogq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogq.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
