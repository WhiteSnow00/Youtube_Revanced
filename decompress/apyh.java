import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apyh extends ahcz implements aheo
{
    public static final apyh a;
    private static volatile ahev q;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public boolean i;
    public ajws j;
    public aiet k;
    public ajws l;
    public ajws m;
    public aisc n;
    public ahdp o;
    public aisc p;
    private aiet r;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(apyh.class, a = new apyh());
    }
    
    private apyh() {
        this.s = 2;
        this.f = 10000;
        emptyProtobufList();
        this.o = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev q;
                if ((q = apyh.q) == null) {
                    synchronized (apyh.class) {
                        if (apyh.q == null) {
                            apyh.q = (ahev)new ahcs((ahcz)apyh.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return apyh.a;
            }
            case 4: {
                return new ahcr((ahcz)apyh.a);
            }
            case 3: {
                return new apyh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apyh.a, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0001\b\u0001\u1002\u0000\u0003\u1409\n\u0004\u1409\u000b\u0005\u100b\u0003\u0006\u1409\f\u0007\u1409\u000e\n\u1409\r\u000b\u1004\u0001\r\u041b\u000e\u100c\u0004\u000f\u1002\u0005\u0011\u1409\u0010\u0012\u1007\u0007\u0013\u100b\u0002\u0014\u1409\u000f", new Object[] { "b", "c", "j", "k", "f", "l", "m", "r", "d", "o", aisc.class, "g", apyg.a(), "h", "p", "i", "e", "n" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
