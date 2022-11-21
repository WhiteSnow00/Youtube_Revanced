import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxd extends ahcz implements aheo
{
    public static final apxd a;
    private static volatile ahev f;
    public int b;
    public apxp c;
    public apxw d;
    public apxo e;
    
    static {
        ahcz.registerDefaultInstance(apxd.class, a = new apxd());
    }
    
    private apxd() {
        emptyIntList();
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
                if ((f = apxd.f) == null) {
                    synchronized (apxd.class) {
                        if (apxd.f == null) {
                            apxd.f = (ahev)new ahcs((ahcz)apxd.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxd.a;
            }
            case 4: {
                return new ahcr((ahcz)apxd.a);
            }
            case 3: {
                return new apxd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxd.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
