import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alfx extends ahcz implements aheo
{
    public static final alfx a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alfx.class, a = new alfx());
    }
    
    private alfx() {
        this.b = 0;
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
                if ((d = alfx.d) == null) {
                    synchronized (alfx.class) {
                        if (alfx.d == null) {
                            alfx.d = (ahev)new ahcs((ahcz)alfx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alfx.a;
            }
            case 4: {
                return new ahcr((ahcz)alfx.a);
            }
            case 3: {
                return new alfx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alfx.a, "\u0001\u0002\u0001\u0000\uf3e6\u1e05\ue823\u259d\u0002\u0000\u0000\u0002\uf3e6\u1e05\u143c\u0000\ue823\u259d\u143c\u0000", new Object[] { "c", "b", ahoa.class, anis.class });
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
