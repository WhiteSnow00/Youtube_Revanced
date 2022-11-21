import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adok extends ahcz implements aheo
{
    public static final adok a;
    private static volatile ahev g;
    public int b;
    public int c;
    public int d;
    public String e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(adok.class, a = new adok());
    }
    
    private adok() {
        this.e = "";
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
                if ((g = adok.g) == null) {
                    synchronized (adok.class) {
                        if (adok.g == null) {
                            adok.g = (ahev)new ahcs((ahcz)adok.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return adok.a;
            }
            case 4: {
                return new ahcr((ahcz)adok.a);
            }
            case 3: {
                return new adok();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)adok.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002\u0004\u1007\u0003", new Object[] { "b", "c", aoxk.p, "d", apkc.k, "e", "f" });
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
