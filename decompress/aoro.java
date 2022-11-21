import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoro extends ahcz implements aheo
{
    public static final aoro a;
    private static volatile ahev i;
    public int b;
    public ajws c;
    public aorp d;
    public aiet e;
    public aiet f;
    public int g;
    public ahbt h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aoro.class, a = new aoro());
    }
    
    private aoro() {
        this.k = 2;
        this.h = ahbt.b;
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
                final ahev i;
                if ((i = aoro.i) == null) {
                    synchronized (aoro.class) {
                        if (aoro.i == null) {
                            aoro.i = (ahev)new ahcs((ahcz)aoro.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoro.a;
            }
            case 4: {
                return new ahcr((ahcz)aoro.a);
            }
            case 3: {
                return new aoro();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoro.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u100c\u0004\u0006\u1409\u0005\u0007\u100a\u0006", new Object[] { "b", "c", "d", "e", "f", "g", aort.b, "j", "h" });
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
