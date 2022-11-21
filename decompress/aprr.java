import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprr extends ahcz implements aheo
{
    public static final aprr a;
    private static volatile ahev e;
    public int b;
    public float c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aprr.class, a = new aprr());
    }
    
    private aprr() {
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
                if ((e = aprr.e) == null) {
                    synchronized (aprr.class) {
                        if (aprr.e == null) {
                            aprr.e = (ahev)new ahcs((ahcz)aprr.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprr.a;
            }
            case 4: {
                return new ahcr((ahcz)aprr.a);
            }
            case 3: {
                return new aprr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aprr.a, "\u0001\u0002\u0000\u0001\u0004\u000b\u0002\u0000\u0000\u0000\u0004\u1001\u0001\u000b\u100c\u0007", new Object[] { "b", "c", "d", aprh.l });
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
