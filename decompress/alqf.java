import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alqf extends ahbh implements ahcw
{
    public static final alqf a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public anuv d;
    public ajut e;
    public anuv f;
    public ahbx g;
    private ajut i;
    private anuv j;
    private anuv k;
    private byte l;
    
    static {
        ahbh.registerDefaultInstance((Class)alqf.class, (ahbh)(a = new alqf()));
    }
    
    private alqf() {
        this.l = 2;
        this.c = "";
        this.g = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = alqf.h) == null) {
                    synchronized (alqf.class) {
                        if (alqf.h == null) {
                            alqf.h = (ahdd)new ahba((ahbh)alqf.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return alqf.a;
            }
            case 4: {
                return new ahaz((ahbh)alqf.a);
            }
            case 3: {
                return new alqf();
            }
            case 2: {
                return newMessageInfo((MessageLite)alqf.a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0007\u0001\u1008\u0000\u0003\u1409\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1409\u0006\u0007\u1409\u0007\b\u041b\r\u1409\u0002", new Object[] { "b", "c", "d", "e", "f", "j", "k", "g", anuv.class, "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
