import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbc extends ahcz implements aheo
{
    public static final arbc a;
    private static volatile ahev e;
    public int b;
    public aras c;
    public arbd d;
    
    static {
        ahcz.registerDefaultInstance(arbc.class, a = new arbc());
    }
    
    private arbc() {
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
                if ((e = arbc.e) == null) {
                    synchronized (arbc.class) {
                        if (arbc.e == null) {
                            arbc.e = (ahev)new ahcs((ahcz)arbc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return arbc.a;
            }
            case 4: {
                return new ahcr((ahcz)arbc.a);
            }
            case 3: {
                return new arbc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arbc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", new Object[] { "b", "c", "d" });
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
