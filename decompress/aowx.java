import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowx extends ahbh implements ahcw
{
    public static final aowx a;
    public static final ahbf b;
    private static volatile ahdd k;
    public int c;
    public int d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public String j;
    
    static {
        final aowx a2 = new aowx();
        ahbh.registerDefaultInstance((Class)aowx.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)amuj.b, (Object)a2, (MessageLite)a2, (ahbm)null, 330586086, ahek.k, (Class)aowx.class);
    }
    
    private aowx() {
        ahbh.emptyProtobufList();
        this.e = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = aowx.k) == null) {
                    synchronized (aowx.class) {
                        if (aowx.k == null) {
                            aowx.k = (ahdd)new ahba((ahbh)aowx.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aowx.a;
            }
            case 4: {
                return new ahaz((ahbh)aowx.a);
            }
            case 3: {
                return new aowx();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowx.a, "\u0001\u0007\u0000\u0001\u0002\u000e\u0007\u0000\u0000\u0000\u0002\u100c\u0000\u0003\u1008\u0001\u0005\u1007\u0002\t\u100c\u0005\f\u100c\b\r\u100c\t\u000e\u1008\n", new Object[] { "c", "d", amwz.a(), "e", "f", "g", ajek.j, "h", aove.l, "i", aove.j, "j" });
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
