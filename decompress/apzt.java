import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzt extends ahcz implements aheo
{
    public static final apzt a;
    private static volatile ahev g;
    public int b;
    public ajws c;
    public ajws d;
    public ajws e;
    public ajws f;
    private ajws h;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apzt.class, a = new apzt());
    }
    
    private apzt() {
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
                final ahev g;
                if ((g = apzt.g) == null) {
                    synchronized (apzt.class) {
                        if (apzt.g == null) {
                            apzt.g = (ahev)new ahcs((ahcz)apzt.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apzt.a;
            }
            case 4: {
                return new ahcr((ahcz)apzt.a);
            }
            case 3: {
                return new apzt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzt.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "b", "c", "d", "e", "f", "h", "i" });
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
