import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apil extends agzd implements agze
{
    public static final apil a;
    private static volatile ahbe t;
    public int b;
    public aorm c;
    public ajsq d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    public aioe h;
    public ahyq i;
    public ahyq j;
    public ahyq k;
    public apdo m;
    public apik n;
    public agzy o;
    public amer p;
    public apim q;
    public apin r;
    public agyc s;
    private ahiq u;
    private aiib v;
    private ahfw w;
    private byte x;
    
    static {
        agzi.registerDefaultInstance(apil.class, (agzi)(a = new apil()));
    }
    
    private apil() {
        this.x = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.o = emptyProtobufList();
        emptyProtobufList();
        this.s = agyc.b;
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
                final ahbe t;
                if ((t = apil.t) == null) {
                    synchronized (apil.class) {
                        if (apil.t == null) {
                            apil.t = (ahbe)new agzb((agzi)apil.a);
                        }
                    }
                }
                return t;
            }
            case 5: {
                return apil.a;
            }
            case 4: {
                return new agzc((agzd)apil.a);
            }
            case 3: {
                return new apil();
            }
            case 2: {
                return newMessageInfo((MessageLite)apil.a, "\u0001\u0013\u0000\u0001\u0002\u001a\u0013\u0000\u0001\u0010\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\n\t\u1409\u000b\n\u1409\f\u000b\u1409\u000e\f\u041b\u000e\u1409\u0010\u0010\u1409\u0014\u0011\u100a\u0015\u0012\u1409\r\u0014\u1009\u0011\u0015\u1009\u0012\u0019\u1409\u0007\u001a\u1409\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "o", aora.class, "p", "w", "s", "m", "q", "r", "u", "v" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.x = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.x;
            }
        }
    }
}
