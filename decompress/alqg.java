import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqg extends ahbh implements ahcw
{
    public static final alqg a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public ajut d;
    public ajut e;
    public aotp f;
    public aiqj g;
    private ajut i;
    private ajut j;
    private ajut k;
    private ajut l;
    private ajut m;
    private ahhu n;
    private byte o;
    
    static {
        ahbh.registerDefaultInstance((Class)alqg.class, (ahbh)(a = new alqg()));
    }
    
    private alqg() {
        this.o = 2;
        this.c = "";
        emptyProtobufList();
        final ahab b = ahab.b;
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
                if ((h = alqg.h) == null) {
                    synchronized (alqg.class) {
                        if (alqg.h == null) {
                            alqg.h = (ahdd)new ahba((ahbh)alqg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqg.a;
            }
            case 4: {
                return new ahaz((ahbh)alqg.a);
            }
            case 3: {
                return new alqg();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqg.a, "\u0001\u000b\u0000\u0001\u0001\u0014\u000b\u0000\u0000\n\u0001\u1008\u0000\u0003\u1409\u0002\u0005\u1409\u0004\u0006\u1409\u0005\t\u1409\b\n\u1409\t\u000b\u1409\u000b\u000e\u1409\r\u0012\u1409\u0006\u0013\u1409\u0007\u0014\u1409\n", new Object[] { "b", "c", "i", "d", "e", "k", "l", "g", "n", "j", "f", "m" });
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
