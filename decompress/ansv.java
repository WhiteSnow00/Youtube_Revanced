import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansv extends ahcz implements aheo
{
    public static final ansv a;
    private static volatile ahev s;
    public int b;
    public aowb c;
    public ajws d;
    public ajws e;
    public ajws f;
    public aowb g;
    public ajws h;
    public aisc i;
    public anst j;
    public aisc k;
    public ahdp l;
    public ahdp m;
    public amiy n;
    public ahbt o;
    public ahof p;
    public int q;
    public String r;
    private ajws t;
    private ajws u;
    private ansu v;
    private ahjl w;
    private aibx x;
    private byte y;
    
    static {
        ahcz.registerDefaultInstance(ansv.class, a = new ansv());
    }
    
    private ansv() {
        this.y = 2;
        this.l = ahcz.emptyProtobufList();
        this.m = ahcz.emptyProtobufList();
        emptyProtobufList();
        this.o = ahbt.b;
        emptyProtobufList();
        this.r = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev s;
                if ((s = ansv.s) == null) {
                    synchronized (ansv.class) {
                        if (ansv.s == null) {
                            ansv.s = (ahev)new ahcs((ahcz)ansv.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return ansv.a;
            }
            case 4: {
                return new ahcr((ahcz)ansv.a);
            }
            case 3: {
                return new ansv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansv.a, "\u0001\u0015\u0000\u0001\u0002\u001f\u0015\u0000\u0002\u0010\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\t\u1409\t\n\u1409\n\u000b\u001a\f\u001a\r\u1409\r\u000f\u1409\u0010\u0010\u100a\u0011\u0012\u1409\u000b\u0013\u1409\f\u0014\u1409\b\u0019\u1409\u0013\u001b\u100c\u0015\u001d\u1008\u0017\u001f\u1409\u0019", new Object[] { "b", "c", "d", "e", "f", "t", "g", "h", "i", "j", "l", "m", "v", "w", "o", "k", "n", "u", "p", "q", ahld.e, "r", "x" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
