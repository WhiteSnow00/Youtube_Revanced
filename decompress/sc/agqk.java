import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqk extends ahbh implements ahcw
{
    public static final agqk a;
    private static volatile ahdd l;
    public agqi b;
    public String c;
    public ahbx d;
    public ahbx e;
    public ahbp f;
    public String g;
    public boolean h;
    public int i;
    public String j;
    public agqj k;
    
    static {
        ahbh.registerDefaultInstance((Class)agqk.class, (ahbh)(a = new agqk()));
    }
    
    private agqk() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
        this.e = ahbh.emptyProtobufList();
        this.f = emptyIntList();
        this.g = "";
        final ahab b = ahab.b;
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = agqk.l) == null) {
                    synchronized (agqk.class) {
                        if (agqk.l == null) {
                            agqk.l = (ahdd)new ahba((ahbh)agqk.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return agqk.a;
            }
            case 4: {
                return new ahaz((ahbh)agqk.a);
            }
            case 3: {
                return new agqk();
            }
            case 2: {
                return newMessageInfo((MessageLite)agqk.a, "\u0000\n\u0000\u0000\u0001\u0011\n\u0000\u0003\u0000\u0001\t\u0002\u0208\u0003\u021a\u0004,\u0005\u021a\u0006\u0208\b\u0007\t\f\u0010\u0208\u0011\t", new Object[] { "b", "c", "d", "f", "e", "g", "h", "i", "j", "k" });
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
