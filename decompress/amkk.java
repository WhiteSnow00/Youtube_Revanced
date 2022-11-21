import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amkk extends ahcz implements aheo
{
    public static final amkk a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public long d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amkk.class, a = new amkk());
    }
    
    private amkk() {
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
                if ((e = amkk.e) == null) {
                    synchronized (amkk.class) {
                        if (amkk.e == null) {
                            amkk.e = (ahev)new ahcs((ahcz)amkk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amkk.a;
            }
            case 4: {
                return new ahcr((ahcz)amkk.a);
            }
            case 3: {
                return new amkk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amkk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1002\u0001", new Object[] { "b", "c", "d" });
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
