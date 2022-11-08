import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqc extends agzi implements ahax
{
    public static final alqc a;
    private static volatile ahbe j;
    public int b;
    public akbf c;
    public ajsq d;
    public anss e;
    public aioe f;
    public agzy g;
    public agzy h;
    public alqb i;
    private byte k;
    
    static {
        agzi.registerDefaultInstance(alqc.class, a = new alqc());
    }
    
    private alqc() {
        this.k = 2;
        this.g = agzi.emptyProtobufList();
        this.h = agzi.emptyProtobufList();
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
                final ahbe j;
                if ((j = alqc.j) == null) {
                    synchronized (alqc.class) {
                        if (alqc.j == null) {
                            alqc.j = (ahbe)new agzb((agzi)alqc.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alqc.a;
            }
            case 4: {
                return new agza((agzi)alqc.a);
            }
            case 3: {
                return new alqc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alqc.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0007\u0001\u1409\u0001\u0002\u041b\u0003\u041b\u0004\u1409\u0000\u0005\u1409\u0002\u0006\u1409\u0003\u0007\u1409\u0004", new Object[] { "b", "d", "g", alqb.class, "h", alqd.class, "c", "e", "f", "i" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
