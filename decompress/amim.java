import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amim extends ahcz implements aheo
{
    public static final amim a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amim.class, a = new amim());
    }
    
    private amim() {
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
                if ((d = amim.d) == null) {
                    synchronized (amim.class) {
                        if (amim.d == null) {
                            amim.d = (ahev)new ahcs((ahcz)amim.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amim.a;
            }
            case 4: {
                return new ahcr((ahcz)amim.a);
            }
            case 3: {
                return new amim();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amim.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
