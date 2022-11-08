import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmo extends agzi implements ahax
{
    public static final ajmo a;
    private static volatile ahbe l;
    public int b;
    public String c;
    public aorm d;
    public agzy e;
    public ajsq f;
    public ajsq g;
    public ajsq h;
    public ajsq i;
    public aioe j;
    public agyc k;
    private ajsq m;
    private ajsq n;
    private ajsq o;
    private ahfw p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance((Class)ajmo.class, (agzi)(a = new ajmo()));
    }
    
    private ajmo() {
        this.q = 2;
        this.c = "";
        this.e = emptyProtobufList();
        this.k = agyc.b;
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
                final ahbe l;
                if ((l = ajmo.l) == null) {
                    synchronized (ajmo.class) {
                        if (ajmo.l == null) {
                            ajmo.l = (ahbe)new agzb((agzi)ajmo.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajmo.a;
            }
            case 4: {
                return new agza((agzi)ajmo.a);
            }
            case 3: {
                return new ajmo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajmo.a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u000b\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0007\u0007\u1409\t\n\u1409\f\u000b\u1409\r\f\u100a\u000e\r\u1409\b\u000e\u1409\u0006\u0010\u041b", new Object[] { "b", "c", "d", "f", "g", "h", "n", "i", "j", "p", "k", "o", "m", "e", aora.class });
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
