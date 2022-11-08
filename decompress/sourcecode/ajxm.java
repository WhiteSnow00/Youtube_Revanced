import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxm extends agzi implements ahax
{
    public static final ajxm a;
    private static volatile ahbe h;
    public int b;
    public agzy c;
    public ajsq d;
    public int e;
    public ajxn f;
    public ajxl g;
    private anss i;
    private aioe j;
    private ajsq k;
    private ajsq l;
    private ahfw m;
    private byte n;
    
    static {
        agzi.registerDefaultInstance(ajxm.class, a = new ajxm());
    }
    
    private ajxm() {
        this.n = 2;
        this.c = agzi.emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajxm.h) == null) {
                    synchronized (ajxm.class) {
                        if (ajxm.h == null) {
                            ajxm.h = (ahbe)new agzb((agzi)ajxm.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajxm.a;
            }
            case 4: {
                return new agza((agzi)ajxm.a);
            }
            case 3: {
                return new ajxm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajxm.a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0007\u0001\u041b\u0003\u1409\u0001\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005\b\u1004\u0006\t\u1009\u0007\u000b\u1409\t\f\u1009\n\u0011\u1409\u0000", new Object[] { "b", "c", ajxo.class, "d", "j", "k", "l", "e", "f", "m", "g", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
