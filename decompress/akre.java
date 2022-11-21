import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akre extends ahcz implements aheo
{
    public static final akre a;
    private static volatile ahev d;
    public int b;
    public alvz c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akre.class, a = new akre());
    }
    
    private akre() {
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
                if ((d = akre.d) == null) {
                    synchronized (akre.class) {
                        if (akre.d == null) {
                            akre.d = (ahev)new ahcs((ahcz)akre.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akre.a;
            }
            case 4: {
                return new ahcr((ahcz)akre.a);
            }
            case 3: {
                return new akre();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akre.a, "\u0001\u0001\u0000\u0001\ue572\u3b21\ue572\u3b21\u0001\u0000\u0000\u0001\ue572\u3b21\u1409\u0000", new Object[] { "b", "c" });
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
