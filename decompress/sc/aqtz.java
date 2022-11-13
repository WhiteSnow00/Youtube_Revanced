import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtz extends ahbc implements ahbd
{
    public static final aqtz a;
    private static volatile ahdd i;
    public int b;
    public aggu c;
    public String d;
    public String e;
    public int f;
    public aqtt g;
    public aquu h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)aqtz.class, (ahbh)(a = new aqtz()));
    }
    
    private aqtz() {
        this.j = 2;
        this.d = "";
        this.e = "";
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aqtz.i) == null) {
                    synchronized (aqtz.class) {
                        if (aqtz.i == null) {
                            aqtz.i = (ahdd)new ahba((ahbh)aqtz.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqtz.a;
            }
            case 4: {
                return new ahbb((ahbc)aqtz.a);
            }
            case 3: {
                return new aqtz();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqtz.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1004\u0005\u0005\u1009\u0006\u0006\u1409\u0007", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
