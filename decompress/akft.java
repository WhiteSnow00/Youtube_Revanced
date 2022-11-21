import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akft extends ahcz implements aheo
{
    public static final akft a;
    private static volatile ahev b;
    private ahej c;
    private byte d;
    
    static {
        ahcz.registerDefaultInstance(akft.class, a = new akft());
    }
    
    private akft() {
        this.c = ahej.a;
        this.d = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte d = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = akft.b) == null) {
                    synchronized (akft.class) {
                        if (akft.b == null) {
                            akft.b = (ahev)new ahcs((ahcz)akft.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akft.a;
            }
            case 4: {
                return new ahcr((ahcz)akft.a);
            }
            case 3: {
                return new akft();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akft.a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002\u0432", new Object[] { "c", akfs.a });
            }
            case 1: {
                if (o == null) {
                    d = 0;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
