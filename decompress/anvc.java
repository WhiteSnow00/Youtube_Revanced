import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvc extends ahcz implements aheo
{
    private static volatile ahev N;
    public static final anvc a;
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    private int O;
    private int P;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    
    static {
        ahcz.registerDefaultInstance(anvc.class, a = new anvc());
    }
    
    private anvc() {
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
                if ((n = anvc.N) == null) {
                    synchronized (anvc.class) {
                        if (anvc.N == null) {
                            anvc.N = (ahev)new ahcs((ahcz)anvc.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return anvc.a;
            }
            case 4: {
                return new ahcr((ahcz)anvc.a);
            }
            case 3: {
                return new anvc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anvc.a, "\u0001%\u0000\u0003\u0001D%\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u100c\u0002\u0005\u1007\u0004\b\u1007\u0006\t\u1007\u0007\u000b\u1007\t\u000e\u1007\r\u0013\u1007\u0012\u0014\u1007\u0013\u0015\u1007\u0015\u0016\u1007\u0014\u0017\u1007\f\u0018\u1007\u0016\u0019\u1007\u0017\u001c\u1007\u001a\u001d\u1007\u001b \u1007 $\u1007\"%\u1007#&\u1007$'\u1007%,\u1007*-\u1007+0\u1007.1\u1004/4\u100725\u100736\u100749\u10077<\u1007:=\u1007;>\u1007<@\u1007>B\u1007@C\u1007AD\u1004B", new Object[] { "b", "O", "P", "c", "d", "e", ansp.o, "f", "g", "h", "i", "k", "l", "m", "o", "n", "j", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M" });
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
