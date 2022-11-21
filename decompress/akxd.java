import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxd extends ahcz implements aheo
{
    public static final akxd a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public ahbt d;
    public ahbt e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxd.class, a = new akxd());
    }
    
    private akxd() {
        this.g = 2;
        this.d = ahbt.b;
        this.e = ahbt.b;
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
                if ((f = akxd.f) == null) {
                    synchronized (akxd.class) {
                        if (akxd.f == null) {
                            akxd.f = (ahev)new ahcs((ahcz)akxd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akxd.a;
            }
            case 4: {
                return new ahcr((ahcz)akxd.a);
            }
            case 3: {
                return new akxd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxd.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0004\u100a\u0002\u0005\u100a\u0005", new Object[] { "b", "c", "d", "e" });
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
