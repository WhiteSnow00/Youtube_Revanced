import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amot extends ahcz implements aheo
{
    public static final amot a;
    private static volatile ahev b;
    private int c;
    private anxb d;
    private anxb e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amot.class, a = new amot());
    }
    
    private amot() {
        this.g = 2;
        final ahbt b = ahbt.b;
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
                final ahev b;
                if ((b = amot.b) == null) {
                    synchronized (amot.class) {
                        if (amot.b == null) {
                            amot.b = (ahev)new ahcs((ahcz)amot.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amot.a;
            }
            case 4: {
                return new ahcr((ahcz)amot.a);
            }
            case 3: {
                return new amot();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amot.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002", new Object[] { "c", "d", "e", "f" });
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
