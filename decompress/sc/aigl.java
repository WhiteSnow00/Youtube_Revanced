import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigl extends ahbh implements ahcw
{
    public static final aigl a;
    private static volatile ahdd s;
    public int b;
    public ajut c;
    public String d;
    public boolean e;
    public ajut f;
    public String g;
    public boolean h;
    public aign i;
    public ajut j;
    public int k;
    public int l;
    public int m;
    public ajke n;
    public ahbx o;
    public ajut p;
    public ajut q;
    public ajut r;
    private byte t;
    
    static {
        ahbh.registerDefaultInstance((Class)aigl.class, (ahbh)(a = new aigl()));
    }
    
    private aigl() {
        this.t = 2;
        this.d = "";
        this.e = true;
        this.g = "";
        this.h = true;
        this.o = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd s;
                if ((s = aigl.s) == null) {
                    synchronized (aigl.class) {
                        if (aigl.s == null) {
                            aigl.s = (ahdd)new ahba((ahbh)aigl.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return aigl.a;
            }
            case 4: {
                return new ahaz((ahbh)aigl.a);
            }
            case 3: {
                return new aigl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigl.a, "\u0001\u0010\u0000\u0001\u0002\u0013\u0010\u0000\u0001\b\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0006\u1409\u0005\u0007\u1008\u0006\b\u1007\u0007\n\u1009\t\u000b\u1004\u000b\f\u1004\f\r\u1004\r\u000e\u1409\u000e\u000f\u041b\u0010\u1409\n\u0011\u1409\u000f\u0012\u1409\u0010\u0013\u1409\u0011", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "m", "n", "o", ajut.class, "j", "p", "q", "r" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
