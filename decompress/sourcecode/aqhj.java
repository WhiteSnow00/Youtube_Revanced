import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhj extends agzi implements ahax
{
    public static final aqhj a;
    public static final agzg b;
    private static volatile ahbe d;
    public aqhh c;
    private int e;
    private aqbw f;
    private aqgb g;
    private aqig h;
    private anlp i;
    private ahfw j;
    private alvp k;
    private byte l;
    
    static {
        final aqhj a2 = new aqhj();
        agzi.registerDefaultInstance((Class)aqhj.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, (Object)a2, (MessageLite)a2, (agzn)null, 400157044, ahcm.k, (Class)aqhj.class);
    }
    
    private aqhj() {
        this.l = 2;
        final agyc b = agyc.b;
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
                if ((d = aqhj.d) == null) {
                    synchronized (aqhj.class) {
                        if (aqhj.d == null) {
                            aqhj.d = (ahbe)new agzb((agzi)aqhj.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqhj.a;
            }
            case 4: {
                return new agza((agzi)aqhj.a);
            }
            case 3: {
                return new aqhj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqhj.a, "\u0001\u0007\u0000\u0001\u0006\u0017\u0007\u0000\u0000\u0005\u0006\u1409\u0006\b\u1409\t\n\u1409\u0015\u000b\u1409\b\f\u1409\n\u0016\u1009\u001c\u0017\u1009\u0001", new Object[] { "e", "c", "h", "j", "g", "i", "k", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
