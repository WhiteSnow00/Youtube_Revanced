import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ansg extends ahcz implements aheo
{
    public static final ansg a;
    private static volatile ahev v;
    public int b;
    public aowb c;
    public anxb d;
    public akfj e;
    public ajws f;
    public ajws g;
    public ajws h;
    public ajws i;
    public ajws j;
    public anxb k;
    public aisc l;
    public ahdp m;
    public anxb n;
    public long o;
    public aidv p;
    public ahdp q;
    public boolean r;
    public anrh s;
    public anrr t;
    public boolean u;
    private byte w;
    
    static {
        ahcz.registerDefaultInstance(ansg.class, a = new ansg());
    }
    
    private ansg() {
        this.w = 2;
        this.m = ahcz.emptyProtobufList();
        this.q = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev v;
                if ((v = ansg.v) == null) {
                    synchronized (ansg.class) {
                        if (ansg.v == null) {
                            ansg.v = (ahev)new ahcs((ahcz)ansg.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return ansg.a;
            }
            case 4: {
                return new ahcr((ahcz)ansg.a);
            }
            case 3: {
                return new ansg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ansg.a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0002\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\b\t\u1409\t\n\u041b\u000b\u1409\n\f\u1002\u000b\r\u1009\f\u000e\u041b\u000f\u1007\r\u0011\u1009\u000f\u0012\u1009\u0010\u0014\u1409\u0006\u0015\u1007\u0012", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", aisc.class, "n", "o", "p", "q", aisc.class, "r", "s", "t", "i", "u" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
