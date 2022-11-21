import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkd extends ahcz implements aheo
{
    public static final amkd a;
    private static volatile ahev f;
    public ajws b;
    public ahdp c;
    public boolean d;
    public ahbt e;
    private int g;
    private ahjl h;
    private byte i;
    
    static {
        ahcz.registerDefaultInstance(amkd.class, a = new amkd());
    }
    
    private amkd() {
        this.i = 2;
        this.c = ahcz.emptyProtobufList();
        this.e = ahbt.b;
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
                final ahev f;
                if ((f = amkd.f) == null) {
                    synchronized (amkd.class) {
                        if (amkd.f == null) {
                            amkd.f = (ahev)new ahcs((ahcz)amkd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amkd.a;
            }
            case 4: {
                return new ahcr((ahcz)amkd.a);
            }
            case 3: {
                return new amkd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkd.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0002\u0004\u100a\u0003\u0005\u1007\u0001", new Object[] { "g", "b", "c", ajws.class, "h", "e", "d" });
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
