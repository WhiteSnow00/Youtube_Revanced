import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgq extends agzi implements ahax
{
    public static final aqgq a;
    public static final agzg b;
    private static volatile ahbe d;
    public aqgp c;
    private int e;
    private aqfp f;
    private aqfp g;
    private aioe h;
    private aioe i;
    private byte j;
    
    static {
        final aqgq a2 = new aqgq();
        agzi.registerDefaultInstance((Class)aqgq.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 412985095, ahcm.k, (Class)aqgq.class);
    }
    
    private aqgq() {
        this.j = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = aqgq.d) == null) {
                    synchronized (aqgq.class) {
                        if (aqgq.d == null) {
                            aqgq.d = (ahbe)new agzb((agzi)aqgq.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqgq.a;
            }
            case 4: {
                return new agza((agzi)aqgq.a);
            }
            case 3: {
                return new aqgq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqgq.a, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0005\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006", new Object[] { "e", "f", "g", "h", "i", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.j = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
