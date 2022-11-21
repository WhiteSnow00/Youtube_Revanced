import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alyq extends ahcz implements aheo
{
    public static final alyq a;
    private static volatile ahev d;
    public int b;
    public String c;
    
    static {
        ahcz.registerDefaultInstance(alyq.class, a = new alyq());
    }
    
    private alyq() {
        this.c = "";
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
                if ((d = alyq.d) == null) {
                    synchronized (alyq.class) {
                        if (alyq.d == null) {
                            alyq.d = (ahev)new ahcs((ahcz)alyq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alyq.a;
            }
            case 4: {
                return new ahcr((ahcz)alyq.a);
            }
            case 3: {
                return new alyq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alyq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "b", "c" });
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
