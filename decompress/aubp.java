import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubp extends ahcz implements aheo
{
    public static final aubp a;
    private static volatile ahev e;
    public int b;
    public long c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(aubp.class, a = new aubp());
    }
    
    private aubp() {
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
                if ((e = aubp.e) == null) {
                    synchronized (aubp.class) {
                        if (aubp.e == null) {
                            aubp.e = (ahev)new ahcs((ahcz)aubp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aubp.a;
            }
            case 4: {
                return new ahcr((ahcz)aubp.a);
            }
            case 3: {
                return new aubp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
