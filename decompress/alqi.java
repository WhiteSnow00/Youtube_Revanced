import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqi extends ahcz implements aheo
{
    public static final alqi a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public ajws d;
    public akfj e;
    public anxb f;
    public anxb g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(alqi.class, a = new alqi());
    }
    
    private alqi() {
        this.j = 2;
        final ahbt b = ahbt.b;
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
                if ((h = alqi.h) == null) {
                    synchronized (alqi.class) {
                        if (alqi.h == null) {
                            alqi.h = (ahev)new ahcs((ahcz)alqi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqi.a;
            }
            case 4: {
                return new ahcr((ahcz)alqi.a);
            }
            case 3: {
                return new alqi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alqi.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "i" });
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
