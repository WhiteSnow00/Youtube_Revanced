import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aopk extends ahcz implements aheo
{
    public static final aopk a;
    private static volatile ahev l;
    public int b;
    public ahdp c;
    public ahdp d;
    public ahbt e;
    public ajws f;
    public akfj g;
    public aiet h;
    public aiet i;
    public aopj j;
    public ahkc k;
    private ahjl m;
    private byte n;
    
    static {
        ahcz.registerDefaultInstance(aopk.class, a = new aopk());
    }
    
    private aopk() {
        this.n = 2;
        this.c = ahcz.emptyProtobufList();
        this.d = ahcz.emptyProtobufList();
        this.e = ahbt.b;
        emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte n = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aopk.l) == null) {
                    synchronized (aopk.class) {
                        if (aopk.l == null) {
                            aopk.l = (ahev)new ahcs((ahcz)aopk.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aopk.a;
            }
            case 4: {
                return new ahcr((ahcz)aopk.a);
            }
            case 3: {
                return new aopk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aopk.a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0002\b\u0001\u041b\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1409\u0006\t\u1009\b\f\u1409\u0007", new Object[] { "b", "c", aopl.class, "d", aopm.class, "m", "e", "f", "g", "h", "i", "k", "j" });
            }
            case 1: {
                if (o == null) {
                    n = 0;
                }
                this.n = n;
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
