import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtp extends ahcz implements aheo
{
    public static final agtp a;
    private static volatile ahev e;
    public String b;
    public String c;
    public String d;
    private int f;
    
    static {
        ahcz.registerDefaultInstance(agtp.class, a = new agtp());
    }
    
    private agtp() {
        this.b = "";
        this.c = "";
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
                final ahev e;
                if ((e = agtp.e) == null) {
                    synchronized (agtp.class) {
                        if (agtp.e == null) {
                            agtp.e = (ahev)new ahcs((ahcz)agtp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agtp.a;
            }
            case 4: {
                return new ahcr((ahcz)agtp.a);
            }
            case 3: {
                return new agtp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "f", "b", "c", "d" });
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
