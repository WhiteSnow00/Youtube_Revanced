import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajle extends ahcz implements aheo
{
    public static final ajle a;
    public static final ahcx b;
    private static volatile ahev s;
    public int c;
    public String d;
    public aowb e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public ahdp r;
    private byte t;
    
    static {
        final ajle a2 = new ajle();
        ahcz.registerDefaultInstance(ajle.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 173, ahgc.k, ajle.class);
    }
    
    private ajle() {
        this.t = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.i = "";
        this.j = "";
        this.l = "";
        this.p = "";
        this.q = "";
        this.r = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev s;
                if ((s = ajle.s) == null) {
                    synchronized (ajle.class) {
                        if (ajle.s == null) {
                            ajle.s = (ahev)new ahcs((ahcz)ajle.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return ajle.a;
            }
            case 4: {
                return new ahcr((int[][])null, (boolean[])null);
            }
            case 3: {
                return new ajle();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajle.a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0006\u0007\u1004\u0007\b\u1008\b\t\u1007\t\n\u1007\n\u000b\u1004\u000b\r\u1008\f\u000e\u1008\u0005\u000f\u1008\r\u0011\u001b", new Object[] { "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "i", "q", "r", aibu.class });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
