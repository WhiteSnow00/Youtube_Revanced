import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aitc extends ahcz implements aheo
{
    public static final aitc a;
    private static volatile ahev s;
    public int b;
    public String c;
    public String d;
    public String e;
    public ahdp f;
    public ahdp g;
    public String h;
    public boolean i;
    public boolean j;
    public aisc k;
    public float l;
    public float m;
    public boolean n;
    public float o;
    public String p;
    public boolean q;
    public ajws r;
    private byte t;
    
    static {
        ahcz.registerDefaultInstance(aitc.class, a = new aitc());
    }
    
    private aitc() {
        this.t = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = ahcz.emptyProtobufList();
        this.g = ahcz.emptyProtobufList();
        this.h = "";
        this.p = "";
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
                if ((s = aitc.s) == null) {
                    synchronized (aitc.class) {
                        if (aitc.s == null) {
                            aitc.s = (ahev)new ahcs((ahcz)aitc.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aitc.a;
            }
            case 4: {
                return new ahcr((ahcz)aitc.a);
            }
            case 3: {
                return new aitc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aitc.a, "\u0001\u0010\u0000\u0001\u0001\u001f\u0010\u0000\u0002\u0003\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u001b\b\u1007\u0005\u0012\u041b\u0013\u1409\u0006\u0015\u1001\u0007\u0016\u1001\b\u0017\u1007\t\u0019\u1007\u0004\u001a\u1001\n\u001b\u1008\u000b\u001c\u1008\u0003\u001e\u1007\f\u001f\u1409\r", new Object[] { "b", "c", "d", "e", "f", aqqm.class, "j", "g", ajqp.class, "k", "l", "m", "n", "i", "o", "p", "h", "q", "r" });
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
