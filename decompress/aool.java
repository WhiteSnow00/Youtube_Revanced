import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aool extends ahcz implements aheo
{
    public static final aool a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aool.class, a = new aool());
    }
    
    private aool() {
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
                if ((d = aool.d) == null) {
                    synchronized (aool.class) {
                        if (aool.d == null) {
                            aool.d = (ahev)new ahcs((ahcz)aool.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aool.a;
            }
            case 4: {
                return new ahcr((ahcz)aool.a);
            }
            case 3: {
                return new aool();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aool.a, "\u0001\u0001\u0001\u0000\ue5a9\u4109\ue5a9\u4109\u0001\u0000\u0000\u0000\ue5a9\u4109\u103c\u0000", new Object[] { "c", "b", aoot.class });
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
