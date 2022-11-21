import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amns extends ahcz implements aheo
{
    public static final amns a;
    private static volatile ahev d;
    public int b;
    public ajws c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amns.class, a = new amns());
    }
    
    private amns() {
        this.e = 2;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amns.d) == null) {
                    synchronized (amns.class) {
                        if (amns.d == null) {
                            amns.d = (ahev)new ahcs((ahcz)amns.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amns.a;
            }
            case 4: {
                return new ahcr((ahcz)amns.a);
            }
            case 3: {
                return new amns();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amns.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u1409\u0001", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
