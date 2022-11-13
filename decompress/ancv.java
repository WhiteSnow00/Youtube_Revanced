import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ancv extends ahbh implements ahcw
{
    public static final ancv a;
    public static final ahbf b;
    private static volatile ahdd l;
    public int c;
    public ahab d;
    public int e;
    public String f;
    public boolean g;
    public String h;
    public int i;
    public int j;
    public int k;
    
    static {
        final ancv a2 = new ancv();
        ahbh.registerDefaultInstance((Class)ancv.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)amuj.b, (Object)a2, (MessageLite)a2, (ahbm)null, 230806702, ahek.k, (Class)ancv.class);
    }
    
    private ancv() {
        this.d = ahab.b;
        this.f = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = ancv.l) == null) {
                    synchronized (ancv.class) {
                        if (ancv.l == null) {
                            ancv.l = (ahdd)new ahba((ahbh)ancv.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ancv.a;
            }
            case 4: {
                return new ahaz((ahbh)ancv.a);
            }
            case 3: {
                return new ancv();
            }
            case 2: {
                return newMessageInfo((MessageLite)ancv.a, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100c\u0001\u0004\u1008\u0003\u0005\u1007\u0004\u0006\u1008\u0005\u0007\u1004\u0006\t\u100c\b\f\u100c\u000b", new Object[] { "c", "d", "e", amwz.a(), "f", "g", "h", "i", "j", ajek.j, "k", aove.l });
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
