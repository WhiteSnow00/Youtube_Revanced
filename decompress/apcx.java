import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apcx extends ahcz implements aheo
{
    public static final apcx a;
    private static volatile ahev k;
    public int b;
    public ajws c;
    public ahdp d;
    public aiet e;
    public ahdp f;
    public anxb g;
    public ahbt h;
    public apcw i;
    public aisc j;
    private ahjl l;
    private aiet m;
    private anxb n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(apcx.class, a = new apcx());
    }
    
    private apcx() {
        this.o = 2;
        this.d = ahcz.emptyProtobufList();
        this.f = ahcz.emptyProtobufList();
        this.h = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = apcx.k) == null) {
                    synchronized (apcx.class) {
                        if (apcx.k == null) {
                            apcx.k = (ahev)new ahcs((ahcz)apcx.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apcx.a;
            }
            case 4: {
                return new ahcr((ahcz)apcx.a);
            }
            case 3: {
                return new apcx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apcx.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\n\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001\u0004\u041b\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1409\u0005\b\u1409\u0007\t\u1409\u0002\n\u1409\b\u000b\u1409\u0006", new Object[] { "b", "c", "d", apcz.class, "e", "f", ajws.class, "l", "h", "i", "m", "g", "n", "j" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
