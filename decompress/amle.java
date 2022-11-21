import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amle extends ahcz implements aheo
{
    public static final amle a;
    private static volatile ahev d;
    public int b;
    public amlo c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amle.class, a = new amle());
    }
    
    private amle() {
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
                if ((d = amle.d) == null) {
                    synchronized (amle.class) {
                        if (amle.d == null) {
                            amle.d = (ahev)new ahcs((ahcz)amle.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amle.a;
            }
            case 4: {
                return new ahcr((ahcz)amle.a);
            }
            case 3: {
                return new amle();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amle.a, "\u0001\u0001\u0000\u0001\uf574\u3c15\uf574\u3c15\u0001\u0000\u0000\u0001\uf574\u3c15\u1409\u0000", new Object[] { "b", "c" });
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
