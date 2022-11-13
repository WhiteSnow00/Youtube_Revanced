import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aozv extends ahbh implements ahcw
{
    public static final aozv a;
    private static volatile ahdd k;
    public int b;
    public String c;
    public akdi d;
    public aiqj e;
    public ajut f;
    public long g;
    public aotp h;
    public ajut i;
    public aida j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aozv.class, (ahbh)(a = new aozv()));
    }
    
    private aozv() {
        this.m = 2;
        this.c = "";
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = aozv.k) == null) {
                    synchronized (aozv.class) {
                        if (aozv.k == null) {
                            aozv.k = (ahdd)new ahba((ahbh)aozv.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aozv.a;
            }
            case 4: {
                return new ahaz((ahbh)aozv.a);
            }
            case 3: {
                return new aozv();
            }
            case 2: {
                return newMessageInfo((MessageLite)aozv.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0007\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1002\u0004\u0006\u1409\u0005\u0007\u1409\u0006\b\u1409\u0007\n\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "l" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
