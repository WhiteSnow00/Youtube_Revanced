import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbw extends agzi implements ahax
{
    public static final apbw a;
    private static volatile ahbe k;
    public ajsq b;
    public agzy c;
    public agzy d;
    public int e;
    public aibc f;
    public aibc g;
    public agyc h;
    public agzy i;
    public agzy j;
    private int l;
    private ahfw m;
    private ajsq n;
    private ajsq o;
    private aioe p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(apbw.class, a = new apbw());
    }
    
    private apbw() {
        this.q = 2;
        this.c = agzi.emptyProtobufList();
        this.d = agzi.emptyProtobufList();
        this.h = agyc.b;
        this.i = agzi.emptyProtobufList();
        this.j = agzi.emptyProtobufList();
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
                if ((k = apbw.k) == null) {
                    synchronized (apbw.class) {
                        if (apbw.k == null) {
                            apbw.k = (ahbe)new agzb((agzi)apbw.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return apbw.a;
            }
            case 4: {
                return new agza((agzi)apbw.a);
            }
            case 3: {
                return new apbw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbw.a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u000b\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0006\u0005\u1409\b\u0006\u041b\u0007\u1409\u0002\b\u1409\u0003\t\u1409\u0004\n\u100a\u0005\u000b\u1004\u0001\f\u041b\r\u041b\u000e\u1409\t", new Object[] { "l", "b", "c", ajsq.class, "n", "o", "d", apbv.class, "f", "g", "m", "h", "e", "i", aioe.class, "j", aioe.class, "p" });
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
