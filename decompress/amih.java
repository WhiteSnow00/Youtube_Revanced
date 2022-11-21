import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amih extends ahcz implements aheo
{
    public static final amih a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public akfj d;
    public ahdp e;
    public aiet f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amih.class, a = new amih());
    }
    
    private amih() {
        this.j = 2;
        this.e = ahcz.emptyProtobufList();
        this.g = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = amih.h) == null) {
                    synchronized (amih.class) {
                        if (amih.h == null) {
                            amih.h = (ahev)new ahcs((ahcz)amih.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amih.a;
            }
            case 4: {
                return new ahcr((ahcz)amih.a);
            }
            case 3: {
                return new amih();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amih.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0005\u041b\u0006\u1409\u0004\u0007\u1409\u0006\b\u100a\u0007", new Object[] { "b", "c", "d", "e", ajws.class, "f", "i", "g" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
