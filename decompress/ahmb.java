import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmb extends ahcz implements aheo
{
    public static final ahmb a;
    private static volatile ahev c;
    public String b;
    private int d;
    
    static {
        ahcz.registerDefaultInstance(ahmb.class, a = new ahmb());
    }
    
    private ahmb() {
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
                if ((c = ahmb.c) == null) {
                    synchronized (ahmb.class) {
                        if (ahmb.c == null) {
                            ahmb.c = (ahev)new ahcs((ahcz)ahmb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahmb.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmb.a);
            }
            case 3: {
                return new ahmb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "d", "b" });
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
