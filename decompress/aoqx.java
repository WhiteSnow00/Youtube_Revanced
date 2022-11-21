import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqx extends ahcz implements aheo
{
    public static final aoqx a;
    private static volatile ahev h;
    public int b;
    public ajws c;
    public ahdp d;
    public int e;
    public int f;
    public aoqz g;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(aoqx.class, a = new aoqx());
    }
    
    private aoqx() {
        this.j = 2;
        this.d = ahcz.emptyProtobufList();
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
                if ((h = aoqx.h) == null) {
                    synchronized (aoqx.class) {
                        if (aoqx.h == null) {
                            aoqx.h = (ahev)new ahcs((ahcz)aoqx.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aoqx.a;
            }
            case 4: {
                return new ahcr((ahcz)aoqx.a);
            }
            case 3: {
                return new aoqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoqx.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u100b\u0003\u0005\u1009\u0005\u0007\u100c\u0004", new Object[] { "b", "c", "i", "d", ajws.class, "e", "g", "f", ahqt.a() });
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
