import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjq extends ahcz implements aheo
{
    public static final apjq a;
    private static volatile ahev f;
    public int b;
    public String c;
    public int d;
    public int e;
    
    static {
        ahcz.registerDefaultInstance(apjq.class, a = new apjq());
    }
    
    private apjq() {
        this.c = "";
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
                if ((f = apjq.f) == null) {
                    synchronized (apjq.class) {
                        if (apjq.f == null) {
                            apjq.f = (ahev)new ahcs((ahcz)apjq.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apjq.a;
            }
            case 4: {
                return new ahcr((ahcz)apjq.a);
            }
            case 3: {
                return new apjq();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjq.a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u100c\u0002\u0004\u100c\u0003", new Object[] { "b", "c", "d", aoxk.s, "e", aoxk.r });
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
