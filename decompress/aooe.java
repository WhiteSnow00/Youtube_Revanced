import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aooe extends ahcz implements aheo
{
    public static final aooe a;
    private static volatile ahev g;
    public int b;
    public String c;
    public int d;
    public boolean e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(aooe.class, a = new aooe());
    }
    
    private aooe() {
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
                if ((g = aooe.g) == null) {
                    synchronized (aooe.class) {
                        if (aooe.g == null) {
                            aooe.g = (ahev)new ahcs((ahcz)aooe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aooe.a;
            }
            case 4: {
                return new ahcr((ahcz)aooe.a);
            }
            case 3: {
                return new aooe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aooe.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1007\u0002\u0004\u1007\u0003", new Object[] { "b", "c", "d", alww.a(), "e", "f" });
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
