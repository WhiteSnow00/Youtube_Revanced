import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkn extends ahcz implements aheo
{
    public static final amkn a;
    private static volatile ahev e;
    public ajws b;
    public String c;
    public ajws d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amkn.class, a = new amkn());
    }
    
    private amkn() {
        this.h = 2;
        this.c = "";
        final ahbt b = ahbt.b;
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
                if ((e = amkn.e) == null) {
                    synchronized (amkn.class) {
                        if (amkn.e == null) {
                            amkn.e = (ahev)new ahcs((ahcz)amkn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkn.a;
            }
            case 4: {
                return new ahcr((ahcz)amkn.a);
            }
            case 3: {
                return new amkn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkn.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "f", "b", "c", "d", "g" });
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
