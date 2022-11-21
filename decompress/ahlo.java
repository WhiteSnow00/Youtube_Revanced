import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlo extends ahcz implements aheo
{
    public static final ahlo a;
    private static volatile ahev g;
    public int b;
    public ahdp c;
    public ahdp d;
    public anxb e;
    public ajoq f;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(ahlo.class, a = new ahlo());
    }
    
    private ahlo() {
        this.h = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev g;
                if ((g = ahlo.g) == null) {
                    synchronized (ahlo.class) {
                        if (ahlo.g == null) {
                            ahlo.g = (ahev)new ahcs((ahcz)ahlo.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ahlo.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlo.a);
            }
            case 3: {
                return new ahlo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlo.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0003\u0001\u041b\u0004\u041b\u0005\u1409\u0000\u0006\u1009\u0002", new Object[] { "b", "c", ahln.class, "d", ahlm.class, "e", "f" });
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
