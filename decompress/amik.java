import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amik extends ahcz implements aheo
{
    public static final amik a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    private ajws e;
    private aisc f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amik.class, a = new amik());
    }
    
    private amik() {
        this.h = 2;
        this.c = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amik.d) == null) {
                    synchronized (amik.class) {
                        if (amik.d == null) {
                            amik.d = (ahev)new ahcs((ahcz)amik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amik.a;
            }
            case 4: {
                return new ahcr((ahcz)amik.a);
            }
            case 3: {
                return new amik();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amik.a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0003\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0004\u0005\u1409\u0005", new Object[] { "b", "e", "f", "c", "g" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
