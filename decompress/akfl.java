import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfl extends ahcz implements aheo
{
    public static final akfl a;
    private static volatile ahev d;
    public int b;
    public akfj c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akfl.class, a = new akfl());
    }
    
    private akfl() {
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
                if ((d = akfl.d) == null) {
                    synchronized (akfl.class) {
                        if (akfl.d == null) {
                            akfl.d = (ahev)new ahcs((ahcz)akfl.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akfl.a;
            }
            case 4: {
                return new ahcr((ahcz)akfl.a);
            }
            case 3: {
                return new akfl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfl.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
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
