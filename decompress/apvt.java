import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvt extends ahcz implements aheo
{
    public static final apvt a;
    private static volatile ahev e;
    public int b;
    public float c;
    public apwg d;
    
    static {
        ahcz.registerDefaultInstance(apvt.class, a = new apvt());
    }
    
    private apvt() {
        this.c = 1.0f;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apvt.e) == null) {
                    synchronized (apvt.class) {
                        if (apvt.e == null) {
                            apvt.e = (ahev)new ahcs((ahcz)apvt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apvt.a;
            }
            case 4: {
                return new ahcr((ahcz)apvt.a);
            }
            case 3: {
                return new apvt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvt.a, "\u0001\u0002\u0000\u0001\u0003\b\u0002\u0000\u0000\u0000\u0003\u1001\u0001\b\u1009\u0002", new Object[] { "b", "c", "d" });
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
