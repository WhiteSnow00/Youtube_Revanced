import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amau extends ahcz implements aheo
{
    public static final amau a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(amau.class, a = new amau());
    }
    
    private amau() {
        this.b = 0;
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
                if ((d = amau.d) == null) {
                    synchronized (amau.class) {
                        if (amau.d == null) {
                            amau.d = (ahev)new ahcs((ahcz)amau.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amau.a;
            }
            case 4: {
                return new ahcr((ahcz)amau.a);
            }
            case 3: {
                return new amau();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amau.a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000\u0003\u103b\u0000\u0004\u103b\u0000", new Object[] { "c", "b" });
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
