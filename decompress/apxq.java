import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxq extends ahcz implements aheo
{
    public static final apxq a;
    private static volatile ahev c;
    public int b;
    private apxh d;
    
    static {
        ahcz.registerDefaultInstance(apxq.class, a = new apxq());
    }
    
    private apxq() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = apxq.c) == null) {
                    synchronized (apxq.class) {
                        if (apxq.c == null) {
                            apxq.c = (ahev)new ahcs((ahcz)apxq.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxq.a;
            }
            case 4: {
                return new ahcr((ahcz)apxq.a);
            }
            case 3: {
                return new apxq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxq.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "b", "d" });
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
