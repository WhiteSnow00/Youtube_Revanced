import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amld extends ahcz implements aheo
{
    public static final amld a;
    private static volatile ahev e;
    public int b;
    public amle c;
    public amlc d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(amld.class, a = new amld());
    }
    
    private amld() {
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
                if ((e = amld.e) == null) {
                    synchronized (amld.class) {
                        if (amld.e == null) {
                            amld.e = (ahev)new ahcs((ahcz)amld.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amld.a;
            }
            case 4: {
                return new ahcr((ahcz)amld.a);
            }
            case 3: {
                return new amld();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amld.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
