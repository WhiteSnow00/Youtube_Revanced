import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amaa extends ahcz implements aheo
{
    public static final amaa a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(amaa.class, a = new amaa());
    }
    
    private amaa() {
        this.c = "";
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
                if ((d = amaa.d) == null) {
                    synchronized (amaa.class) {
                        if (amaa.d == null) {
                            amaa.d = (ahev)new ahcs((ahcz)amaa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amaa.a;
            }
            case 4: {
                return new ahcr((ahcz)amaa.a);
            }
            case 3: {
                return new amaa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amaa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
