import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almx extends ahcz implements aheo
{
    public static final almx a;
    private static volatile ahev b;
    private int c;
    private ahjl d;
    private anxb e;
    private anxb f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(almx.class, a = new almx());
    }
    
    private almx() {
        this.g = 2;
        emptyProtobufList();
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = almx.b) == null) {
                    synchronized (almx.class) {
                        if (almx.b == null) {
                            almx.b = (ahev)new ahcs((ahcz)almx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almx.a;
            }
            case 4: {
                return new ahcr((ahcz)almx.a);
            }
            case 3: {
                return new almx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almx.a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002\u1409\u0000\u0004\u1409\u0002\u0005\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
