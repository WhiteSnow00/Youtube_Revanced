import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkb extends ahcz implements aheo
{
    public static final amkb a;
    private static volatile ahev e;
    public ahdp b;
    public int c;
    public ahbt d;
    private int f;
    private ahjl g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amkb.class, a = new amkb());
    }
    
    private amkb() {
        this.h = 2;
        this.b = ahcz.emptyProtobufList();
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
                if ((e = amkb.e) == null) {
                    synchronized (amkb.class) {
                        if (amkb.e == null) {
                            amkb.e = (ahev)new ahcs((ahcz)amkb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkb.a;
            }
            case 4: {
                return new ahcr((ahcz)amkb.a);
            }
            case 3: {
                return new amkb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkb.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001\u041b\u0002\u1004\u0000\u0003\u1409\u0001\u0004\u100a\u0002", new Object[] { "f", "b", amke.class, "c", "g", "d" });
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
