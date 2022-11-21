import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkc extends ahcz implements aheo
{
    public static final amkc a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public boolean d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amkc.class, a = new amkc());
    }
    
    private amkc() {
        this.f = 2;
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
                final ahev e;
                if ((e = amkc.e) == null) {
                    synchronized (amkc.class) {
                        if (amkc.e == null) {
                            amkc.e = (ahev)new ahcs((ahcz)amkc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkc.a;
            }
            case 4: {
                return new ahcr((ahcz)amkc.a);
            }
            case 3: {
                return new amkc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1007\u0001", new Object[] { "b", "c", "d" });
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
