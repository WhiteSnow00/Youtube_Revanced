import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxm extends ahcz implements aheo
{
    public static final alxm a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ajws d;
    private ajws f;
    private ajws g;
    private ajws h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(alxm.class, a = new alxm());
    }
    
    private alxm() {
        this.i = 2;
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
                final ahev e;
                if ((e = alxm.e) == null) {
                    synchronized (alxm.class) {
                        if (alxm.e == null) {
                            alxm.e = (ahev)new ahcs((ahcz)alxm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alxm.a;
            }
            case 4: {
                return new ahcr((ahcz)alxm.a);
            }
            case 3: {
                return new alxm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxm.a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0004\u1409\u0002\u0007\u1409\u0005\n\u1409\u0003\u0010\u1409\u0007", new Object[] { "b", "c", "f", "g", "d", "h" });
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
