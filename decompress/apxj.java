import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxj extends ahcz implements aheo
{
    public static final apxj a;
    private static volatile ahev f;
    public int b;
    public float c;
    public float d;
    public float e;
    
    static {
        ahcz.registerDefaultInstance(apxj.class, a = new apxj());
    }
    
    private apxj() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = apxj.f) == null) {
                    synchronized (apxj.class) {
                        if (apxj.f == null) {
                            apxj.f = (ahev)new ahcs((ahcz)apxj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxj.a;
            }
            case 4: {
                return new ahcr((ahcz)apxj.a);
            }
            case 3: {
                return new apxj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002", new Object[] { "b", "c", "d", "e" });
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
