import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amht extends ahcz implements aheo
{
    private static final amht a;
    private static volatile ahev b;
    private String c;
    
    static {
        ahcz.registerDefaultInstance(amht.class, a = new amht());
    }
    
    private amht() {
        this.c = "";
    }
    
    public static amht a() {
        return amht.a;
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
                if ((b = amht.b) == null) {
                    synchronized (amht.class) {
                        if (amht.b == null) {
                            amht.b = (ahev)new ahcs((ahcz)amht.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amht.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new amht();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amht.a, "\u0001\u0000", null);
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
