import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anqa extends ahbh implements ahcw
{
    public static final anqa a;
    private static volatile ahdd v;
    public int b;
    public aotp c;
    public anuv d;
    public akdi e;
    public ajut f;
    public ajut g;
    public ajut h;
    public ajut i;
    public ajut j;
    public anuv k;
    public aiqj l;
    public ahbx m;
    public anuv n;
    public long o;
    public aicc p;
    public ahbx q;
    public boolean r;
    public anpb s;
    public anpl t;
    public boolean u;
    private byte w;
    
    static {
        ahbh.registerDefaultInstance((Class)anqa.class, (ahbh)(a = new anqa()));
    }
    
    private anqa() {
        this.w = 2;
        this.m = emptyProtobufList();
        this.q = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte w = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd v;
                if ((v = anqa.v) == null) {
                    synchronized (anqa.class) {
                        if (anqa.v == null) {
                            anqa.v = (ahdd)new ahba((ahbh)anqa.a);
                        }
                    }
                }
                return v;
            }
            case 5: {
                return anqa.a;
            }
            case 4: {
                return new ahaz((ahbh)anqa.a);
            }
            case 3: {
                return new anqa();
            }
            case 2: {
                return newMessageInfo((MessageLite)anqa.a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0002\r\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1409\u0007\b\u1409\b\t\u1409\t\n\u041b\u000b\u1409\n\f\u1002\u000b\r\u1009\f\u000e\u041b\u000f\u1007\r\u0011\u1009\u000f\u0012\u1009\u0010\u0014\u1409\u0006\u0015\u1007\u0012", new Object[] { "b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", aiqj.class, "n", "o", "p", "q", aiqj.class, "r", "s", "t", "i", "u" });
            }
            case 1: {
                if (o == null) {
                    w = 0;
                }
                this.w = w;
                return null;
            }
            case 0: {
                return this.w;
            }
        }
    }
}
