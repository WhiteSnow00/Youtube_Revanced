import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agrq extends ahbh implements ahcw
{
    public static final ahbq a;
    public static final agrq b;
    private static volatile ahdd j;
    public int c;
    public String d;
    public int e;
    public ahbp f;
    public agrk g;
    public agri h;
    public agru i;
    private byte k;
    
    static {
        a = (ahbq)new ptj(6);
        ahbh.registerDefaultInstance((Class)agrq.class, (ahbh)(b = new agrq()));
    }
    
    private agrq() {
        this.k = 2;
        this.d = "";
        this.f = emptyIntList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = agrq.j) == null) {
                    synchronized (agrq.class) {
                        if (agrq.j == null) {
                            agrq.j = (ahdd)new ahba((ahbh)agrq.b);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agrq.b;
            }
            case 4: {
                return new ahaz((ahbh)agrq.b);
            }
            case 3: {
                return new agrq();
            }
            case 2: {
                return newMessageInfo((MessageLite)agrq.b, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001e\u0005\u1009\u0002\n\u1009\u0007\u001c\u1009\u0019", new Object[] { "c", "d", "e", ahga.i, "f", ahhq.a(), "g", "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
