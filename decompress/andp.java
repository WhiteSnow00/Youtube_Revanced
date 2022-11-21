import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andp extends ahcz implements aheo
{
    public static final andp a;
    private static volatile ahev e;
    public int b;
    public boolean c;
    public andq d;
    private ando f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(andp.class, a = new andp());
    }
    
    private andp() {
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
                if ((e = andp.e) == null) {
                    synchronized (andp.class) {
                        if (andp.e == null) {
                            andp.e = (ahev)new ahcs((ahcz)andp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return andp.a;
            }
            case 4: {
                return new ahcr((ahcz)andp.a);
            }
            case 3: {
                return new andp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)andp.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001\u1007\u0000\u0003\u1409\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "f", "d" });
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
