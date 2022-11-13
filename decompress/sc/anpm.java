import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpm extends ahbh implements ahcw
{
    public static final anpm a;
    private static volatile ahdd x;
    public int b;
    public aotp c;
    public anuv d;
    public akdi e;
    public ajut f;
    public ajut g;
    public ajut h;
    public anuv i;
    public anuv j;
    public long k;
    public boolean l;
    public ajut m;
    public aiqj n;
    public ahbx o;
    public anuv p;
    public long q;
    public aicc r;
    public ahbx s;
    public boolean t;
    public anpb u;
    public anpl v;
    public boolean w;
    private byte y;
    
    static {
        ahbh.registerDefaultInstance((Class)anpm.class, (ahbh)(a = new anpm()));
    }
    
    private anpm() {
        this.y = 2;
        this.o = emptyProtobufList();
        this.s = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd x;
                if ((x = anpm.x) == null) {
                    synchronized (anpm.class) {
                        if (anpm.x == null) {
                            anpm.x = (ahdd)new ahba((ahbh)anpm.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return anpm.a;
            }
            case 4: {
                return new ahaz((ahbh)anpm.a);
            }
            case 3: {
                return new anpm();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpm.a, "\u0001\u0015\u0000\u0001\u0001\u0018\u0015\u0000\u0002\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\n\b\u1409\u000b\t\u041b\n\u1409\f\u000b\u1002\r\f\u1009\u000e\r\u041b\u000e\u1007\u000f\u000f\u1409\u0006\u0011\u1009\u0011\u0012\u1009\u0012\u0014\u1007\u0014\u0016\u1409\u0007\u0017\u1002\b\u0018\u1007\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "m", "n", "o", aiqj.class, "p", "q", "r", "s", aiqj.class, "t", "i", "u", "v", "w", "j", "k", "l" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
