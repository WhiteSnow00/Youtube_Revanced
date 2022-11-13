import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akok extends ahbh implements ahcw
{
    public static final akok a;
    private static volatile ahdd j;
    public int b;
    public aklg c;
    public String d;
    public int e;
    public String f;
    public boolean g;
    public akom h;
    public akoq i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)akok.class, (ahbh)(a = new akok()));
    }
    
    private akok() {
        this.k = 2;
        this.d = "";
        this.f = "";
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
                if ((j = akok.j) == null) {
                    synchronized (akok.class) {
                        if (akok.j == null) {
                            akok.j = (ahdd)new ahba((ahbh)akok.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return akok.a;
            }
            case 4: {
                return new ahaz((ahbh)akok.a);
            }
            case 3: {
                return new akok();
            }
            case 2: {
                return newMessageInfo((MessageLite)akok.a, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0004\u1008\u0003\u0010\u1009\t\u0011\u100c\u0002\u0012\u1009\n\u0013\u1007\u0004", new Object[] { "b", "c", "d", "f", "h", "e", ajqf.s, "i", "g" });
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
