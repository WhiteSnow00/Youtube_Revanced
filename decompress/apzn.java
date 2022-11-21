import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzn extends ahcz implements aheo
{
    public static final apzn a;
    private static volatile ahev d;
    public int b;
    public apzf c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzn.class, a = new apzn());
    }
    
    private apzn() {
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
                if ((d = apzn.d) == null) {
                    synchronized (apzn.class) {
                        if (apzn.d == null) {
                            apzn.d = (ahev)new ahcs((ahcz)apzn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzn.a;
            }
            case 4: {
                return new ahcr((ahcz)apzn.a);
            }
            case 3: {
                return new apzn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzn.a, "\u0001\u0001\u0000\u0001\uf6fd\u1da4\uf6fd\u1da4\u0001\u0000\u0000\u0001\uf6fd\u1da4\u1409\u0000", new Object[] { "b", "c" });
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
