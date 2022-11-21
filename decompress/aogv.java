import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogv extends ahcz implements aheo
{
    public static final aogv a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(aogv.class, a = new aogv());
    }
    
    private aogv() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aogv.d) == null) {
                    synchronized (aogv.class) {
                        if (aogv.d == null) {
                            aogv.d = (ahev)new ahcs((ahcz)aogv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aogv.a;
            }
            case 4: {
                return new ahcr((ahcz)aogv.a);
            }
            case 3: {
                return new aogv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
