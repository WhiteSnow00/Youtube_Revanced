import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alms extends ahcz implements aheo
{
    public static final alms a;
    private static volatile ahev e;
    public ajws b;
    public ajws c;
    public ahbt d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(alms.class, a = new alms());
    }
    
    private alms() {
        this.h = 2;
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = alms.e) == null) {
                    synchronized (alms.class) {
                        if (alms.e == null) {
                            alms.e = (ahev)new ahcs((ahcz)alms.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alms.a;
            }
            case 4: {
                return new ahcr((ahcz)alms.a);
            }
            case 3: {
                return new alms();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alms.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u100a\u0003", new Object[] { "f", "b", "c", "g", "d" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
