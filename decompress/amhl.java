import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhl extends ahcz implements aheo
{
    public static final amhl a;
    private static volatile ahev m;
    public int b;
    public ahdp c;
    public ahdp d;
    public int e;
    public amhh f;
    public amhh g;
    public ahdp h;
    public ahdp i;
    public ahdp j;
    public ahdp k;
    public ahdp l;
    
    static {
        ahcz.registerDefaultInstance(amhl.class, a = new amhl());
    }
    
    private amhl() {
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        this.h = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
        this.j = ahcz.emptyProtobufList();
        this.k = ahcz.emptyProtobufList();
        this.l = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = amhl.m) == null) {
                    synchronized (amhl.class) {
                        if (amhl.m == null) {
                            amhl.m = (ahev)new ahcs((ahcz)amhl.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return amhl.a;
            }
            case 4: {
                return new ahcr((ahcz)amhl.a);
            }
            case 3: {
                return new amhl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amhl.a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u100c\u0000\u0004\u1009\u0001\b\u1009\u0005\u000b\u001b\f\u001b\r\u001a\u000e\u001a\u000f\u001b", new Object[] { "b", "c", amhi.class, "d", amhi.class, "e", amgw.g, "f", "g", "h", amhk.class, "i", amhj.class, "j", "k", "l", amhg.class });
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
