import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoih extends ahcz implements aheo
{
    public static final aoih a;
    private static volatile ahev d;
    public int b;
    public aizd c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoih.class, a = new aoih());
    }
    
    private aoih() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aoih.d) == null) {
                    synchronized (aoih.class) {
                        if (aoih.d == null) {
                            aoih.d = (ahev)new ahcs((ahcz)aoih.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoih.a;
            }
            case 4: {
                return new ahcr((ahcz)aoih.a);
            }
            case 3: {
                return new aoih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoih.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
