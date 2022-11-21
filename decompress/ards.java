import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ards extends ahcz implements aheo
{
    public static final ards a;
    private static volatile ahev b;
    private ahej c;
    
    static {
        ahcz.registerDefaultInstance(ards.class, a = new ards());
    }
    
    private ards() {
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
                if ((b = ards.b) == null) {
                    synchronized (ards.class) {
                        if (ards.b == null) {
                            ards.b = (ahev)new ahcs((ahcz)ards.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ards.a;
            }
            case 4: {
                return new ahcr((ahcz)ards.a);
            }
            case 3: {
                return new ards();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ards.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", ardr.a });
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
