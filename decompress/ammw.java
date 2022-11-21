import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammw extends ahcz implements aheo
{
    public static final ammw a;
    private static volatile ahev b;
    private ahej c;
    
    static {
        ahcz.registerDefaultInstance(ammw.class, a = new ammw());
    }
    
    private ammw() {
        this.c = ahej.a;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = ammw.b) == null) {
                    synchronized (ammw.class) {
                        if (ammw.b == null) {
                            ammw.b = (ahev)new ahcs((ahcz)ammw.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ammw.a;
            }
            case 4: {
                return new ahcr((ahcz)ammw.a);
            }
            case 3: {
                return new ammw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammw.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", ammv.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
