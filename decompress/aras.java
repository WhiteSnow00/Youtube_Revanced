import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aras extends ahcz implements aheo
{
    public static final aras a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aras.class, a = new aras());
    }
    
    private aras() {
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
                if ((d = aras.d) == null) {
                    synchronized (aras.class) {
                        if (aras.d == null) {
                            aras.d = (ahev)new ahcs((ahcz)aras.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aras.a;
            }
            case 4: {
                return new ahcr((ahcz)aras.a);
            }
            case 3: {
                return new aras();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aras.a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u103b\u0000\u0002\u103c\u0000", new Object[] { "c", "b", arar.class });
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
