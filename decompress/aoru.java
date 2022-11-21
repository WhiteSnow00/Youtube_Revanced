import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoru extends ahcz implements aheo
{
    public static final aoru a;
    private static volatile ahev p;
    public int b;
    public aorw c;
    public ahdp d;
    public ahdp e;
    public ajws f;
    public aisc g;
    public aiet h;
    public aiet i;
    public ahdp j;
    public ahbt k;
    public ahdp l;
    public int m;
    public aorx n;
    public int o;
    private ajws q;
    private aisc r;
    private ahjl s;
    private byte t;
    
    static {
        ahcz.registerDefaultInstance(aoru.class, a = new aoru());
    }
    
    private aoru() {
        this.t = 2;
        this.d = ahcz.emptyProtobufList();
        this.e = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
        this.k = ahbt.b;
        this.l = ahcz.emptyProtobufList();
        emptyProtobufList();
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
                final ahev p3;
                if ((p3 = aoru.p) == null) {
                    synchronized (aoru.class) {
                        if (aoru.p == null) {
                            aoru.p = (ahev)new ahcs((ahcz)aoru.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return aoru.a;
            }
            case 4: {
                return new ahcr((ahcz)aoru.a);
            }
            case 3: {
                return new aoru();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoru.a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0004\n\u0001\u1409\u0001\u0002\u041b\u0003\u1409\t\u0004\u100a\n\u0005\u1409\u0002\u0006\u1409\u0003\t\u100c\r\n\u041b\u000b\u1009\u0000\r\u1409\u0006\u000f\u1409\u0004\u0010\u1409\u0005\u0011\u1009\u000e\u0012\u1004\u000f\u0013\u041b\u0014\u001b", new Object[] { "b", "f", "j", aorv.class, "s", "k", "q", "g", "m", aort.a, "d", aorr.class, "c", "r", "h", "i", "n", "o", "e", aisc.class, "l", aorc.class });
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
