import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxr extends ahcz implements aheo
{
    public static final apxr a;
    private static volatile ahev f;
    public int b;
    public int c;
    public Object d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(apxr.class, a = new apxr());
    }
    
    private apxr() {
        this.c = 0;
        this.e = "";
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
                if ((f = apxr.f) == null) {
                    synchronized (apxr.class) {
                        if (apxr.f == null) {
                            apxr.f = (ahev)new ahcs((ahcz)apxr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxr.a;
            }
            case 4: {
                return new ahcr((ahcz)apxr.a);
            }
            case 3: {
                return new apxr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxr.a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1037\u0000\u0003\u1034\u0000\u0004\u103a\u0000\u0005\u103b\u0000\u0006\u103d\u0000\u0007\u103c\u0000\b\u103c\u0000\t\u103c\u0000\n\u103c\u0000", new Object[] { "d", "c", "b", "e", apxe.class, apxi.class, apxq.class, apya.class });
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
