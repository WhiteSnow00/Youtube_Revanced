import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akzf extends ahcz implements aheo
{
    public static final akzf a;
    private static volatile ahev u;
    public int b;
    public aknh c;
    public String d;
    public boolean e;
    public boolean f;
    public aney g;
    public boolean h;
    public String i;
    public int j;
    public String k;
    public ahdh l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public akzg q;
    public akzk r;
    public akzh s;
    public ahbt t;
    private byte v;
    
    static {
        ahcz.registerDefaultInstance(akzf.class, a = new akzf());
    }
    
    private akzf() {
        this.v = 2;
        this.d = "";
        this.i = "";
        this.k = "";
        final ahbt b = ahbt.b;
        this.l = ahcz.emptyIntList();
        this.m = "";
        this.n = "";
        this.o = "";
        this.t = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev u;
                if ((u = akzf.u) == null) {
                    synchronized (akzf.class) {
                        if (akzf.u == null) {
                            akzf.u = (ahev)new ahcs((ahcz)akzf.a);
                        }
                    }
                }
                return u;
            }
            case 5: {
                return akzf.a;
            }
            case 4: {
                return new ahcr((int[])null, (byte[][])null);
            }
            case 3: {
                return new akzf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akzf.a, "\u0001\u0012\u0000\u0001\u0001\u001d\u0012\u0000\u0001\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0004\u1409\u0004\u0005\u1007\u0003\b\u1007\u0005\t\u1008\b\n\u1004\t\f\u1008\u000b\u000f\u0016\u0013\u1008\u0010\u0016\u1008\u0013\u0017\u1008\u0014\u0019\u1007\u0015\u001a\u1009\u0016\u001b\u1009\u0017\u001c\u1009\u0018\u001d\u100a\u0019", new Object[] { "b", "c", "d", "e", "g", "f", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
