import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amab extends ahcz implements aheo
{
    public static final amab a;
    private static volatile ahev g;
    public ajws b;
    public ajws c;
    public ajws d;
    public ajws e;
    public boolean f;
    private int h;
    private ajws i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(amab.class, a = new amab());
    }
    
    private amab() {
        this.j = 2;
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
                final ahev g;
                if ((g = amab.g) == null) {
                    synchronized (amab.class) {
                        if (amab.g == null) {
                            amab.g = (ahev)new ahcs((ahcz)amab.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return amab.a;
            }
            case 4: {
                return new ahcr((ahcz)amab.a);
            }
            case 3: {
                return new amab();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amab.a, "\u0001\u0006\u0000\u0001\u0003\b\u0006\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1007\u0007", new Object[] { "h", "b", "c", "d", "i", "e", "f" });
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
