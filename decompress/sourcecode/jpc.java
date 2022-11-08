import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpc extends agzi implements ahax
{
    public static final jpc a;
    private static volatile ahbe v;
    public int b;
    public int c;
    public String d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public ahca s;
    public boolean t;
    public boolean u;
    
    static {
        agzi.registerDefaultInstance(jpc.class, a = new jpc());
    }
    
    private jpc() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe v;
                if ((v = jpc.v) == null) {
                    synchronized (jpc.class) {
                        if (jpc.v == null) {
                            jpc.v = (ahbe)new agzb((agzi)jpc.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return jpc.a;
            }
            case 4: {
                return new agza((agzi)jpc.a);
            }
            case 3: {
                return new jpc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)jpc.a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1004\u0003\u0004\u1007\u0004\u0005\u1007\u0005\u0006\u1007\u0006\u0007\u1007\b\b\u1007\t\t\u1007\n\n\u1007\f\u000b\u1007\r\f\u1007\u000f\r\u1007\u0010\u000e\u1007\u0011\u0011\u100c\u000b\u0012\u1002\u0012\u0013\u1009\u0013\u0014\u1007\u0014\u0015\u1007\u0015", new Object[] { "b", "c", aply.a(), "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "q", "l", jpb.b(), "r", "s", "t", "u" });
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
