import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxp extends ahcz implements aheo
{
    public static final apxp a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public int e;
    public ahbt f;
    
    static {
        ahcz.registerDefaultInstance(apxp.class, a = new apxp());
    }
    
    private apxp() {
        this.c = "";
        this.d = "";
        this.f = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = apxp.g) == null) {
                    synchronized (apxp.class) {
                        if (apxp.g == null) {
                            apxp.g = (ahev)new ahcs((ahcz)apxp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apxp.a;
            }
            case 4: {
                return new ahcr((ahcz)apxp.a);
            }
            case 3: {
                return new apxp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apxp.a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u100a\u0005", new Object[] { "b", "c", "d", "e", "f" });
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
