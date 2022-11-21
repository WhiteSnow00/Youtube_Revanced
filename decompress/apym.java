import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apym extends ahcz implements aheo
{
    public static final apym a;
    private static volatile ahev f;
    public int b;
    public apyl c;
    public apyk d;
    public anzr e;
    
    static {
        ahcz.registerDefaultInstance(apym.class, a = new apym());
    }
    
    private apym() {
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
                if ((f = apym.f) == null) {
                    synchronized (apym.class) {
                        if (apym.f == null) {
                            apym.f = (ahev)new ahcs((ahcz)apym.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apym.a;
            }
            case 4: {
                return new ahcr((ahcz)apym.a);
            }
            case 3: {
                return new apym();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apym.a, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1009\u0002\b\u1009\u0007", new Object[] { "b", "c", "d", "e" });
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
