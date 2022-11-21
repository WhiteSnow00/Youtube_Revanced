import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apvx extends ahcz implements aheo
{
    public static final apvx a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(apvx.class, a = new apvx());
    }
    
    private apvx() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = apvx.d) == null) {
                    synchronized (apvx.class) {
                        if (apvx.d == null) {
                            apvx.d = (ahev)new ahcs((ahcz)apvx.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apvx.a;
            }
            case 4: {
                return new ahcr((ahcz)apvx.a);
            }
            case 3: {
                return new apvx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apvx.a, "\u0001\u0006\u0001\u0000\u0001\u0010\u0006\u0000\u0000\u0000\u0001\u103c\u0000\u0002\u103c\u0000\t\u103c\u0000\f\u103c\u0000\r\u103c\u0000\u0010\u103c\u0000", new Object[] { "c", "b", apwh.class, apwi.class, apwc.class, apvz.class, apvy.class, apwa.class });
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
