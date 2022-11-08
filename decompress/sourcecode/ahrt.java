import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahrt extends agzi implements ahax
{
    public static final ahrt a;
    private static volatile ahbe j;
    public int b;
    public akbf c;
    public ajsq d;
    public aioe e;
    public aioe f;
    public aioe g;
    public aioe h;
    public alts i;
    private ajsq k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(ahrt.class, a = new ahrt());
    }
    
    private ahrt() {
        this.l = 2;
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
                if ((j = ahrt.j) == null) {
                    synchronized (ahrt.class) {
                        if (ahrt.j == null) {
                            ahrt.j = (ahbe)new agzb((agzi)ahrt.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ahrt.a;
            }
            case 4: {
                return new agza((agzi)ahrt.a);
            }
            case 3: {
                return new ahrt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahrt.a, "\u0001\b\u0000\u0001\u0001\u03e7\b\u0000\u0000\b\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0006\t\u1409\u0005\u03e7\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "k", "h", "i" });
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
