import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apgm extends ahcz implements aheo
{
    public static final apgm a;
    private static volatile ahev k;
    public ajws b;
    public ahdp c;
    public ahdp d;
    public int e;
    public aiet f;
    public aiet g;
    public ahbt h;
    public ahdp i;
    public ahdp j;
    private int l;
    private ahjl m;
    private ajws n;
    private ajws o;
    private aisc p;
    private byte q;
    
    static {
        ahcz.registerDefaultInstance(apgm.class, a = new apgm());
    }
    
    private apgm() {
        this.q = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        this.h = ahbt.b;
        this.i = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = apgm.k) == null) {
                    synchronized (apgm.class) {
                        if (apgm.k == null) {
                            apgm.k = (ahev)new ahcs((ahcz)apgm.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apgm.a;
            }
            case 4: {
                return new ahcr((ahcz)apgm.a);
            }
            case 3: {
                return new apgm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apgm.a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u000b\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0006\u0005\u1409\b\u0006\u041b\u0007\u1409\u0002\b\u1409\u0003\t\u1409\u0004\n\u100a\u0005\u000b\u1004\u0001\f\u041b\r\u041b\u000e\u1409\t", new Object[] { "l", "b", "c", ajws.class, "n", "o", "d", apgl.class, "f", "g", "m", "h", "e", "i", aisc.class, "j", aisc.class, "p" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
