import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aipp extends ahcz implements aheo
{
    public static final aipp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aipp.class, a = new aipp());
    }
    
    private aipp() {
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
                if ((d = aipp.d) == null) {
                    synchronized (aipp.class) {
                        if (aipp.d == null) {
                            aipp.d = (ahev)new ahcs((ahcz)aipp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aipp.a;
            }
            case 4: {
                return new ahcr((ahcz)aipp.a);
            }
            case 3: {
                return new aipp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aipp.a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\u0003\u103c\u0000", new Object[] { "c", "b", aipl.class, aipd.class, aipc.class });
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
