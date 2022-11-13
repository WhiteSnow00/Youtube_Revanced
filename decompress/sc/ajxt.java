import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxt extends ahbh implements ahcw
{
    public static final ajxt a;
    private static volatile ahdd l;
    public int b;
    public int c;
    public Object d;
    public aklg e;
    public String f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public long k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxt.class, (ahbh)(a = new ajxt()));
    }
    
    private ajxt() {
        this.c = 0;
        this.m = 2;
        this.f = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ajxt.l) == null) {
                    synchronized (ajxt.class) {
                        if (ajxt.l == null) {
                            ajxt.l = (ahdd)new ahba((ahbh)ajxt.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajxt.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxt.a);
            }
            case 3: {
                return new ajxt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxt.a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u1007\u0004\u0005\u1007\u0005\u0006\u100c\u0006\b\u103b\u0000\t\u1007\b\u000b\u1002\n", new Object[] { "d", "c", "b", "e", "f", "g", "h", "i", amwz.a(), "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
