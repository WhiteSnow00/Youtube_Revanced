import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqj extends ahcz implements aheo
{
    public static final alqj a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public aisc d;
    public ajws e;
    public aisc f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alqj.class, a = new alqj());
    }
    
    private alqj() {
        this.j = 2;
        this.g = ahbt.b;
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
                final ahev h;
                if ((h = alqj.h) == null) {
                    synchronized (alqj.class) {
                        if (alqj.h == null) {
                            alqj.h = (ahev)new ahcs((ahcz)alqj.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqj.a;
            }
            case 4: {
                return new ahcr((ahcz)alqj.a);
            }
            case 3: {
                return new alqj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqj.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u100a\u0005\u0007\u1409\u0001", new Object[] { "b", "c", "e", "f", "i", "g", "d" });
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
