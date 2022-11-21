import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyj extends ahcz implements aheo
{
    public static final akyj a;
    private static volatile ahev g;
    public int b;
    public int c;
    public String d;
    public int e;
    public int f;
    
    static {
        ahcz.registerDefaultInstance(akyj.class, a = new akyj());
    }
    
    private akyj() {
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
                if ((g = akyj.g) == null) {
                    synchronized (akyj.class) {
                        if (akyj.g == null) {
                            akyj.g = (ahev)new ahcs((ahcz)akyj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akyj.a;
            }
            case 4: {
                return new ahcr((ahcz)akyj.a);
            }
            case 3: {
                return new akyj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyj.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u100b\u0003\u0004\u100b\u0002", new Object[] { "b", "c", akyi.a, "d", "f", "e" });
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
