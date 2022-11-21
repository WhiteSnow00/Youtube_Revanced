import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akfe extends ahcz implements aheo
{
    public static final akfe a;
    private static volatile ahev b;
    private byte c;
    
    static {
        ahcz.registerDefaultInstance(akfe.class, a = new akfe());
    }
    
    private akfe() {
        this.c = 2;
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
                if ((b = akfe.b) == null) {
                    synchronized (akfe.class) {
                        if (akfe.b == null) {
                            akfe.b = (ahev)new ahcs((ahcz)akfe.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akfe.a;
            }
            case 4: {
                return new ahcr((ahcz)akfe.a);
            }
            case 3: {
                return new akfe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akfe.a, "\u0001\u0000", null);
            }
            case 1: {
                byte c;
                if (o == null) {
                    c = 0;
                }
                else {
                    c = 1;
                }
                this.c = c;
                return null;
            }
            case 0: {
                return this.c;
            }
        }
    }
}
