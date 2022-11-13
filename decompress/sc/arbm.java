import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbm extends ahbh implements ahcw
{
    public static final arbm a;
    private static volatile ahdd l;
    public int b;
    public String c;
    public arbj d;
    public String e;
    public arbj f;
    public String g;
    public int h;
    public String i;
    public boolean j;
    public boolean k;
    
    static {
        ahbh.registerDefaultInstance((Class)arbm.class, (ahbh)(a = new arbm()));
    }
    
    private arbm() {
        this.c = "";
        this.e = "";
        this.g = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = arbm.l) == null) {
                    synchronized (arbm.class) {
                        if (arbm.l == null) {
                            arbm.l = (ahdd)new ahba((ahbh)arbm.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return arbm.a;
            }
            case 4: {
                return new ahaz((ahbh)arbm.a);
            }
            case 3: {
                return new arbm();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbm.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0004\u0004\u100c\u0005\u0005\u1008\u0006\u0006\u1007\u0007\u0007\u1008\u0002\b\u1009\u0003\t\u1007\b", new Object[] { "b", "c", "d", "g", "h", arbl.a(), "i", "j", "e", "f", "k" });
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
