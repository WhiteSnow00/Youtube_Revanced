import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjr extends ahcz implements aheo
{
    public static final apjr a;
    private static volatile ahev f;
    public int b;
    public apjq c;
    public int d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(apjr.class, a = new apjr());
    }
    
    private apjr() {
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
                if ((f = apjr.f) == null) {
                    synchronized (apjr.class) {
                        if (apjr.f == null) {
                            apjr.f = (ahev)new ahcs((ahcz)apjr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjr.a;
            }
            case 4: {
                return new ahcr((ahcz)apjr.a);
            }
            case 3: {
                return new apjr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100c\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", aoxk.q, "e" });
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
