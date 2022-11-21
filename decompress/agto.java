import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agto extends ahcz implements aheo
{
    public static final agto a;
    private static volatile ahev e;
    public String b;
    public String c;
    public float d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(agto.class, a = new agto());
    }
    
    private agto() {
        this.b = "";
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
                final ahev e;
                if ((e = agto.e) == null) {
                    synchronized (agto.class) {
                        if (agto.e == null) {
                            agto.e = (ahev)new ahcs((ahcz)agto.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agto.a;
            }
            case 4: {
                return new ahcr((ahcz)agto.a);
            }
            case 3: {
                return new agto();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agto.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1001\u0002", new Object[] { "f", "b", "c", "d" });
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
