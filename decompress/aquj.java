import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquj extends ahcz implements aheo
{
    public static final aquj a;
    private static volatile ahev f;
    public int b;
    public aquu c;
    public aquq d;
    public aquw e;
    
    static {
        ahcz.registerDefaultInstance(aquj.class, a = new aquj());
    }
    
    private aquj() {
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
                if ((f = aquj.f) == null) {
                    synchronized (aquj.class) {
                        if (aquj.f == null) {
                            aquj.f = (ahev)new ahcs((ahcz)aquj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aquj.a;
            }
            case 4: {
                return new ahcr((ahcz)aquj.a);
            }
            case 3: {
                return new aquj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002", new Object[] { "b", "c", "d", "e" });
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
