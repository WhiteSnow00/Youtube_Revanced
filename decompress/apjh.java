import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjh extends ahcz implements aheo
{
    public static final apjh a;
    private static volatile ahev g;
    public int b;
    public String c;
    public int d;
    public int e;
    public String f;
    
    static {
        ahcz.registerDefaultInstance(apjh.class, a = new apjh());
    }
    
    private apjh() {
        this.c = "";
        this.f = "";
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
                if ((g = apjh.g) == null) {
                    synchronized (apjh.class) {
                        if (apjh.g == null) {
                            apjh.g = (ahev)new ahcs((ahcz)apjh.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apjh.a;
            }
            case 4: {
                return new ahcr((ahcz)apjh.a);
            }
            case 3: {
                return new apjh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apjh.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1004\u0002\u0004\u1008\u0003", new Object[] { "b", "c", "d", apji.a(), "e", "f" });
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
