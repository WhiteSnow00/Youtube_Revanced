import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxa extends ahcz implements aheo
{
    public static final akxa a;
    private static volatile ahev c;
    public aknj b;
    private int d;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akxa.class, a = new akxa());
    }
    
    private akxa() {
        this.e = 2;
        emptyProtobufList();
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
                if ((c = akxa.c) == null) {
                    synchronized (akxa.class) {
                        if (akxa.c == null) {
                            akxa.c = (ahev)new ahcs((ahcz)akxa.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akxa.a;
            }
            case 4: {
                return new ahcr((ahcz)akxa.a);
            }
            case 3: {
                return new akxa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "d", "b" });
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
