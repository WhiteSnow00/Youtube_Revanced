import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpm extends ahcz implements aheo
{
    public static final akpm a;
    private static volatile ahev h;
    public int b;
    public aknj c;
    public ajpb d;
    public ahbt e;
    public akyz f;
    public ajpk g;
    private ahjl i;
    private ajpj j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(akpm.class, a = new akpm());
    }
    
    private akpm() {
        this.k = 2;
        this.e = ahbt.b;
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
                if ((h = akpm.h) == null) {
                    synchronized (akpm.class) {
                        if (akpm.h == null) {
                            akpm.h = (ahev)new ahcs((ahcz)akpm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return akpm.a;
            }
            case 4: {
                return new ahcr((ahcz)akpm.a);
            }
            case 3: {
                return new akpm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpm.a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u100a\u0003\u0006\u1409\u0004\u0007\u1009\u0006\n\u1409\u0005", new Object[] { "b", "c", "d", "i", "e", "j", "g", "f" });
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
