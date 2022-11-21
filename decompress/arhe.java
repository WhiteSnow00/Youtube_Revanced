import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arhe extends ahcz implements aheo
{
    public static final arhe a;
    private static volatile ahev g;
    public int b;
    public int c;
    public String d;
    public boolean e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(arhe.class, a = new arhe());
    }
    
    private arhe() {
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
                if ((g = arhe.g) == null) {
                    synchronized (arhe.class) {
                        if (arhe.g == null) {
                            arhe.g = (ahev)new ahcs((ahcz)arhe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return arhe.a;
            }
            case 4: {
                return new ahcr((ahcz)arhe.a);
            }
            case 3: {
                return new arhe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)arhe.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1004\u0003", new Object[] { "b", "c", arhd.a(), "d", "e", "f" });
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
