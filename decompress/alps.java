import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alps extends ahcz implements aheo
{
    public static final alps a;
    private static volatile ahev c;
    public ahdp b;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(alps.class, a = new alps());
    }
    
    private alps() {
        this.d = 2;
        this.b = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = alps.c) == null) {
                    synchronized (alps.class) {
                        if (alps.c == null) {
                            alps.c = (ahev)new ahcs((ahcz)alps.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alps.a;
            }
            case 4: {
                return new ahcr((ahcz)alps.a);
            }
            case 3: {
                return new alps();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alps.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", alpr.class });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
