import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbb extends ahcz implements aheo
{
    public static final arbb a;
    private static volatile ahev d;
    public int b;
    public aras c;
    
    static {
        ahcz.registerDefaultInstance(arbb.class, a = new arbb());
    }
    
    private arbb() {
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
                if ((d = arbb.d) == null) {
                    synchronized (arbb.class) {
                        if (arbb.d == null) {
                            arbb.d = (ahev)new ahcs((ahcz)arbb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbb.a;
            }
            case 4: {
                return new ahcr((ahcz)arbb.a);
            }
            case 3: {
                return new arbb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
