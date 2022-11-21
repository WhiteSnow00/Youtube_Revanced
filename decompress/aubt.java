import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aubt extends ahcz implements aheo
{
    public static final aubt a;
    private static volatile ahev l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public ahdp k;
    
    static {
        ahcz.registerDefaultInstance(aubt.class, a = new aubt());
    }
    
    private aubt() {
        this.k = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aubt.l) == null) {
                    synchronized (aubt.class) {
                        if (aubt.l == null) {
                            aubt.l = (ahev)new ahcs((ahcz)aubt.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aubt.a;
            }
            case 4: {
                return new ahcr((byte[])null, (short[][][])null);
            }
            case 3: {
                return new aubt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aubt.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u1002\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1002\u0006\b\u1002\u0007\n\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", aubs.class });
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
