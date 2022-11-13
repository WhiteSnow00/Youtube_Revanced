import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklw extends ahbh implements ahcw
{
    public static final aklw a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public String d;
    public String e;
    public int f;
    public akls g;
    public boolean h;
    public String i;
    public String j;
    public boolean k;
    public int l;
    
    static {
        ahbh.registerDefaultInstance((Class)aklw.class, (ahbh)(a = new aklw()));
    }
    
    private aklw() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.i = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = aklw.m) == null) {
                    synchronized (aklw.class) {
                        if (aklw.m == null) {
                            aklw.m = (ahdd)new ahba((ahbh)aklw.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return aklw.a;
            }
            case 4: {
                return new ahaz((ahbh)aklw.a);
            }
            case 3: {
                return new aklw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklw.a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u100c\u0004\u0006\u1009\u0006\u0007\u1007\u0007\b\u1008\b\t\u1008\t\n\u1007\n\u000b\u1008\u0003\r\u100c\f", new Object[] { "b", "c", "d", "f", anic.m, "g", "h", "i", "j", "k", "e", "l", aldq.c });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
