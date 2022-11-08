import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lov extends agzi implements ahax
{
    private static volatile ahbe C;
    public static final lov a;
    public int A;
    public boolean B;
    public int b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public int o;
    public int p;
    public long q;
    public long r;
    public boolean s;
    public int t;
    public int u;
    public float v;
    public long w;
    public boolean x;
    public lpd y;
    public long z;
    
    static {
        agzi.registerDefaultInstance(lov.class, a = new lov());
    }
    
    private lov() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = lov.C) == null) {
                    synchronized (lov.class) {
                        if (lov.C == null) {
                            lov.C = (ahbe)new agzb((agzi)lov.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return lov.a;
            }
            case 4: {
                return new agza((agzi)lov.a);
            }
            case 3: {
                return new lov();
            }
            case 2: {
                final agzo a2 = ajbv.a();
                final agzo h = ahse.h;
                return agzi.newMessageInfo((MessageLite)lov.a, "\u0001\u0019\u0000\u0002\r/\u0019\u0000\u0000\u0000\r\u1002\u0000\u000e\u100f\u0001\u0010\u1004\u0002\u0011\u100c\u0003\u0012\u1004\u0004\u0013\u1004\u0005\u0014\u1002\u0006\u0016\u1007\b\u0017\u1002\t\u0018\u100c\n\u0019\u100c\u000b\u001a\u100c\f\u001b\u100c\r\u001c\u1002\u000e\u001d\u1002\u000f\u001e\u1007\u0010 \u100c\u0011\"\u1004\u0013#\u1001\u0014$\u1002\u0015%\u1007\u0016&\u1009\u0017'\u1002\u0018+\u1004\u001c/\u1007 ", new Object[] { "b", "c", "d", "e", "f", "g", a2, "h", "i", "j", "k", "l", "m", h, "n", h, "o", aply.a(), "p", anae.a(), "q", "r", "s", "t", amom.a, "u", "v", "w", "x", "y", "z", "A", "B" });
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
