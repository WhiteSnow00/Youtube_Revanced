import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anpn extends ahbh implements ahcw
{
    private static volatile ahdd A;
    public static final anpn a;
    private byte B;
    public int b;
    public aotp c;
    public aotp d;
    public anuv e;
    public akdi f;
    public ajut g;
    public ajut h;
    public float i;
    public ajut j;
    public ajut k;
    public ajut l;
    public anuv m;
    public long n;
    public anuv o;
    public boolean p;
    public aiqj q;
    public ahbx r;
    public anuv s;
    public long t;
    public aicc u;
    public ahbx v;
    public boolean w;
    public anpb x;
    public anpl y;
    public boolean z;
    
    static {
        ahbh.registerDefaultInstance((Class)anpn.class, (ahbh)(a = new anpn()));
    }
    
    private anpn() {
        this.B = 2;
        this.r = emptyProtobufList();
        this.v = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte b = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd a2;
                if ((a2 = anpn.A) == null) {
                    synchronized (anpn.class) {
                        if (anpn.A == null) {
                            anpn.A = (ahdd)new ahba((ahbh)anpn.a);
                        }
                    }
                }
                return a2;
            }
            case 5: {
                return anpn.a;
            }
            case 4: {
                return new ahaz((ahbh)anpn.a);
            }
            case 3: {
                return new anpn();
            }
            case 2: {
                return newMessageInfo((MessageLite)anpn.a, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0002\u000f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1001\u0006\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000f\f\u041b\r\u1409\u0010\u000e\u1002\u0011\u000f\u1009\u0012\u0010\u041b\u0011\u1007\u0013\u0012\u1409\u000b\u0014\u1009\u0015\u0015\u1009\u0016\u0018\u1007\u0018\u0019\u1409\r\u001a\u1002\f\u001b\u1007\u000e", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "q", "r", aiqj.class, "s", "t", "u", "v", aiqj.class, "w", "m", "x", "y", "z", "o", "n", "p" });
            }
            case 1: {
                if (o == null) {
                    b = 0;
                }
                this.B = b;
                return null;
            }
            case 0: {
                return this.B;
            }
        }
    }
}
