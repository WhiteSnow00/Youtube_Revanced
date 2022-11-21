import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjv extends ahcz implements aheo
{
    public static final amjv a;
    private static volatile ahev c;
    public ahdp b;
    private int d;
    private ajws e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amjv.class, a = new amjv());
    }
    
    private amjv() {
        this.f = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = amjv.c) == null) {
                    synchronized (amjv.class) {
                        if (amjv.c == null) {
                            amjv.c = (ahev)new ahcs((ahcz)amjv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amjv.a;
            }
            case 4: {
                return new ahcr((ahcz)amjv.a);
            }
            case 3: {
                return new amjv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u041b", new Object[] { "d", "e", "b", amjw.class });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
