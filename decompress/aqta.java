import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqta extends ahcz implements aheo
{
    public static final aqta a;
    private static volatile ahev j;
    public int b;
    public long c;
    public long d;
    public ahdh e;
    public ahdh f;
    public long g;
    public ahdp h;
    public ahdp i;
    
    static {
        ahcz.registerDefaultInstance(aqta.class, a = new aqta());
    }
    
    private aqta() {
        this.e = ahcz.emptyIntList();
        this.f = ahcz.emptyIntList();
        this.h = ahcz.emptyProtobufList();
        this.i = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqta.j) == null) {
                    synchronized (aqta.class) {
                        if (aqta.j == null) {
                            aqta.j = (ahev)new ahcs((ahcz)aqta.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqta.a;
            }
            case 4: {
                return new ahcr((int[])null, (float[][])null);
            }
            case 3: {
                return new aqta();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqta.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0004\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u0016\u0004\u0016\u0005\u1002\u0002\u0006\u001b\u0007\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", aqsy.class, "i", aqsz.class });
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
