import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqn extends agzi implements ahax
{
    public static final aoqn a;
    private static volatile ahbe v;
    public int b;
    public int c;
    public float d;
    public int e;
    public boolean f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public agzq p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public String u;
    
    static {
        agzi.registerDefaultInstance(aoqn.class, a = new aoqn());
    }
    
    private aoqn() {
        this.g = "";
        this.p = agzi.emptyIntList();
        this.u = "";
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
                if ((v = aoqn.v) == null) {
                    synchronized (aoqn.class) {
                        if (aoqn.v == null) {
                            aoqn.v = (ahbe)new agzb((agzi)aoqn.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return aoqn.a;
            }
            case 4: {
                return new agza((short[][][])null, (float[])null);
            }
            case 3: {
                return new aoqn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqn.a, "\u0001\u0013\u0000\u0001\u0002$\u0013\u0000\u0001\u0000\u0002\u1004\u0001\u0007\u1001\u0006\t\u1004\b\n\u1007\t\r\u1008\n\u000e\u1004\u000b\u000f\u1004\f\u0010\u1004\r\u0011\u1004\u000e\u0012\u1004\u000f\u0013\u1004\u0010\u0014\u100c\u0011\u0015\u100c\u0012\u0017\u001e\u0018\u1004\u0013\u0019\u1004\u0014\u001c\u1007\u0017#\u100c\u001d$\u1008\u001e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", anqs.o, "o", ajch.a(), "p", aonj.o, "q", "r", "s", "t", amoo.a(), "u" });
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
