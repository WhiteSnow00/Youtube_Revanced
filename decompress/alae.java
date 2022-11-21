import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alae extends ahcz implements aheo
{
    public static final alae a;
    private static volatile ahev f;
    public int b;
    public aknj c;
    public ahbt d;
    public alaf e;
    private ahjl g;
    private anxa h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alae.class, a = new alae());
    }
    
    private alae() {
        this.i = 2;
        this.d = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = alae.f) == null) {
                    synchronized (alae.class) {
                        if (alae.f == null) {
                            alae.f = (ahev)new ahcs((ahcz)alae.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return alae.a;
            }
            case 4: {
                return new ahcr((ahcz)alae.a);
            }
            case 3: {
                return new alae();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alae.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0001\u0007\u100a\u0002", new Object[] { "b", "c", "e", "h", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
