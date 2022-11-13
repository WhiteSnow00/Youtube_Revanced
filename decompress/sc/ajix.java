import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajix extends ahbh implements ahcw
{
    public static final ajix a;
    public static final ahbf b;
    private static volatile ahdd j;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public ahbp i;
    private aqib k;
    private aqib l;
    private byte m;
    
    static {
        final ajix a2 = new ajix();
        ahbh.registerDefaultInstance((Class)ajix.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 373468381, ahek.k, (Class)ajix.class);
    }
    
    private ajix() {
        this.m = 2;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = emptyIntList();
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
                final ahdd j;
                if ((j = ajix.j) == null) {
                    synchronized (ajix.class) {
                        if (ajix.j == null) {
                            ajix.j = (ahdd)new ahba((ahbh)ajix.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajix.a;
            }
            case 4: {
                return new ahaz((float[][])null, (int[][])null);
            }
            case 3: {
                return new ajix();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajix.a, "\u0001\b\u0000\u0001\u0003\u000b\b\u0000\u0001\u0002\u0003\u1008\u0003\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u1008\u0006\u0007\u1008\u0007\b\u1008\b\n\u1008\t\u000b\u0016", new Object[] { "c", "d", "k", "l", "e", "f", "g", "h", "i" });
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
