import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alml extends ahcz implements aheo
{
    public static final alml a;
    private static volatile ahev c;
    public anxb b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alml.class, a = new alml());
    }
    
    private alml() {
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
                final ahev c;
                if ((c = alml.c) == null) {
                    synchronized (alml.class) {
                        if (alml.c == null) {
                            alml.c = (ahev)new ahcs((ahcz)alml.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alml.a;
            }
            case 4: {
                return new ahcr((ahcz)alml.a);
            }
            case 3: {
                return new alml();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alml.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
