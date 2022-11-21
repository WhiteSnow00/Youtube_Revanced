import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amcd extends ahcz implements aheo
{
    public static final amcd a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(amcd.class, a = new amcd());
    }
    
    private amcd() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = amcd.d) == null) {
                    synchronized (amcd.class) {
                        if (amcd.d == null) {
                            amcd.d = (ahev)new ahcs((ahcz)amcd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amcd.a;
            }
            case 4: {
                return new ahcr((ahcz)amcd.a);
            }
            case 3: {
                return new amcd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amcd.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103b\u0000", new Object[] { "c", "b" });
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
