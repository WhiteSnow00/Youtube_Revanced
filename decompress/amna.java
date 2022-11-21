import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amna extends ahcz implements aheo
{
    public static final amna a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amna.class, a = new amna());
    }
    
    private amna() {
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
                if ((d = amna.d) == null) {
                    synchronized (amna.class) {
                        if (amna.d == null) {
                            amna.d = (ahev)new ahcs((ahcz)amna.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amna.a;
            }
            case 4: {
                return new ahcr((ahcz)amna.a);
            }
            case 3: {
                return new amna();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amna.a, "\u0001\u0001\u0001\u0000\uf03a\u2b94\uf03a\u2b94\u0001\u0000\u0000\u0001\uf03a\u2b94\u143c\u0000", new Object[] { "c", "b", aicl.class });
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
