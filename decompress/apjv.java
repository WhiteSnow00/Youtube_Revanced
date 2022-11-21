import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjv extends ahcz implements aheo
{
    public static final apjv a;
    private static volatile ahev f;
    public int b;
    public apjq c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(apjv.class, a = new apjv());
    }
    
    private apjv() {
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
                if ((f = apjv.f) == null) {
                    synchronized (apjv.class) {
                        if (apjv.f == null) {
                            apjv.f = (ahev)new ahcs((ahcz)apjv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjv.a;
            }
            case 4: {
                return new ahcr((ahcz)apjv.a);
            }
            case 3: {
                return new apjv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjv.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0004\u100c\u0003", new Object[] { "b", "c", "d", apki.a(), "e", apkc.h });
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
