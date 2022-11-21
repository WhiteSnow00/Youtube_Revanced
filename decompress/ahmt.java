import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmt extends ahcz implements aheo
{
    public static final ahmt a;
    private static volatile ahev p;
    public int b;
    public int c;
    public Object d;
    public ajws e;
    public aowb f;
    public akfj g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public aisc m;
    public ahdp n;
    public ahbt o;
    private ahjl q;
    private byte r;
    
    static {
        ahcz.registerDefaultInstance(ahmt.class, a = new ahmt());
    }
    
    private ahmt() {
        this.c = 0;
        this.r = 2;
        this.n = ahcz.emptyProtobufList();
        this.o = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev p3;
                if ((p3 = ahmt.p) == null) {
                    synchronized (ahmt.class) {
                        if (ahmt.p == null) {
                            ahmt.p = (ahev)new ahcs((ahcz)ahmt.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahmt.a;
            }
            case 4: {
                return new ahcr((ahcz)ahmt.a);
            }
            case 3: {
                return new ahmt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahmt.a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u103e\u0000\u0004\u100b\u0005\u0005\u1409\t\u0006\u1409\n\u0007\u100a\u000b\b\u100b\u0006\t\u100b\b\n\u041b\f\u1409\u0002\r\u100b\u0004\u000e\u100b\u0007", new Object[] { "d", "c", "b", "e", "f", "i", "m", "q", "o", "j", "l", "n", aisc.class, "g", "h", "k" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
