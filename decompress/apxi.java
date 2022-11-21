import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxi extends ahcz implements aheo
{
    public static final apxi a;
    private static volatile ahev c;
    public int b;
    private Object d;
    
    static {
        ahcz.registerDefaultInstance(apxi.class, a = new apxi());
    }
    
    private apxi() {
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
                final ahev c;
                if ((c = apxi.c) == null) {
                    synchronized (apxi.class) {
                        if (apxi.c == null) {
                            apxi.c = (ahev)new ahcs((ahcz)apxi.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apxi.a;
            }
            case 4: {
                return new ahcr((ahcz)apxi.a);
            }
            case 3: {
                return new apxi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxi.a, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u103c\u0000\u0003\u103c\u0000", new Object[] { "d", "b", apxk.class, apxl.class });
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
