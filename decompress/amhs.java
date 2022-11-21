import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhs extends ahcz implements aheo
{
    private static final amhs a;
    private static volatile ahev b;
    private String c;
    
    static {
        ahcz.registerDefaultInstance(amhs.class, a = new amhs());
    }
    
    private amhs() {
        this.c = "";
    }
    
    public static amhs a() {
        return amhs.a;
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
                if ((b = amhs.b) == null) {
                    synchronized (amhs.class) {
                        if (amhs.b == null) {
                            amhs.b = (ahev)new ahcs((ahcz)amhs.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhs.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new amhs();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhs.a, "\u0001\u0000", null);
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
