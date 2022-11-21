import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anun extends ahcz implements aheo
{
    public static final anun a;
    private static volatile ahev g;
    public int b;
    public apop c;
    public anxb d;
    public anxb e;
    public akfj f;
    private ajws h;
    private ahjl i;
    private anxb j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(anun.class, a = new anun());
    }
    
    private anun() {
        this.k = 2;
        final ahbt b = ahbt.b;
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
                final ahev g;
                if ((g = anun.g) == null) {
                    synchronized (anun.class) {
                        if (anun.g == null) {
                            anun.g = (ahev)new ahcs((ahcz)anun.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return anun.a;
            }
            case 4: {
                return new ahcr((ahcz)anun.a);
            }
            case 3: {
                return new anun();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anun.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0006\u1409\u0006\u0007\u1409\u0002\b\u1409\u0007", new Object[] { "b", "c", "d", "f", "h", "i", "e", "j" });
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
