import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptd extends ahcz implements aheo
{
    public static final aptd a;
    private static volatile ahev e;
    public aowb b;
    public aowb c;
    public aowb d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aptd.class, a = new aptd());
    }
    
    private aptd() {
        this.g = 2;
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
                final ahev e;
                if ((e = aptd.e) == null) {
                    synchronized (aptd.class) {
                        if (aptd.e == null) {
                            aptd.e = (ahev)new ahcs((ahcz)aptd.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aptd.a;
            }
            case 4: {
                return new ahcr((ahcz)aptd.a);
            }
            case 3: {
                return new aptd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
