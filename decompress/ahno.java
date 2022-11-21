import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahno extends ahcz implements aheo
{
    private static final ahno a;
    private static volatile ahev b;
    
    static {
        ahcz.registerDefaultInstance(ahno.class, a = new ahno());
    }
    
    private ahno() {
    }
    
    public static ahno a() {
        return ahno.a;
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
                if ((b = ahno.b) == null) {
                    synchronized (ahno.class) {
                        if (ahno.b == null) {
                            ahno.b = (ahev)new ahcs((ahcz)ahno.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ahno.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new ahno();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahno.a, "\u0001\u0000", null);
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
