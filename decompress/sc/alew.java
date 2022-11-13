import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alew extends ahbh implements ahcw
{
    public static final alew a;
    private static volatile ahdd l;
    public int b;
    public aklg c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ahab h;
    public ahab i;
    public aovy j;
    public ahbx k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)alew.class, (ahbh)(a = new alew()));
    }
    
    private alew() {
        this.m = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = ahab.b;
        this.i = ahab.b;
        this.k = emptyProtobufList();
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
                if ((l = alew.l) == null) {
                    synchronized (alew.class) {
                        if (alew.l == null) {
                            alew.l = (ahdd)new ahba((ahbh)alew.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return alew.a;
            }
            case 4: {
                return new ahaz((byte[])null, (byte[])null);
            }
            case 3: {
                return new alew();
            }
            case 2: {
                return newMessageInfo((MessageLite)alew.a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0006\u100a\u0005\u0007\u100a\u0006\b\u1008\u0003\t\u1008\u0004\r\u1009\b\u000e\u001c", new Object[] { "b", "c", "d", "e", "h", "i", "f", "g", "j", "k" });
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
