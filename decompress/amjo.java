import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjo extends ahcz implements aheo
{
    public static final amjo a;
    private static volatile ahev d;
    public int b;
    public amjn c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amjo.class, a = new amjo());
    }
    
    private amjo() {
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
                if ((d = amjo.d) == null) {
                    synchronized (amjo.class) {
                        if (amjo.d == null) {
                            amjo.d = (ahev)new ahcs((ahcz)amjo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjo.a;
            }
            case 4: {
                return new ahcr((ahcz)amjo.a);
            }
            case 3: {
                return new amjo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjo.a, "\u0001\u0001\u0000\u0001\ue2dd\u305d\ue2dd\u305d\u0001\u0000\u0000\u0001\ue2dd\u305d\u1409\u0000", new Object[] { "b", "c" });
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
