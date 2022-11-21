import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohh extends ahcz implements aheo
{
    public static final aohh a;
    private static volatile ahev e;
    public int b;
    public long c;
    public ahcf d;
    
    static {
        ahcz.registerDefaultInstance(aohh.class, a = new aohh());
    }
    
    private aohh() {
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
                if ((e = aohh.e) == null) {
                    synchronized (aohh.class) {
                        if (aohh.e == null) {
                            aohh.e = (ahev)new ahcs((ahcz)aohh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aohh.a;
            }
            case 4: {
                return new ahcr((ahcz)aohh.a);
            }
            case 3: {
                return new aohh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
