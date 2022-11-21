import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arce extends ahcz implements aheo
{
    private static final arce a;
    private static volatile ahev b;
    private int c;
    private arbo d;
    
    static {
        ahcz.registerDefaultInstance(arce.class, a = new arce());
    }
    
    private arce() {
    }
    
    public static arce b() {
        return arce.a;
    }
    
    public static arce c() {
        return arce.a;
    }
    
    public arbo a() {
        arbo arbo;
        if ((arbo = this.d) == null) {
            arbo = arbo.a;
        }
        return arbo;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev b;
                if ((b = arce.b) == null) {
                    synchronized (arce.class) {
                        if (arce.b == null) {
                            arce.b = (ahev)new ahcs((ahcz)arce.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return arce.a;
            }
            case 4: {
                return new ahcr((ahcz)b());
            }
            case 3: {
                return new arce();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arce.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "c", "d" });
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
