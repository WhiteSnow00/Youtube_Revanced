import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apsf extends ahcz implements aheo
{
    public static final apsf a;
    private static volatile ahev n;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public float h;
    public boolean i;
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    private int o;
    
    static {
        ahcz.registerDefaultInstance(apsf.class, a = new apsf());
    }
    
    private apsf() {
        this.j = "";
        this.k = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = apsf.n) == null) {
                    synchronized (apsf.class) {
                        if (apsf.n == null) {
                            apsf.n = (ahev)new ahcs((ahcz)apsf.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return apsf.a;
            }
            case 4: {
                return new ahcr((ahcz)apsf.a);
            }
            case 3: {
                return new apsf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apsf.a, "\u0001\f\u0000\u0001\u0001\u0015\f\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0007\u1007\u0006\f\u1007\u000b\u000e\u1007\r\u000f\u1001\u000e\u0010\u1007\u000f\u0011\u1008\u0010\u0012\u1008\u0011\u0014\u1007\u0013\u0015\u1007\u0014", new Object[] { "o", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m" });
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
