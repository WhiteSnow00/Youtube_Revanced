import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjf extends ahbh implements ahcw
{
    public static final ajjf a;
    public static final ahbf b;
    private static volatile ahdd s;
    public int c;
    public String d;
    public aotp e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;
    public int o;
    public String p;
    public String q;
    public ahbx r;
    private byte t;
    
    static {
        final ajjf a2 = new ajjf();
        ahbh.registerDefaultInstance((Class)ajjf.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 173, ahek.k, (Class)ajjf.class);
    }
    
    private ajjf() {
        this.t = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.i = "";
        this.j = "";
        this.l = "";
        this.p = "";
        this.q = "";
        this.r = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd s;
                if ((s = ajjf.s) == null) {
                    synchronized (ajjf.class) {
                        if (ajjf.s == null) {
                            ajjf.s = (ahdd)new ahba((ahbh)ajjf.a);
                        }
                    }
                }
                return s;
            }
            case 5: {
                return ajjf.a;
            }
            case 4: {
                return new ahaz((int[][])null, (boolean[][])null);
            }
            case 3: {
                return new ajjf();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjf.a, "\u0001\u000f\u0000\u0001\u0001\u0011\u000f\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1004\u0004\u0006\u1008\u0006\u0007\u1004\u0007\b\u1008\b\t\u1007\t\n\u1007\n\u000b\u1004\u000b\r\u1008\f\u000e\u1008\u0005\u000f\u1008\r\u0011\u001b", new Object[] { "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "i", "q", "r", aiab.class });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
