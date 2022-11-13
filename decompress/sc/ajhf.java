import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajhf extends ahbh implements ahcw
{
    public static final ajhf a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public int i;
    
    static {
        final ajhf a2 = new ajhf();
        ahbh.registerDefaultInstance((Class)ajhf.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 224, ahek.k, (Class)ajhf.class);
    }
    
    private ajhf() {
        this.d = "";
        this.e = "";
        this.g = "";
        this.h = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = ajhf.j) == null) {
                    synchronized (ajhf.class) {
                        if (ajhf.j == null) {
                            ajhf.j = (ahdd)new ahba((ahbh)ajhf.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajhf.a;
            }
            case 4: {
                return new ahaz((ahbh)ajhf.a);
            }
            case 3: {
                return new ajhf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajhf.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1004\u0005", new Object[] { "c", "d", "e", "f", "g", "h", "i" });
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
