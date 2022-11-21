import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aext extends ahcz implements aheo
{
    public static final aext a;
    private static volatile ahev d;
    public String b;
    public float c;
    
    static {
        ahcz.registerDefaultInstance(aext.class, a = new aext());
    }
    
    private aext() {
        this.b = "";
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
                if ((d = aext.d) == null) {
                    synchronized (aext.class) {
                        if (aext.d == null) {
                            aext.d = (ahev)new ahcs((ahcz)aext.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aext.a;
            }
            case 4: {
                return new ahcr((ahcz)aext.a);
            }
            case 3: {
                return new aext();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aext.a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0001", new Object[] { "b", "c" });
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
