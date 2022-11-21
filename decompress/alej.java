import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alej extends ahcz implements aheo
{
    public static final alej a;
    private static volatile ahev e;
    public aknj b;
    public String c;
    public alek d;
    private int f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(alej.class, a = new alej());
    }
    
    private alej() {
        this.g = 2;
        this.c = "";
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
                if ((e = alej.e) == null) {
                    synchronized (alej.class) {
                        if (alej.e == null) {
                            alej.e = (ahev)new ahcs((ahcz)alej.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alej.a;
            }
            case 4: {
                return new ahcr((ahcz)alej.a);
            }
            case 3: {
                return new alej();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alej.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1409\u0002", new Object[] { "f", "b", "c", "d" });
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
