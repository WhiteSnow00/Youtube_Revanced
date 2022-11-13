import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alcp extends ahbh implements ahcw
{
    public static final alcp a;
    private static volatile ahdd i;
    public int b;
    public aklg c;
    public String d;
    public int e;
    public apmq f;
    public boolean g;
    public amlx h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)alcp.class, (ahbh)(a = new alcp()));
    }
    
    private alcp() {
        this.j = 2;
        this.d = "";
        this.e = 1;
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
                if ((i = alcp.i) == null) {
                    synchronized (alcp.class) {
                        if (alcp.i == null) {
                            alcp.i = (ahdd)new ahba((ahbh)alcp.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return alcp.a;
            }
            case 4: {
                return new ahaz((ahbh)alcp.a);
            }
            case 3: {
                return new alcp();
            }
            case 2: {
                return newMessageInfo((MessageLite)alcp.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0005\u1009\u0004\u0006\u1007\u0005\u0007\u1009\u0006", new Object[] { "b", "c", "d", "e", akwi.o, "f", "g", "h" });
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
