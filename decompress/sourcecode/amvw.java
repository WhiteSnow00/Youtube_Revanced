import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amvw extends agzi implements ahax
{
    public static final amvw a;
    private static volatile ahbe i;
    public int b;
    public ajsq c;
    public agzy d;
    public amvy e;
    public boolean f;
    public aioe g;
    public agzy h;
    private aioe j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(amvw.class, a = new amvw());
    }
    
    private amvw() {
        this.l = 2;
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        this.h = agzi.emptyProtobufList();
        final agyc b = agyc.b;
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
                final ahbe i;
                if ((i = amvw.i) == null) {
                    synchronized (amvw.class) {
                        if (amvw.i == null) {
                            amvw.i = (ahbe)new agzb((agzi)amvw.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return amvw.a;
            }
            case 4: {
                return new agza((agzi)amvw.a);
            }
            case 3: {
                return new amvw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amvw.a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0007\u0001\u1409\u0000\u0005\u1409\t\b\u041b\t\u1409\u0003\n\u1007\u0004\f\u1409\u0005\r\u1409\u0006\u000f\u041b", new Object[] { "b", "c", "k", "d", amvu.class, "e", "f", "g", "j", "h", aioe.class });
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
