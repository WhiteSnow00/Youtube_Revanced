import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqz extends ahbh implements ahcw
{
    public static final aqqz a;
    private static volatile ahdd q;
    public int b;
    public ajej c;
    public long d;
    public String e;
    public long f;
    public boolean g;
    public long h;
    public boolean i;
    public long j;
    public boolean k;
    public ahcr l;
    public ahcr m;
    public ahcr n;
    public int o;
    public int p;
    
    static {
        ahbh.registerDefaultInstance((Class)aqqz.class, (ahbh)(a = new aqqz()));
    }
    
    private aqqz() {
        this.l = ahcr.a;
        final ahcr a = ahcr.a;
        this.m = a;
        this.n = a;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd q;
                if ((q = aqqz.q) == null) {
                    synchronized (aqqz.class) {
                        if (aqqz.q == null) {
                            aqqz.q = (ahdd)new ahba((ahbh)aqqz.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return aqqz.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (char[])null);
            }
            case 3: {
                return new aqqz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqqz.a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0003\u0000\u0000\u0001\u1009\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1002\u0003\u0005\u1007\u0004\u0006\u1002\u0005\u0007\u1007\u0006\b\u1002\u0007\t\u1007\b\n2\u000b2\f2\r\u1004\t\u000e\u1004\n", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", aqqw.a, "m", aqqx.a, "n", aqqy.a, "o", "p" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
