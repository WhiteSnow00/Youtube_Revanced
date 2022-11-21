import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amku extends ahcz implements aheo
{
    public static final amku a;
    private static volatile ahev d;
    public int b;
    public amkt c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amku.class, a = new amku());
    }
    
    private amku() {
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
                if ((d = amku.d) == null) {
                    synchronized (amku.class) {
                        if (amku.d == null) {
                            amku.d = (ahev)new ahcs((ahcz)amku.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amku.a;
            }
            case 4: {
                return new ahcr((ahcz)amku.a);
            }
            case 3: {
                return new amku();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amku.a, "\u0001\u0001\u0000\u0001\uf237\u4161\uf237\u4161\u0001\u0000\u0000\u0001\uf237\u4161\u1409\u0000", new Object[] { "b", "c" });
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
