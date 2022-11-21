import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjb extends ahcz implements aheo
{
    public static final amjb a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amjb.class, a = new amjb());
    }
    
    private amjb() {
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
                if ((d = amjb.d) == null) {
                    synchronized (amjb.class) {
                        if (amjb.d == null) {
                            amjb.d = (ahev)new ahcs((ahcz)amjb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjb.a;
            }
            case 4: {
                return new ahcr((ahcz)amjb.a);
            }
            case 3: {
                return new amjb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjb.a, "\u0001\u0003\u0001\u0000\uf951\u2285\uef56\u2cf8\u0003\u0000\u0000\u0003\uf951\u2285\u143c\u0000\ue97d\u2739\u143c\u0000\uef56\u2cf8\u143c\u0000", new Object[] { "c", "b", ampm.class, amja.class, aizf.class });
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
