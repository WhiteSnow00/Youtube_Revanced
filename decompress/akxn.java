import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxn extends ahcz implements aheo
{
    public static final akxn a;
    private static volatile ahev c;
    public akxk b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akxn.class, a = new akxn());
    }
    
    private akxn() {
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
                if ((c = akxn.c) == null) {
                    synchronized (akxn.class) {
                        if (akxn.c == null) {
                            akxn.c = (ahev)new ahcs((ahcz)akxn.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akxn.a;
            }
            case 4: {
                return new ahcr((ahcz)akxn.a);
            }
            case 3: {
                return new akxn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxn.a, "\u0001\u0001\u0000\u0001\uf30f\u240b\uf30f\u240b\u0001\u0000\u0000\u0001\uf30f\u240b\u1409\u0000", new Object[] { "d", "b" });
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
