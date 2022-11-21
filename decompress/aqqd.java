import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqd extends ahcz implements aheo
{
    public static final aqqd a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aqqd.class, a = new aqqd());
    }
    
    private aqqd() {
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
                if ((d = aqqd.d) == null) {
                    synchronized (aqqd.class) {
                        if (aqqd.d == null) {
                            aqqd.d = (ahev)new ahcs((ahcz)aqqd.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqqd.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqd.a);
            }
            case 3: {
                return new aqqd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqd.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", aqpr.class });
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
