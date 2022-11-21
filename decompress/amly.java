import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amly extends ahcz implements aheo
{
    public static final amly a;
    private static volatile ahev c;
    public anxb b;
    private int d;
    private anxb e;
    private anxb f;
    private anxb g;
    private byte h;
    
    static {
        ahcz.registerDefaultInstance(amly.class, a = new amly());
    }
    
    private amly() {
        this.h = 2;
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
                final ahev c;
                if ((c = amly.c) == null) {
                    synchronized (amly.class) {
                        if (amly.c == null) {
                            amly.c = (ahev)new ahcs((ahcz)amly.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amly.a;
            }
            case 4: {
                return new ahcr((ahcz)amly.a);
            }
            case 3: {
                return new amly();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amly.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0004\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "d", "e", "f", "b", "g" });
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
