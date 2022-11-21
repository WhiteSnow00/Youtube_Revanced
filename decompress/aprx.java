import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprx extends ahcz implements aheo
{
    public static final aprx a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(aprx.class, a = new aprx());
    }
    
    private aprx() {
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
                if ((d = aprx.d) == null) {
                    synchronized (aprx.class) {
                        if (aprx.d == null) {
                            aprx.d = (ahev)new ahcs((ahcz)aprx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aprx.a;
            }
            case 4: {
                return new ahcr((ahcz)aprx.a);
            }
            case 3: {
                return new aprx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprx.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
