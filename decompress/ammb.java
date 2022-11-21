import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammb extends ahcz implements aheo
{
    public static final ammb a;
    private static volatile ahev d;
    public int b;
    public amlz c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ammb.class, a = new ammb());
    }
    
    private ammb() {
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
                final ahev d;
                if ((d = ammb.d) == null) {
                    synchronized (ammb.class) {
                        if (ammb.d == null) {
                            ammb.d = (ahev)new ahcs((ahcz)ammb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ammb.a;
            }
            case 4: {
                return new ahcr((ahcz)ammb.a);
            }
            case 3: {
                return new ammb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammb.a, "\u0001\u0001\u0000\u0001\uf7b0\u43e2\uf7b0\u43e2\u0001\u0000\u0000\u0001\uf7b0\u43e2\u1409\u0000", new Object[] { "b", "c" });
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
