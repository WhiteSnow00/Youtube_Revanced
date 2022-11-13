import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajil extends ahbh implements ahcw
{
    public static final ajil a;
    public static final ahbf b;
    private static volatile ahdd l;
    public int c;
    public String d;
    public ajij e;
    public aqfl f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    private byte m;
    
    static {
        final ajil a2 = new ajil();
        ahbh.registerDefaultInstance((Class)ajil.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 429403481, ahek.k, (Class)ajil.class);
    }
    
    private ajil() {
        this.m = 2;
        this.d = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
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
                if ((l = ajil.l) == null) {
                    synchronized (ajil.class) {
                        if (ajil.l == null) {
                            ajil.l = (ahdd)new ahba((ahbh)ajil.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ajil.a;
            }
            case 4: {
                return new ahaz((ahbh)ajil.a);
            }
            case 3: {
                return new ajil();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajil.a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0001\u0001\u1008\u0000\u0005\u1409\u0005\n\u1008\b\f\u1008\n\r\u1008\u000b\u000e\u1008\f\u000f\u1008\r\u0010\u1009\u0004", new Object[] { "c", "d", "f", "g", "h", "i", "j", "k", "e" });
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
