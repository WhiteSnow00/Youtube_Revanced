import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aids extends agzi implements ahax
{
    public static final aids a;
    private static volatile ahbe h;
    public int b;
    public ajsq c;
    public agzy d;
    public ajsq e;
    public ajsq f;
    public ajsq g;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private aidu l;
    private ajsq m;
    private ajsq n;
    private aidx o;
    private aidv p;
    private aidw q;
    private aidr r;
    private aioe s;
    private aidt t;
    private aioe u;
    private byte v;
    
    static {
        agzi.registerDefaultInstance((Class)aids.class, (agzi)(a = new aids()));
    }
    
    private aids() {
        this.v = 2;
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe h;
                if ((h = aids.h) == null) {
                    synchronized (aids.class) {
                        if (aids.h == null) {
                            aids.h = (ahbe)new agzb((agzi)aids.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aids.a;
            }
            case 4: {
                return new agza((agzi)aids.a);
            }
            case 3: {
                return new aids();
            }
            case 2: {
                return newMessageInfo((MessageLite)aids.a, "\u0001\u0012\u0000\u0001\u0001\u001f\u0012\u0000\u0001\u0012\u0001\u1409\u0002\u0002\u041b\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\n\u0007\u1409\f\b\u1409\r\t\u1409\u000e\n\u1409\u000f\f\u1409\u0010\u0012\u1409\u0015\u0013\u1409\u0000\u0015\u1409\u0005\u0016\u1409\u0006\u0018\u1409\u0003\u001c\u1409\t\u001e\u1409\u0016\u001f\u1409\u000b", new Object[] { "b", "c", "d", aidm.class, "e", "f", "g", "o", "p", "q", "r", "s", "t", "i", "k", "l", "j", "m", "u", "n" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.v = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
