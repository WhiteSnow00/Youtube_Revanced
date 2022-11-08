import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alts extends agzd implements agze
{
    public static final agzr a;
    public static final alts b;
    private static volatile ahbe j;
    public int c;
    public agyc d;
    public apnh e;
    public ajvn f;
    public agzq g;
    public ailc h;
    public aqqe i;
    private byte k;
    
    static {
        a = (agzr)new altr(0);
        agzi.registerDefaultInstance((Class)alts.class, (agzi)(b = new alts()));
    }
    
    private alts() {
        this.k = 2;
        this.d = agyc.b;
        this.g = emptyIntList();
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
                final ahbe j;
                if ((j = alts.j) == null) {
                    synchronized (alts.class) {
                        if (alts.j == null) {
                            alts.j = (ahbe)new agzb((agzi)alts.b);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return alts.b;
            }
            case 4: {
                return new agzc(alts.b);
            }
            case 3: {
                return new alts();
            }
            case 2: {
                return newMessageInfo((MessageLite)alts.b, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0001\u0001\u100a\u0000\u0004\u1009\u0001\u0005\u1009\u0002\u0006\u001e\u0007\u1009\u0003\t\u1409\u0006", new Object[] { "c", "d", "e", "f", "g", altx.a(), "h", "i" });
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
