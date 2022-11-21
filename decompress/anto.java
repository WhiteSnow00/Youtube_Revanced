import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anto extends ahcz implements aheo
{
    public static final anto a;
    private static volatile ahev p;
    public int b;
    public ajws c;
    public aowb d;
    public ahdp e;
    public ahdp f;
    public aisc g;
    public ajws h;
    public ajws i;
    public ajws j;
    public amiy k;
    public ajws l;
    public int m;
    public ahbt n;
    public ails o;
    private ajws q;
    private ahmf r;
    private ahmf s;
    private ahjl t;
    private ajws u;
    private byte v;
    
    static {
        ahcz.registerDefaultInstance(anto.class, a = new anto());
    }
    
    private anto() {
        this.v = 2;
        this.e = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        this.n = ahbt.b;
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
                final ahev p3;
                if ((p3 = anto.p) == null) {
                    synchronized (anto.class) {
                        if (anto.p == null) {
                            anto.p = (ahev)new ahcs((ahcz)anto.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return anto.a;
            }
            case 4: {
                return new ahcr((ahcz)anto.a);
            }
            case 3: {
                return new anto();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)anto.a, "\u0001\u0012\u0000\u0001\u0002\u0018\u0012\u0000\u0002\u0010\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\b\u1409\u0010\t\u100a\u0011\r\u1409\u0013\u000e\u1409\u0006\u000f\u1409\b\u0011\u041b\u0012\u1409\t\u0013\u100c\n\u0014\u041b\u0015\u1409\u0014\u0016\u1409\u0007\u0017\u1409\u000b\u0018\u1409\f", new Object[] { "b", "c", "d", "q", "g", "h", "t", "n", "u", "i", "k", "f", aovp.class, "l", "m", ansp.i, "e", aowb.class, "o", "j", "r", "s" });
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
