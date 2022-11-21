import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoie extends ahcz implements aheo
{
    public static final aoie a;
    private static volatile ahev d;
    public int b;
    public long c;
    
    static {
        ahcz.registerDefaultInstance(aoie.class, a = new aoie());
    }
    
    private aoie() {
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
                if ((d = aoie.d) == null) {
                    synchronized (aoie.class) {
                        if (aoie.d == null) {
                            aoie.d = (ahev)new ahcs((ahcz)aoie.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoie.a;
            }
            case 4: {
                return new ahcr((ahcz)aoie.a);
            }
            case 3: {
                return new aoie();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoie.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1002\u0000", new Object[] { "b", "c" });
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
