import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqd extends ahbh implements ahcw
{
    public static final anqd a;
    private static volatile ahdd n;
    public int b;
    public ajut c;
    public ajut d;
    public ajut e;
    public aiqj f;
    public ahbx g;
    public anuv h;
    public long i;
    public aicc j;
    public ahbx k;
    public anpb l;
    public anuv m;
    private anuv o;
    private byte p;
    
    static {
        ahbh.registerDefaultInstance((Class)anqd.class, (ahbh)(a = new anqd()));
    }
    
    private anqd() {
        this.p = 2;
        this.g = emptyProtobufList();
        this.k = emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte p3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd n;
                if ((n = anqd.n) == null) {
                    synchronized (anqd.class) {
                        if (anqd.n == null) {
                            anqd.n = (ahdd)new ahba((ahbh)anqd.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return anqd.a;
            }
            case 4: {
                return new ahaz((ahbh)anqd.a);
            }
            case 3: {
                return new anqd();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqd.a, "\u0001\f\u0000\u0001\u0001\u000e\f\u0000\u0002\t\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u041b\u0006\u1409\u0004\u0007\u1002\u0005\b\u1009\u0006\t\u041b\n\u1009\u0007\u000b\u1409\b\u000e\u1409\n", new Object[] { "b", "c", "d", "e", "f", "g", aiqj.class, "h", "i", "j", "k", aiqj.class, "l", "m", "o" });
            }
            case 1: {
                if (o == null) {
                    p3 = 0;
                }
                this.p = p3;
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
