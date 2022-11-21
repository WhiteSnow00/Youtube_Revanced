import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arau extends ahcz implements aheo
{
    public static final arau a;
    private static volatile ahev g;
    public int b;
    public aras c;
    public String d;
    public String e;
    public arat f;
    
    static {
        ahcz.registerDefaultInstance(arau.class, a = new arau());
    }
    
    private arau() {
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
                if ((g = arau.g) == null) {
                    synchronized (arau.class) {
                        if (arau.g == null) {
                            arau.g = (ahev)new ahcs((ahcz)arau.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arau.a;
            }
            case 4: {
                return new ahcr((ahcz)arau.a);
            }
            case 3: {
                return new arau();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arau.a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0003\u1008\u0001\u0004\u1008\u0002\u0005\u1009\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
