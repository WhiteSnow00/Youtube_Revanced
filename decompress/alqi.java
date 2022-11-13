import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqi extends ahbh implements ahcw
{
    public static final alqi a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public String d;
    public ajut e;
    public ajut f;
    public aotp g;
    private ajut i;
    private ajut j;
    private ajut k;
    private ajut l;
    private ajut m;
    private aiqj n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)alqi.class, (ahbh)(a = new alqi()));
    }
    
    private alqi() {
        this.o = 2;
        this.c = "";
        this.d = "";
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = alqi.h) == null) {
                    synchronized (alqi.class) {
                        if (alqi.h == null) {
                            alqi.h = (ahdd)new ahba((ahbh)alqi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqi.a;
            }
            case 4: {
                return new ahaz((ahbh)alqi.a);
            }
            case 3: {
                return new alqi();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqi.a, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\t\u0001\u1008\u0000\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\u0006\u0006\u1409\u0007\u0007\u1008\u0003\b\u1409\u000b\n\u1409\b\u000b\u1409\t\r\u1409\u0002\u000e\u1409\n", new Object[] { "b", "c", "e", "f", "j", "g", "d", "n", "k", "l", "i", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
