import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anov extends ahbh implements ahcw
{
    public static final anov a;
    private static volatile ahdd q;
    public int b;
    public ajut c;
    public aotp d;
    public anuv e;
    public float f;
    public int g;
    public int h;
    public anuv i;
    public aiqj j;
    public ahbx k;
    public aiqj l;
    public anuv m;
    public long n;
    public aicc o;
    public ajut p;
    private byte r;
    
    static {
        ahbh.registerDefaultInstance((Class)anov.class, (ahbh)(a = new anov()));
    }
    
    private anov() {
        this.r = 2;
        this.k = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte r = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd q;
                if ((q = anov.q) == null) {
                    synchronized (anov.class) {
                        if (anov.q == null) {
                            anov.q = (ahdd)new ahba((ahbh)anov.a);
                        }
                    }
                }
                return q;
            }
            case 5: {
                return anov.a;
            }
            case 4: {
                return new ahaz((ahbh)anov.a);
            }
            case 3: {
                return new anov();
            }
            case 2: {
                return newMessageInfo((MessageLite)anov.a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\t\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1001\u0004\u0006\u100b\u0005\u0007\u100b\u0006\b\u1409\u0007\t\u1409\b\n\u041b\u000b\u1409\t\f\u1409\n\r\u1002\u000b\u000e\u1009\f\u000f\u1409\r", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", aiqj.class, "l", "m", "n", "o", "p" });
            }
            case 1: {
                if (o == null) {
                    r = 0;
                }
                this.r = r;
                return null;
            }
            case 0: {
                return this.r;
            }
        }
    }
}
