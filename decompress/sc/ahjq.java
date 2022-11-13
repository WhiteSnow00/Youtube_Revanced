import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahjq extends ahbh implements ahcw
{
    public static final ahjq a;
    private static volatile ahdd n;
    public int b;
    public ahab c;
    public ajut d;
    public ajut e;
    public ajut f;
    public aotp g;
    public anuv h;
    public boolean i;
    public boolean j;
    public aiqj k;
    public int l;
    public aotp m;
    private ahhu o;
    private ajut p;
    private ajut q;
    private ahka r;
    private ajut s;
    private ahjo t;
    private byte u;
    
    static {
        ahbh.registerDefaultInstance((Class)ahjq.class, (ahbh)(a = new ahjq()));
    }
    
    private ahjq() {
        this.u = 2;
        this.c = ahab.b;
        emptyProtobufList();
        emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte u = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = ahjq.n) == null) {
                    synchronized (ahjq.class) {
                        if (ahjq.n == null) {
                            ahjq.n = (ahdd)new ahba((ahbh)ahjq.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ahjq.a;
            }
            case 4: {
                return new ahaz((ahbh)ahjq.a);
            }
            case 3: {
                return new ahjq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahjq.a, "\u0001\u0011\u0000\u0001\u0001\u001a\u0011\u0000\u0000\r\u0001\u1409\u0000\u0002\u100a\u0001\u0004\u1409\u0002\u0005\u1409\u0015\u0006\u1409\u0006\u0007\u1007\b\b\u1007\t\t\u1409\u0016\f\u1409\n\r\u1409\u0005\u000f\u1409\f\u0010\u100c\r\u0011\u1409\u000e\u0013\u1409\u0007\u0015\u1409\u0011\u0019\u1409\u0003\u001a\u1409\u0004", new Object[] { "b", "o", "c", "d", "t", "g", "i", "j", "m", "k", "f", "q", "l", akdh.a(), "r", "h", "s", "p", "e" });
            }
            case 1: {
                if (o == null) {
                    u = 0;
                }
                this.u = u;
                return null;
            }
            case 0: {
                return this.u;
            }
        }
    }
}
