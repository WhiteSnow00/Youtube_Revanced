import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apuy extends ahcz implements aheo
{
    public static final apuy a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    
    static {
        ahcz.registerDefaultInstance(apuy.class, a = new apuy());
    }
    
    private apuy() {
        this.c = ahbt.b;
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
                if ((d = apuy.d) == null) {
                    synchronized (apuy.class) {
                        if (apuy.d == null) {
                            apuy.d = (ahev)new ahcs((ahcz)apuy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apuy.a;
            }
            case 4: {
                return new ahcr((ahcz)apuy.a);
            }
            case 3: {
                return new apuy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apuy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100a\u0000", new Object[] { "b", "c" });
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
