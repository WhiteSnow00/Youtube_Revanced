import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqik extends ahcz implements aheo
{
    public static final aqik a;
    private static volatile ahev d;
    public int b;
    public float c;
    
    static {
        ahcz.registerDefaultInstance(aqik.class, a = new aqik());
    }
    
    private aqik() {
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
                if ((d = aqik.d) == null) {
                    synchronized (aqik.class) {
                        if (aqik.d == null) {
                            aqik.d = (ahev)new ahcs((ahcz)aqik.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqik.a;
            }
            case 4: {
                return new ahcr((ahcz)aqik.a);
            }
            case 3: {
                return new aqik();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqik.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1001\u0000", new Object[] { "b", "c" });
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
