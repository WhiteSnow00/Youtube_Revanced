import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkh extends ahcz implements aheo
{
    public static final amkh a;
    private static volatile ahev c;
    public ahdp b;
    private int d;
    private ahjl e;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amkh.class, a = new amkh());
    }
    
    private amkh() {
        this.f = 2;
        this.b = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = amkh.c) == null) {
                    synchronized (amkh.class) {
                        if (amkh.c == null) {
                            amkh.c = (ahev)new ahcs((ahcz)amkh.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amkh.a;
            }
            case 4: {
                return new ahcr((ahcz)amkh.a);
            }
            case 3: {
                return new amkh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkh.a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0001", new Object[] { "d", "b", anxb.class, "e" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
