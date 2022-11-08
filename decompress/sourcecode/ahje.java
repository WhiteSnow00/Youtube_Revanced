import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahje extends agzi implements ahax
{
    public static final ahje a;
    private static volatile ahbe p;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public aorm f;
    public akbf g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public aioe m;
    public agzy n;
    public agyc o;
    private ahfw q;
    private byte r;
    
    static {
        agzi.registerDefaultInstance((Class)ahje.class, (agzi)(a = new ahje()));
    }
    
    private ahje() {
        this.c = 0;
        this.r = 2;
        this.n = emptyProtobufList();
        this.o = agyc.b;
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
                final ahbe p3;
                if ((p3 = ahje.p) == null) {
                    synchronized (ahje.class) {
                        if (ahje.p == null) {
                            ahje.p = (ahbe)new agzb((agzi)ahje.a);
                        }
                    }
                }
                return p3;
            }
            case 5: {
                return ahje.a;
            }
            case 4: {
                return new agza((agzi)ahje.a);
            }
            case 3: {
                return new ahje();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahje.a, "\u0001\r\u0001\u0001\u0001\u000e\r\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u103e\u0000\u0004\u100b\u0005\u0005\u1409\t\u0006\u1409\n\u0007\u100a\u000b\b\u100b\u0006\t\u100b\b\n\u041b\f\u1409\u0002\r\u100b\u0004\u000e\u100b\u0007", new Object[] { "d", "c", "b", "e", "f", "i", "m", "q", "o", "j", "l", "n", aioe.class, "g", "h", "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.r = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
