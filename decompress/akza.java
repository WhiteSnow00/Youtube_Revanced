import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akza extends ahcz implements aheo
{
    public static final akza a;
    private static volatile ahev r;
    public int b;
    public alyj c;
    public alyj d;
    public alyj e;
    public ahdh f;
    public int g;
    public alyj h;
    public alyj i;
    public alyj j;
    public alyj k;
    public alyj l;
    public alyj m;
    public alyj n;
    public alyh o;
    public ahdp p;
    public apsp q;
    
    static {
        ahcz.registerDefaultInstance(akza.class, a = new akza());
    }
    
    private akza() {
        this.f = ahcz.emptyIntList();
        emptyProtobufList();
        this.p = ahcz.emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = akza.r) == null) {
                    synchronized (akza.class) {
                        if (akza.r == null) {
                            akza.r = (ahev)new ahcs((ahcz)akza.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return akza.a;
            }
            case 4: {
                return new ahcr((ahcz)akza.a);
            }
            case 3: {
                return new akza();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akza.a, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0002\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0004\u0005\u1009\u0005\u0006\u1009\u0006\r\u1009\u000e\u000e\u1009\t\u000f\u1009\u000f\u0010\u0016\u0011\u1004\u0003\u0012\u1009\u0007\u0013\u1009\b\u0014\u001b\u0019\u1009\u0012", new Object[] { "b", "c", "d", "e", "h", "i", "j", "n", "m", "o", "f", "g", "k", "l", "p", anhy.class, "q" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
