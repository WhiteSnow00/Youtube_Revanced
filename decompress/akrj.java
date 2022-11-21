import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akrj extends ahcz implements aheo
{
    public static final akrj a;
    private static volatile ahev i;
    public String b;
    public boolean c;
    public int d;
    public long e;
    public ahdp f;
    public akrs g;
    public akrl h;
    private int j;
    private akrt k;
    private akrr l;
    private akrp m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(akrj.class, a = new akrj());
    }
    
    private akrj() {
        this.n = 2;
        this.b = "";
        this.f = ahcz.emptyProtobufList();
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = akrj.i) == null) {
                    synchronized (akrj.class) {
                        if (akrj.i == null) {
                            akrj.i = (ahev)new ahcs((ahcz)akrj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return akrj.a;
            }
            case 4: {
                return new ahcr((ahcz)akrj.a);
            }
            case 3: {
                return new akrj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akrj.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0006\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0007\u041b\b\u1409\u0007\t\u1409\b\n\u1409\f\u000e\u1409\t\u0011\u1409\u000b", new Object[] { "j", "b", "c", "d", aklp.n, "e", "f", akrq.class, "g", "k", "h", "l", "m" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
