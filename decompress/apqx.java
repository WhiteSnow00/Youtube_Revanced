import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqx extends ahcz implements aheo
{
    public static final apqx a;
    private static volatile ahev b;
    private int c;
    private appw d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apqx.class, a = new apqx());
    }
    
    private apqx() {
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
                final ahev b;
                if ((b = apqx.b) == null) {
                    synchronized (apqx.class) {
                        if (apqx.b == null) {
                            apqx.b = (ahev)new ahcs((ahcz)apqx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return apqx.a;
            }
            case 4: {
                return new ahcr((ahcz)apqx.a);
            }
            case 3: {
                return new apqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apqx.a, "\u0001\u0001\u0000\u0001\uf87c\u18b0\uf87c\u18b0\u0001\u0000\u0000\u0001\uf87c\u18b0\u1409\u0000", new Object[] { "c", "d" });
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
