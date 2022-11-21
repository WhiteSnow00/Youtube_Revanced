import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aree extends ahcz implements aheo
{
    public static final aree a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aree.class, a = new aree());
    }
    
    private aree() {
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
                if ((e = aree.e) == null) {
                    synchronized (aree.class) {
                        if (aree.e == null) {
                            aree.e = (ahev)new ahcs((ahcz)aree.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aree.a;
            }
            case 4: {
                return new ahcr((ahcz)aree.a);
            }
            case 3: {
                return new aree();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aree.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "b", "c", "d" });
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
