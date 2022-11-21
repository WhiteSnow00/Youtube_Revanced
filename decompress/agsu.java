import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsu extends ahcz implements aheo
{
    public static final agsu a;
    private static volatile ahev j;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    private int k;
    
    static {
        ahcz.registerDefaultInstance(agsu.class, a = new agsu());
    }
    
    private agsu() {
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
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
                if ((j = agsu.j) == null) {
                    synchronized (agsu.class) {
                        if (agsu.j == null) {
                            agsu.j = (ahev)new ahcs((ahcz)agsu.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agsu.a;
            }
            case 4: {
                return new ahcr((ahcz)agsu.a);
            }
            case 3: {
                return new agsu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agsu.a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005\u0007\u1008\u0006\b\u1004\u0007", new Object[] { "k", "b", "c", "d", "e", "f", "g", "h", "i" });
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
