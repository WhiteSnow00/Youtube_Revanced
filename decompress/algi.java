import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algi extends ahcz implements aheo
{
    public static final algi a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(algi.class, a = new algi());
    }
    
    private algi() {
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
                if ((d = algi.d) == null) {
                    synchronized (algi.class) {
                        if (algi.d == null) {
                            algi.d = (ahev)new ahcs((ahcz)algi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return algi.a;
            }
            case 4: {
                return new ahcr((ahcz)algi.a);
            }
            case 3: {
                return new algi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algi.a, "\u0001\u0002\u0001\u0000\uf861\u1d50\uf79b\u3a87\u0002\u0000\u0000\u0002\uf861\u1d50\u143c\u0000\uf79b\u3a87\u143c\u0000", new Object[] { "c", "b", alxm.class, apfy.class });
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
