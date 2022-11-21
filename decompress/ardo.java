import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardo extends ahcz implements aheo
{
    public static final ardo a;
    private static volatile ahev d;
    public int b;
    public double c;
    
    static {
        ahcz.registerDefaultInstance(ardo.class, a = new ardo());
    }
    
    private ardo() {
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
                if ((d = ardo.d) == null) {
                    synchronized (ardo.class) {
                        if (ardo.d == null) {
                            ardo.d = (ahev)new ahcs((ahcz)ardo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ardo.a;
            }
            case 4: {
                return new ahcr((ahcz)ardo.a);
            }
            case 3: {
                return new ardo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardo.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1000\u0000", new Object[] { "b", "c" });
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
