import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogr extends ahcz implements aheo
{
    public static final aogr a;
    private static volatile ahev e;
    public int b;
    public aogq c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(aogr.class, a = new aogr());
    }
    
    private aogr() {
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aogr.e) == null) {
                    synchronized (aogr.class) {
                        if (aogr.e == null) {
                            aogr.e = (ahev)new ahcs((ahcz)aogr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogr.a;
            }
            case 4: {
                return new ahcr((ahcz)aogr.a);
            }
            case 3: {
                return new aogr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogr.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", new Object[] { "b", "c", "d", aogq.class });
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
