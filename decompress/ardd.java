import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardd extends ahcz implements aheo
{
    public static final ardd a;
    private static volatile ahev d;
    public int b;
    public aras c;
    
    static {
        ahcz.registerDefaultInstance(ardd.class, a = new ardd());
    }
    
    private ardd() {
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
                if ((d = ardd.d) == null) {
                    synchronized (ardd.class) {
                        if (ardd.d == null) {
                            ardd.d = (ahev)new ahcs((ahcz)ardd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ardd.a;
            }
            case 4: {
                return new ahcr((ahcz)ardd.a);
            }
            case 3: {
                return new ardd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardd.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "c" });
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
