import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amjt extends ahcz implements aheo
{
    public static final amjt a;
    private static volatile ahev e;
    public int b;
    public String c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(amjt.class, a = new amjt());
    }
    
    private amjt() {
        this.c = "";
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = amjt.e) == null) {
                    synchronized (amjt.class) {
                        if (amjt.e == null) {
                            amjt.e = (ahev)new ahcs((ahcz)amjt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amjt.a;
            }
            case 4: {
                return new ahcr((ahcz)amjt.a);
            }
            case 3: {
                return new amjt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amjt.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
