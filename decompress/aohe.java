import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aohe extends ahcz implements aheo
{
    public static final aohe a;
    private static volatile ahev u;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    private int v;
    private int w;
    private int x;
    
    static {
        ahcz.registerDefaultInstance(aohe.class, a = new aohe());
    }
    
    private aohe() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev u;
                if ((u = aohe.u) == null) {
                    synchronized (aohe.class) {
                        if (aohe.u == null) {
                            aohe.u = (ahev)new ahcs((ahcz)aohe.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return aohe.a;
            }
            case 4: {
                return new ahcr((ahcz)aohe.a);
            }
            case 3: {
                return new aohe();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aohe.a, "\u0001\u0013\u0000\u0003\bQ\u0013\u0000\u0000\u0000\b\u1007\u0007\u000b\u1007\n\u0010\u1007\u000f\u0011\u1007\u0010\u0012\u1004\u0011\u0013\u1004\u0012\u001b\u1007\u001a\u001e\u1007\u001d'\u1007()\u1007*.\u10042/\u100738\u100799\u10070>\u1007>C\u1007CM\u1007LP\u1007OQ\u1007P", new Object[] { "v", "w", "x", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l", "p", "q", "r", "s", "t" });
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
