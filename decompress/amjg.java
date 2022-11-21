import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjg extends ahcz implements aheo
{
    public static final amjg a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(amjg.class, a = new amjg());
    }
    
    private amjg() {
        this.c = "";
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
                if ((d = amjg.d) == null) {
                    synchronized (amjg.class) {
                        if (amjg.d == null) {
                            amjg.d = (ahev)new ahcs((ahcz)amjg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amjg.a;
            }
            case 4: {
                return new ahcr((ahcz)amjg.a);
            }
            case 3: {
                return new amjg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjg.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
