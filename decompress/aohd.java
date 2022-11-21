import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohd extends ahcz implements aheo
{
    public static final aohd a;
    private static volatile ahev e;
    public int b;
    public int c;
    public int d;
    
    static {
        ahcz.registerDefaultInstance(aohd.class, a = new aohd());
    }
    
    private aohd() {
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
                if ((e = aohd.e) == null) {
                    synchronized (aohd.class) {
                        if (aohd.e == null) {
                            aohd.e = (ahev)new ahcs((ahcz)aohd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aohd.a;
            }
            case 4: {
                return new ahcr((ahcz)aohd.a);
            }
            case 3: {
                return new aohd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohd.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001", new Object[] { "b", "c", aoha.e, "d", aohb.a() });
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
