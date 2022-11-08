import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpp extends agzi implements ahax
{
    public static final alpp a;
    private static volatile ahbe j;
    public int b;
    public ajsq c;
    public ajsq d;
    public akbf e;
    public boolean f;
    public aioe g;
    public String h;
    public agyc i;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(alpp.class, a = new alpp());
    }
    
    private alpp() {
        this.l = 2;
        this.h = "";
        this.i = agyc.b;
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
                if ((j = alpp.j) == null) {
                    synchronized (alpp.class) {
                        if (alpp.j == null) {
                            alpp.j = (ahbe)new agzb((agzi)alpp.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alpp.a;
            }
            case 4: {
                return new agza((agzi)alpp.a);
            }
            case 3: {
                return new alpp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)alpp.a, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0005\u1007\u0003\u0006\u1409\u0004\b\u1008\u0005\t\u1409\u0006\n\u100a\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h", "k", "i" });
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
