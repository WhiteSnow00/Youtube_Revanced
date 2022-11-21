import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amja extends ahcz implements aheo
{
    public static final amja a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public anxb d;
    private ajws f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amja.class, a = new amja());
    }
    
    private amja() {
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = amja.e) == null) {
                    synchronized (amja.class) {
                        if (amja.e == null) {
                            amja.e = (ahev)new ahcs((ahcz)amja.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amja.a;
            }
            case 4: {
                return new ahcr((ahcz)amja.a);
            }
            case 3: {
                return new amja();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amja.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u1409\u0001", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
