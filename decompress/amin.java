import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amin extends ahcz implements aheo
{
    public static final amin a;
    private static volatile ahev c;
    public amim b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(amin.class, a = new amin());
    }
    
    private amin() {
        this.e = 2;
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
                final ahev c;
                if ((c = amin.c) == null) {
                    synchronized (amin.class) {
                        if (amin.c == null) {
                            amin.c = (ahev)new ahcs((ahcz)amin.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amin.a;
            }
            case 4: {
                return new ahcr((ahcz)amin.a);
            }
            case 3: {
                return new amin();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amin.a, "\u0001\u0001\u0000\u0001\ufa43\u2f73\ufa43\u2f73\u0001\u0000\u0000\u0001\ufa43\u2f73\u1409\u0000", new Object[] { "d", "b" });
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
