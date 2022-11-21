import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aord extends ahcz implements aheo
{
    public static final aord a;
    private static volatile ahev d;
    public int b;
    public float c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(aord.class, a = new aord());
    }
    
    private aord() {
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
                if ((d = aord.d) == null) {
                    synchronized (aord.class) {
                        if (aord.d == null) {
                            aord.d = (ahev)new ahcs((ahcz)aord.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aord.a;
            }
            case 4: {
                return new ahcr((ahcz)aord.a);
            }
            case 3: {
                return new aord();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aord.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001", new Object[] { "e", "b", "c" });
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
