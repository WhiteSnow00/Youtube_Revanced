import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyw extends ahcz implements aheo
{
    public static final alyw a;
    private static volatile ahev c;
    public ajws b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alyw.class, a = new alyw());
    }
    
    private alyw() {
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
                if ((c = alyw.c) == null) {
                    synchronized (alyw.class) {
                        if (alyw.c == null) {
                            alyw.c = (ahev)new ahcs((ahcz)alyw.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return alyw.a;
            }
            case 4: {
                return new ahcr((ahcz)alyw.a);
            }
            case 3: {
                return new alyw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyw.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
