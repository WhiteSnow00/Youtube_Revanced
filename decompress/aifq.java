import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aifq extends ahbh implements ahcw
{
    public static final aifq a;
    private static volatile ahdd h;
    public int b;
    public ajut c;
    public ahbx d;
    public ajut e;
    public ajut f;
    public ajut g;
    private ajut i;
    private ajut j;
    private ajut k;
    private aifs l;
    private ajut m;
    private ajut n;
    private aifv o;
    private aift p;
    private aifu q;
    private aifp r;
    private aiqj s;
    private aifr t;
    private aiqj u;
    private byte v;
    
    static {
        ahbh.registerDefaultInstance((Class)aifq.class, (ahbh)(a = new aifq()));
    }
    
    private aifq() {
        this.v = 2;
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte v = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aifq.h) == null) {
                    synchronized (aifq.class) {
                        if (aifq.h == null) {
                            aifq.h = (ahdd)new ahba((ahbh)aifq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aifq.a;
            }
            case 4: {
                return new ahaz((ahbh)aifq.a);
            }
            case 3: {
                return new aifq();
            }
            case 2: {
                return newMessageInfo((MessageLite)aifq.a, "\u0001\u0012\u0000\u0001\u0001\u001f\u0012\u0000\u0001\u0012\u0001\u1409\u0002\u0002\u041b\u0004\u1409\u0007\u0005\u1409\b\u0006\u1409\n\u0007\u1409\f\b\u1409\r\t\u1409\u000e\n\u1409\u000f\f\u1409\u0010\u0012\u1409\u0015\u0013\u1409\u0000\u0015\u1409\u0005\u0016\u1409\u0006\u0018\u1409\u0003\u001c\u1409\t\u001e\u1409\u0016\u001f\u1409\u000b", new Object[] { "b", "c", "d", aifk.class, "e", "f", "g", "o", "p", "q", "r", "s", "t", "i", "k", "l", "j", "m", "u", "n" });
            }
            case 1: {
                if (o == null) {
                    v = 0;
                }
                this.v = v;
                return null;
            }
            case 0: {
                return this.v;
            }
        }
    }
}
