import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class almr extends ahcz implements aheo
{
    public static final almr a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(almr.class, a = new almr());
    }
    
    private almr() {
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
                if ((b = almr.b) == null) {
                    synchronized (almr.class) {
                        if (almr.b == null) {
                            almr.b = (ahev)new ahcs((ahcz)almr.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return almr.a;
            }
            case 4: {
                return new ahcr((ahcz)almr.a);
            }
            case 3: {
                return new almr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)almr.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f" });
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
