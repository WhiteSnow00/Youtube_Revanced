import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyg extends ahcz implements aheo
{
    public static final akyg a;
    private static volatile ahev d;
    public int b;
    public amxh c;
    
    static {
        ahcz.registerDefaultInstance(akyg.class, a = new akyg());
    }
    
    private akyg() {
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
                if ((d = akyg.d) == null) {
                    synchronized (akyg.class) {
                        if (akyg.d == null) {
                            akyg.d = (ahev)new ahcs((ahcz)akyg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyg.a;
            }
            case 4: {
                return new ahcr((ahcz)akyg.a);
            }
            case 3: {
                return new akyg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyg.a, "\u0001\u0001\u0000\u0001\ue359\u1890\ue359\u1890\u0001\u0000\u0000\u0000\ue359\u1890\u1009\u0000", new Object[] { "b", "c" });
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
