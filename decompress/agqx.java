import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqx extends ahcz implements aheo
{
    public static final agqx a;
    private static volatile ahev g;
    public int b;
    public Object c;
    public String d;
    public String e;
    public String f;
    private int h;
    
    static {
        ahcz.registerDefaultInstance(agqx.class, a = new agqx());
    }
    
    private agqx() {
        this.b = 0;
        this.d = "";
        this.e = "";
        this.f = "";
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
                final ahev g;
                if ((g = agqx.g) == null) {
                    synchronized (agqx.class) {
                        if (agqx.g == null) {
                            agqx.g = (ahev)new ahcs((ahcz)agqx.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agqx.a;
            }
            case 4: {
                return new ahcr((ahcz)agqx.a);
            }
            case 3: {
                return new agqx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agqx.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u1008\u0004\u0006\u103c\u0000", new Object[] { "c", "b", "h", "d", "e", "f", agqw.class });
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
