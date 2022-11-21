import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammn extends ahcz implements aheo
{
    public static final ammn a;
    private static volatile ahev e;
    public int b;
    public Object c;
    public int d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(ammn.class, a = new ammn());
    }
    
    private ammn() {
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
                final ahev e;
                if ((e = ammn.e) == null) {
                    synchronized (ammn.class) {
                        if (ammn.e == null) {
                            ammn.e = (ahev)new ahcs((ahcz)ammn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ammn.a;
            }
            case 4: {
                return new ahcr((ahcz)ammn.a);
            }
            case 3: {
                return new ammn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammn.a, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u103a\u0000", new Object[] { "c", "b", "f", "d", amgw.t });
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
