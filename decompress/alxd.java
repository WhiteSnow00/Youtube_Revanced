import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alxd extends ahcz implements aheo
{
    public static final alxd a;
    private static volatile ahev g;
    public int b;
    public String c;
    public String d;
    public String e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(alxd.class, a = new alxd());
    }
    
    private alxd() {
        this.c = "";
        this.d = "";
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
                if ((g = alxd.g) == null) {
                    synchronized (alxd.class) {
                        if (alxd.g == null) {
                            alxd.g = (ahev)new ahcs((ahcz)alxd.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return alxd.a;
            }
            case 4: {
                return new ahcr((ahcz)alxd.a);
            }
            case 3: {
                return new alxd();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alxd.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
