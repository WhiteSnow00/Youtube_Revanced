import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lpi extends agzi implements ahax
{
    public static final lpi a;
    private static volatile ahbe k;
    public int b;
    public lov c;
    public aktu d;
    public agyc e;
    public int f;
    public int g;
    public lpn h;
    public int i;
    public agzy j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(lpi.class, a = new lpi());
    }
    
    private lpi() {
        this.l = 2;
        agzi.emptyProtobufList();
        this.e = agyc.b;
        this.j = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy j = this.j;
        if (!j.c()) {
            this.j = agzi.mutableCopy(j);
        }
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
                final ahbe k;
                if ((k = lpi.k) == null) {
                    synchronized (lpi.class) {
                        if (lpi.k == null) {
                            lpi.k = (ahbe)new agzb((agzi)lpi.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return lpi.a;
            }
            case 4: {
                return new agza((agzi)lpi.a);
            }
            case 3: {
                return new lpi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)lpi.a, "\u0001\b\u0000\u0001\u0002\u000e\b\u0000\u0001\u0001\u0002\u1009\u0000\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u1004\u0003\u0006\u1004\u0004\n\u1009\u0007\r\u100c\t\u000e\u001b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ahfv.a(), "j", abxt.class });
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
