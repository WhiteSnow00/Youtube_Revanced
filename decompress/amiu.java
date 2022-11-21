import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiu extends ahcz implements aheo
{
    public static final amiu a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(amiu.class, a = new amiu());
    }
    
    private amiu() {
        this.b = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = amiu.c) == null) {
                    synchronized (amiu.class) {
                        if (amiu.c == null) {
                            amiu.c = (ahev)new ahcs((ahcz)amiu.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return amiu.a;
            }
            case 4: {
                return new ahcr((ahcz)amiu.a);
            }
            case 3: {
                return new amiu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amiu.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
