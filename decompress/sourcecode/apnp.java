import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnp extends agzi implements ahax
{
    public static final apnp a;
    private static volatile ahbe o;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public boolean j;
    public String k;
    public String l;
    public boolean m;
    public boolean n;
    private int p;
    
    static {
        agzi.registerDefaultInstance((Class)apnp.class, (agzi)(a = new apnp()));
    }
    
    private apnp() {
        this.k = "";
        this.l = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = apnp.o) == null) {
                    synchronized (apnp.class) {
                        if (apnp.o == null) {
                            apnp.o = (ahbe)new agzb((agzi)apnp.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return apnp.a;
            }
            case 4: {
                return new agza((agzi)apnp.a);
            }
            case 3: {
                return new apnp();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnp.a, "\u0001\r\u0000\u0001\u0001\u0015\r\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1007\u0002\u0004\u1007\u0003\u0007\u1007\u0006\f\u1007\u000b\u000e\u1007\r\u000f\u1001\u000e\u0010\u1007\u000f\u0011\u1008\u0010\u0012\u1008\u0011\u0014\u1007\u0013\u0015\u1007\u0014", new Object[] { "p", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n" });
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
