import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alaa extends ahcz implements aheo
{
    public static final alaa a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public ahdp d;
    public boolean e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alaa.class, a = new alaa());
    }
    
    private alaa() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
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
                final ahev f;
                if ((f = alaa.f) == null) {
                    synchronized (alaa.class) {
                        if (alaa.f == null) {
                            alaa.f = (ahev)new ahcs((ahcz)alaa.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alaa.a;
            }
            case 4: {
                return new ahcr((int[])null, (short[][][])null);
            }
            case 3: {
                return new alaa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alaa.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001a\u0004\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
