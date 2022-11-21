import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arij extends ahcz implements aheo
{
    public static final arij a;
    private static volatile ahev g;
    public int b;
    public int c;
    public String d;
    public long e;
    public long f;
    
    static {
        ahcz.registerDefaultInstance(arij.class, a = new arij());
    }
    
    private arij() {
        this.d = "";
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
                if ((g = arij.g) == null) {
                    synchronized (arij.class) {
                        if (arij.g == null) {
                            arij.g = (ahev)new ahcs((ahcz)arij.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arij.a;
            }
            case 4: {
                return new ahcr((ahcz)arij.a);
            }
            case 3: {
                return new arij();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arij.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1002\u0003", new Object[] { "b", "c", "d", "e", "f" });
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
