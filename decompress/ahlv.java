import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahlv extends ahcz implements aheo
{
    public static final ahlv a;
    private static volatile ahev d;
    public int b;
    public int c;
    
    static {
        ahcz.registerDefaultInstance(ahlv.class, a = new ahlv());
    }
    
    private ahlv() {
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
                if ((d = ahlv.d) == null) {
                    synchronized (ahlv.class) {
                        if (ahlv.d == null) {
                            ahlv.d = (ahev)new ahcs((ahcz)ahlv.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahlv.a;
            }
            case 4: {
                return new ahcr((ahcz)ahlv.a);
            }
            case 3: {
                return new ahlv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahlv.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1004\u0000", new Object[] { "b", "c" });
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
