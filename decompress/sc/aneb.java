import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aneb extends ahbh implements ahcw
{
    public static final aneb a;
    private static volatile ahdd l;
    public int b;
    public String c;
    public ahbp d;
    public int e;
    public boolean f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    
    static {
        ahbh.registerDefaultInstance((Class)aneb.class, (ahbh)(a = new aneb()));
    }
    
    private aneb() {
        this.c = "";
        this.d = emptyIntList();
        this.k = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = aneb.l) == null) {
                    synchronized (aneb.class) {
                        if (aneb.l == null) {
                            aneb.l = (ahdd)new ahba((ahbh)aneb.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aneb.a;
            }
            case 4: {
                return new ahaz((ahbh)aneb.a);
            }
            case 3: {
                return new aneb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aneb.a, "\u0001\t\u0000\u0001\u0002\u000b\t\u0000\u0001\u0000\u0002\u0016\u0003\u1004\u0001\u0004\u1004\u0003\u0005\u100c\u0005\u0006\u1007\u0002\u0007\u1007\u0004\b\u1008\u0000\t\u1007\u0007\u000b\u100c\u0006", new Object[] { "b", "d", "e", "g", "i", anea.a(), "f", "h", "c", "k", "j", aien.a() });
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
