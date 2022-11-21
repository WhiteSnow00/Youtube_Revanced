import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apra extends ahcz implements aheo
{
    public static final apra a;
    private static volatile ahev f;
    public int b;
    public apqz c;
    public float d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(apra.class, a = new apra());
    }
    
    private apra() {
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
                if ((f = apra.f) == null) {
                    synchronized (apra.class) {
                        if (apra.f == null) {
                            apra.f = (ahev)new ahcs((ahcz)apra.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apra.a;
            }
            case 4: {
                return new ahcr((ahcz)apra.a);
            }
            case 3: {
                return new apra();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apra.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1001\u0001\u0004\u1007\u0003", new Object[] { "b", "c", "d", "e" });
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
