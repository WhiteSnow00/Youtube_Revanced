import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akgu extends ahbh implements ahcw
{
    public static final akgu a;
    private static volatile ahdd l;
    public int b;
    public aklg c;
    public String d;
    public long e;
    public int f;
    public ancr g;
    public String h;
    public String i;
    public long j;
    public long k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)akgu.class, (ahbh)(a = new akgu()));
    }
    
    private akgu() {
        this.m = 2;
        this.d = "";
        this.h = "";
        this.i = "";
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
                final ahdd l;
                if ((l = akgu.l) == null) {
                    synchronized (akgu.class) {
                        if (akgu.l == null) {
                            akgu.l = (ahdd)new ahba((ahbh)akgu.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return akgu.a;
            }
            case 4: {
                return new ahaz((ahbh)akgu.a);
            }
            case 3: {
                return new akgu();
            }
            case 2: {
                return newMessageInfo((MessageLite)akgu.a, "\u0001\t\u0000\u0001\u0001\u0016\t\u0000\u0000\u0002\u0001\u1409\u0001\u0002\u1008\u0002\u0003\u1002\u0003\u0004\u1004\u0004\u0005\u1409\u0005\u0006\u1008\u0006\u000f\u1008\u000f\u0010\u1003\u0010\u0016\u1002\u0015", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
