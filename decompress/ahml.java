import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahml extends ahcz implements aheo
{
    public static final ahml a;
    private static volatile ahev h;
    public int b;
    public apmu c;
    public ajwb d;
    public aoqy e;
    public apmv f;
    public apmt g;
    private alhw i;
    private ahpi j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(ahml.class, a = new ahml());
    }
    
    private ahml() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = ahml.h) == null) {
                    synchronized (ahml.class) {
                        if (ahml.h == null) {
                            ahml.h = (ahev)new ahcs((ahcz)ahml.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahml.a;
            }
            case 4: {
                return new ahcr((ahcz)ahml.a);
            }
            case 3: {
                return new ahml();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahml.a, "\u0001\u0007\u0000\u0001\ufd61\u1d59\ufcb1\ua32a\u0007\u0000\u0000\u0006\ufd61\u1d59\u1409\u0000\uf95d\u2871\u1009\u0001\uf09c\u28a0\u1409\u0002\ue162\u2a82\u1409\u0004\ue879\u32f6\u1409\u0003\ue4bf\ua2da\u1409\u0005\ufcb1\ua32a\u1409\u0006", new Object[] { "b", "c", "d", "e", "j", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
