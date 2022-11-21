import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arcb extends ahcz implements aheo
{
    public static final arcb a;
    private static volatile ahev g;
    public int b;
    public aras c;
    public String d;
    public String e;
    public arca f;
    
    static {
        ahcz.registerDefaultInstance(arcb.class, a = new arcb());
    }
    
    private arcb() {
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
                if ((g = arcb.g) == null) {
                    synchronized (arcb.class) {
                        if (arcb.g == null) {
                            arcb.g = (ahev)new ahcs((ahcz)arcb.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arcb.a;
            }
            case 4: {
                return new ahcr((ahcz)arcb.a);
            }
            case 3: {
                return new arcb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arcb.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
