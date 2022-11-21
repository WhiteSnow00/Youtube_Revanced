import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amho extends ahcz implements aheo
{
    public static final amho a;
    private static volatile ahev j;
    public int b;
    public amgo c;
    public String d;
    public int e;
    public String f;
    public int g;
    public String h;
    public boolean i;
    
    static {
        ahcz.registerDefaultInstance(amho.class, a = new amho());
    }
    
    private amho() {
        this.d = "";
        this.f = "";
        this.h = "";
        ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = amho.j) == null) {
                    synchronized (amho.class) {
                        if (amho.j == null) {
                            amho.j = (ahev)new ahcs((ahcz)amho.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amho.a;
            }
            case 4: {
                return new ahcr((ahcz)amho.a);
            }
            case 3: {
                return new amho();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amho.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1007\u0006", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
