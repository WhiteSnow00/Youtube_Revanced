import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahla extends ahcz implements aheo
{
    public static final ahla a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ahla.class, a = new ahla());
    }
    
    private ahla() {
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
                if ((b = ahla.b) == null) {
                    synchronized (ahla.class) {
                        if (ahla.b == null) {
                            ahla.b = (ahev)new ahcs((ahcz)ahla.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahla.a;
            }
            case 4: {
                return new ahcr((ahcz)ahla.a);
            }
            case 3: {
                return new ahla();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahla.a, "\u0001\u0000", null);
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
