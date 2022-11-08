import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akac extends agzd implements agze
{
    public static final akac a;
    private static volatile ahbe k;
    public int b;
    public akaa c;
    public agzy d;
    public akab e;
    public akad f;
    public ajzz g;
    public anss h;
    public agzy i;
    public agyc j;
    private anss m;
    private anss n;
    private ahiq o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance((Class)akac.class, (agzi)(a = new akac()));
    }
    
    private akac() {
        this.q = 2;
        this.d = emptyProtobufList();
        this.i = emptyProtobufList();
        emptyProtobufList();
        this.j = agyc.b;
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
                final ahbe k;
                if ((k = akac.k) == null) {
                    synchronized (akac.class) {
                        if (akac.k == null) {
                            akac.k = (ahbe)new agzb((agzi)akac.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return akac.a;
            }
            case 4: {
                return new agzc(akac.a);
            }
            case 3: {
                return new akac();
            }
            case 2: {
                return newMessageInfo((MessageLite)akac.a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\n\u0001\u041b\u0002\u100a\r\u0003\u1409\u000e\u0004\u1409\u0000\u0005\u1409\u0001\u0006\u1009\u0002\t\u1409\u0006\n\u1409\b\u000b\u1409\t\f\u1409\u0007\r\u041b\u000f\u1409\u000b", new Object[] { "b", "d", akae.class, "j", "p", "c", "e", "f", "g", "m", "n", "h", "i", aioe.class, "o" });
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
