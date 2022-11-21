import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammi extends ahcz implements aheo
{
    public static final ammi a;
    private static volatile ahev f;
    public int b;
    public ammf c;
    public ammg d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(ammi.class, a = new ammi());
    }
    
    private ammi() {
        this.g = 2;
        this.e = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ammi.f) == null) {
                    synchronized (ammi.class) {
                        if (ammi.f == null) {
                            ammi.f = (ahev)new ahcs((ahcz)ammi.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ammi.a;
            }
            case 4: {
                return new ahcr((ahcz)ammi.a);
            }
            case 3: {
                return new ammi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammi.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b", new Object[] { "b", "c", "d", "e", ammn.class });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
