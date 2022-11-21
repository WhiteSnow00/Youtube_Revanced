import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqcb extends ahcz implements aheo
{
    public static final aqcb a;
    public static final ahcx b;
    private static volatile ahev t;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public int i;
    public aowb j;
    public aqgs k;
    public ajws l;
    public long m;
    public long n;
    public long o;
    public String p;
    public aqbx q;
    public ahdp r;
    public String s;
    private byte u;
    
    static {
        final aqcb a2 = new aqcb();
        ahcz.registerDefaultInstance(aqcb.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 151, ahgc.k, aqcb.class);
    }
    
    private aqcb() {
        this.u = 2;
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.p = "";
        this.r = ahcz.emptyProtobufList();
        this.s = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev t;
                if ((t = aqcb.t) == null) {
                    synchronized (aqcb.class) {
                        if (aqcb.t == null) {
                            aqcb.t = (ahev)new ahcs((ahcz)aqcb.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return aqcb.a;
            }
            case 4: {
                return new ahcr((ahcz)aqcb.a);
            }
            case 3: {
                return new aqcb();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqcb.a, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0001\u0003\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1003\u0005\u0007\u1004\u0006\b\u1409\u0007\t\u1409\b\n\u1003\n\u000b\u1003\u000b\f\u1003\f\r\u1008\r\u000e\u1008\u000f\u000f\u1009\u000e\u0010\u1409\t\u0011\u001a", new Object[] { "c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "s", "q", "l", "r" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
