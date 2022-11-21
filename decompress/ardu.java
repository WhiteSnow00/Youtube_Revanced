import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardu extends ahcz implements aheo
{
    public static final ardu a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(ardu.class, a = new ardu());
    }
    
    private ardu() {
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
                final ahev d;
                if ((d = ardu.d) == null) {
                    synchronized (ardu.class) {
                        if (ardu.d == null) {
                            ardu.d = (ahev)new ahcs((ahcz)ardu.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ardu.a;
            }
            case 4: {
                return new ahcr((ahcz)ardu.a);
            }
            case 3: {
                return new ardu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardu.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103f\u0000\u0002\u103f\u0000", new Object[] { "c", "b", aqym.u, areg.b });
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
