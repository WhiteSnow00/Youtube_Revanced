import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apex extends ahcz implements aheo
{
    public static final apex a;
    private static volatile ahev b;
    private int c;
    private ajws d;
    private ajws e;
    private ajws f;
    private ajws g;
    private aiet h;
    private aiet i;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(apex.class, a = new apex());
    }
    
    private apex() {
        this.k = 2;
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = apex.b) == null) {
                    synchronized (apex.class) {
                        if (apex.b == null) {
                            apex.b = (ahev)new ahcs((ahcz)apex.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apex.a;
            }
            case 4: {
                return new ahcr((ahcz)apex.a);
            }
            case 3: {
                return new apex();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apex.a, "\u0001\u0007\u0000\u0001\u0002\t\u0007\u0000\u0000\u0007\u0002\u1409\u0002\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\t\u1409\u0001", new Object[] { "c", "e", "f", "g", "h", "i", "j", "d" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
