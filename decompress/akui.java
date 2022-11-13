import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akui extends ahbh implements ahcw
{
    private static volatile ahdd B;
    public static final akui a;
    public aiqj A;
    private byte C;
    public int b;
    public int c;
    public int d;
    public aklg e;
    public String f;
    public akud g;
    public aktp h;
    public akty i;
    public aktx j;
    public aktq k;
    public akub l;
    public akto m;
    public aktn n;
    public aktu o;
    public aktw p;
    public aktr q;
    public akue r;
    public akuf s;
    public aktz t;
    public aktv u;
    public akts v;
    public aktt w;
    public akua x;
    public akuc y;
    public aiqj z;
    
    static {
        ahbh.registerDefaultInstance((Class)akui.class, (ahbh)(a = new akui()));
    }
    
    private akui() {
        this.C = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte c = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = akui.B) == null) {
                    synchronized (akui.class) {
                        if (akui.B == null) {
                            akui.B = (ahdd)new ahba((ahbh)akui.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return akui.a;
            }
            case 4: {
                return new ahaz((ahbh)akui.a);
            }
            case 3: {
                return new akui();
            }
            case 2: {
                return newMessageInfo((MessageLite)akui.a, "\u0001\u0017\u0000\u0003\u0001J\u0017\u0000\u0000\u0003\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1009\u0006\u0004\u1009\u0007\u0005\u1009\b\u0006\u1009\u000b\u0007\u1009\f\u000b\u1009\u0010\r\u1009\u0012\u000e\u1009\u0013\u0011\u1009\u0016\u0012\u1009\u0017\u0014\u1009\u0019\u0015\u1009\u001b\u0016\u1009\u001c\u0017\u1009\u001d\u0019\u1009\u001e&\u1009\t'\u1009\n1\u100942\u10095I\u1409RJ\u1409S", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "j", "k", "x", "y", "z", "A" });
            }
            case 1: {
                if (o == null) {
                    c = 0;
                }
                this.C = c;
                return null;
            }
            case 0: {
                return this.C;
            }
        }
    }
}
