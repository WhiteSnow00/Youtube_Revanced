import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apwt extends ahcz implements aheo
{
    public static final apwt a;
    private static volatile ahev g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(apwt.class, a = new apwt());
    }
    
    private apwt() {
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
                final ahev g;
                if ((g = apwt.g) == null) {
                    synchronized (apwt.class) {
                        if (apwt.g == null) {
                            apwt.g = (ahev)new ahcs((ahcz)apwt.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apwt.a;
            }
            case 4: {
                return new ahcr((ahcz)apwt.a);
            }
            case 3: {
                return new apwt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apwt.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "b", "c", "d", apvm.f, "e", "f" });
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
