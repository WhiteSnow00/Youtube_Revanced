import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anco extends ahbh implements ahcw
{
    public static final anco a;
    private static volatile ahdd x;
    public int b;
    public int c;
    public String d;
    public int e;
    public long f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public boolean q;
    public ancu r;
    public ancp s;
    public boolean t;
    public ajbs u;
    public long v;
    public ancn w;
    private byte y;
    
    static {
        ahbh.registerDefaultInstance((Class)anco.class, (ahbh)(a = new anco()));
    }
    
    private anco() {
        this.y = 2;
        this.d = "";
        this.p = "";
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte y = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd x;
                if ((x = anco.x) == null) {
                    synchronized (anco.class) {
                        if (anco.x == null) {
                            anco.x = (ahdd)new ahba((ahbh)anco.a);
                        }
                    }
                }
                return x;
            }
            case 5: {
                return anco.a;
            }
            case 4: {
                return new ahaz((ahbh)anco.a);
            }
            case 3: {
                return new anco();
            }
            case 2: {
                return newMessageInfo((MessageLite)anco.a, "\u0001\u0014\u0000\u0002\u00039\u0014\u0000\u0000\u0001\u0003\u1008\u0001\u0004\u100b\u0002\u0005\u1002\u0003\u0006\u100b\u0004\u0007\u100b\u0005\b\u100b\u0006\n\u1007\u000b\u000b\u1007\f\f\u1008\u000e\u001d\u1007\u0018\u001f\u1409\u001c%\u1004\u0007&\u1004\b)\u1004\t,\u1007\r3\u1007*4\u1009+7\u1002-8\u1009.9\u1009\u001a", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "m", "n", "p", "q", "s", "j", "k", "l", "o", "t", "u", "v", "w", "r" });
            }
            case 1: {
                if (o == null) {
                    y = 0;
                }
                this.y = y;
                return null;
            }
            case 0: {
                return this.y;
            }
        }
    }
}
