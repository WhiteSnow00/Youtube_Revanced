import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhk extends ahcz implements aheo
{
    public static final amhk a;
    private static volatile ahev d;
    public long b;
    public long c;
    private int e;
    
    static {
        ahcz.registerDefaultInstance(amhk.class, a = new amhk());
    }
    
    private amhk() {
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
                if ((d = amhk.d) == null) {
                    synchronized (amhk.class) {
                        if (amhk.d == null) {
                            amhk.d = (ahev)new ahcs((ahcz)amhk.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amhk.a;
            }
            case 4: {
                return new ahcr((ahcz)amhk.a);
            }
            case 3: {
                return new amhk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "e", "b", "c" });
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
