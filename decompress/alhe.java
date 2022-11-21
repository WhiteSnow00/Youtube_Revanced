import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhe extends ahcz implements aheo
{
    public static final alhe a;
    private static volatile ahev f;
    public int b;
    public aknj c;
    public alhc d;
    public ahdp e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alhe.class, a = new alhe());
    }
    
    private alhe() {
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
                if ((f = alhe.f) == null) {
                    synchronized (alhe.class) {
                        if (alhe.f == null) {
                            alhe.f = (ahev)new ahcs((ahcz)alhe.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alhe.a;
            }
            case 4: {
                return new ahcr((ahcz)alhe.a);
            }
            case 3: {
                return new alhe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhe.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u041b", new Object[] { "b", "c", "d", "e", aisc.class });
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
