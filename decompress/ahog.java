import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahog extends ahcz implements aheo
{
    public static final ahog a;
    private static volatile ahev d;
    public ahdp b;
    public ahdp c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahog.class, a = new ahog());
    }
    
    private ahog() {
        this.e = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.b = ahcz.emptyProtobufList();
        this.c = ahcz.emptyProtobufList();
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
                if ((d = ahog.d) == null) {
                    synchronized (ahog.class) {
                        if (ahog.d == null) {
                            ahog.d = (ahev)new ahcs((ahcz)ahog.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahog.a;
            }
            case 4: {
                return new ahcr((ahcz)ahog.a);
            }
            case 3: {
                return new ahog();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahog.a, "\u0001\u0002\u0000\u0000\u0005\u0006\u0002\u0000\u0002\u0002\u0005\u041b\u0006\u041b", new Object[] { "b", aisc.class, "c", aisc.class });
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
