import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amli extends ahcz implements aheo
{
    public static final amli a;
    private static volatile ahev d;
    public int b;
    public aies c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amli.class, a = new amli());
    }
    
    private amli() {
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
                if ((d = amli.d) == null) {
                    synchronized (amli.class) {
                        if (amli.d == null) {
                            amli.d = (ahev)new ahcs((ahcz)amli.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amli.a;
            }
            case 4: {
                return new ahcr((ahcz)amli.a);
            }
            case 3: {
                return new amli();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amli.a, "\u0001\u0001\u0000\u0001\ueb11\u1f11\ueb11\u1f11\u0001\u0000\u0000\u0001\ueb11\u1f11\u1409\u0000", new Object[] { "b", "c" });
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
