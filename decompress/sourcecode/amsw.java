import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amsw extends agzi implements ahax
{
    public static final amsw a;
    private static volatile ahbe o;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public aorm g;
    public aorm h;
    public ajsq i;
    public ajsq j;
    public aibc k;
    public aibc l;
    public agzy m;
    public agyc n;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(amsw.class, a = new amsw());
    }
    
    private amsw() {
        this.c = 0;
        this.e = 0;
        this.q = 2;
        this.m = agzi.emptyProtobufList();
        this.n = agyc.b;
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
                final ahbe o3;
                if ((o3 = amsw.o) == null) {
                    synchronized (amsw.class) {
                        if (amsw.o == null) {
                            amsw.o = (ahbe)new agzb((agzi)amsw.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return amsw.a;
            }
            case 4: {
                return new agza((agzi)amsw.a);
            }
            case 3: {
                return new amsw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amsw.a, "\u0001\r\u0002\u0001\u0001\u000f\r\u0000\u0001\f\u0001\u1409\u0000\u0002\u1409\u0004\u0003\u143c\u0001\u0004\u1409\b\u0005\u1409\t\b\u1409\n\t\u100a\u000b\n\u1409\u0003\u000b\u041b\f\u143c\u0000\r\u143c\u0001\u000e\u1409\u0005\u000f\u143c\u0000", new Object[] { "d", "c", "f", "e", "b", "g", "i", ajsq.class, "k", "l", "p", "n", "h", "m", amuu.class, aorr.class, anss.class, "j", akbf.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
