import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhz extends ahcz implements aheo
{
    private static final amhz a;
    private static volatile ahev b;
    private ahdp c;
    
    static {
        ahcz.registerDefaultInstance(amhz.class, a = new amhz());
    }
    
    private amhz() {
        this.c = ahcz.emptyProtobufList();
    }
    
    public static amhz a() {
        return amhz.a;
    }
    
    public static amhz b() {
        return amhz.a;
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
                if ((b = amhz.b) == null) {
                    synchronized (amhz.class) {
                        if (amhz.b == null) {
                            amhz.b = (ahev)new ahcs((ahcz)amhz.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return amhz.a;
            }
            case 4: {
                return new ahcr((ahcz)a());
            }
            case 3: {
                return new amhz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhz.a, "\u0001\u0000", null);
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
