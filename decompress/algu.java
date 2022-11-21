import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class algu extends ahcz implements aheo
{
    public static final algu a;
    private static volatile ahev g;
    public int b;
    public aknj c;
    public algv d;
    public ahbt e;
    public aisc f;
    private ahjl h;
    private ajxn i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(algu.class, a = new algu());
    }
    
    private algu() {
        this.j = 2;
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = algu.g) == null) {
                    synchronized (algu.class) {
                        if (algu.g == null) {
                            algu.g = (ahev)new ahcs((ahcz)algu.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return algu.a;
            }
            case 4: {
                return new ahcr((ahcz)algu.a);
            }
            case 3: {
                return new algu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)algu.a, "\u0001\u0006\u0000\u0001\u0001\u0309\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0309\u1409\u0005", new Object[] { "b", "c", "d", "e", "h", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
