import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhk extends ahcz implements aheo
{
    public static final alhk a;
    private static volatile ahev h;
    public int b;
    public aknj c;
    public alha d;
    public alhn e;
    public ahdp f;
    public ahbt g;
    private ahjl i;
    private ajxn j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(alhk.class, a = new alhk());
    }
    
    private alhk() {
        this.k = 2;
        this.f = ahcz.emptyProtobufList();
        this.g = ahbt.b;
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
                if ((h = alhk.h) == null) {
                    synchronized (alhk.class) {
                        if (alhk.h == null) {
                            alhk.h = (ahev)new ahcs((ahcz)alhk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alhk.a;
            }
            case 4: {
                return new ahcr((ahcz)alhk.a);
            }
            case 3: {
                return new alhk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhk.a, "\u0001\u0007\u0000\u0001\u0001\u0309\u0007\u0000\u0001\u0006\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u100a\u0003\u0005\u1409\u0002\u0006\u041b\u0007\u1409\u0004\u0309\u1409\u0005", new Object[] { "b", "c", "d", "g", "e", "f", aisc.class, "i", "j" });
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
