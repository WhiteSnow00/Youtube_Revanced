import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajix extends ahcz implements aheo
{
    public static final ajix a;
    public static final ahcx b;
    private static volatile ahev w;
    public int c;
    public int d;
    public Object e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;
    public String k;
    public int l;
    public boolean m;
    public String n;
    public String o;
    public int p;
    public String q;
    public int r;
    public String s;
    public String t;
    public ahdp u;
    public aowb v;
    private byte x;
    
    static {
        final ajix a2 = new ajix();
        ahcz.registerDefaultInstance(ajix.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 284, ahgc.k, ajix.class);
    }
    
    private ajix() {
        this.d = 0;
        this.x = 2;
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.k = "";
        this.n = "";
        this.o = "";
        this.q = "";
        this.s = "";
        this.t = "";
        this.u = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte x = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev w;
                if ((w = ajix.w) == null) {
                    synchronized (ajix.class) {
                        if (ajix.w == null) {
                            ajix.w = (ahev)new ahcs((ahcz)ajix.a);
                        }
                    }
                }
                return w;
            }
            case 5: {
                return ajix.a;
            }
            case 4: {
                return new ahcr((short[])null, (byte[])null);
            }
            case 3: {
                return new ajix();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajix.a, "\u0001\u0013\u0001\u0001\u0001\u0014\u0013\u0000\u0001\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0005\u0007\u1004\u0006\b\u143c\u0000\t\u1004\u000e\n\u1008\u000f\u000b\u1008\u0010\f\u001b\r\u1409\u0011\u000e\u1007\u0007\u000f\u1008\b\u0010\u1008\t\u0011\u1004\n\u0013\u143c\u0000\u0014\u1008\r", new Object[] { "e", "d", "c", "f", "g", "h", "i", "j", "k", "l", aowb.class, "r", "s", "t", "u", aibu.class, "v", "m", "n", "o", "p", ajiw.class, "q" });
            }
            case 1: {
                if (o == null) {
                    x = 0;
                }
                this.x = x;
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
