import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajiu extends ahbh implements ahcw
{
    public static final ajiu a;
    public static final ahbf b;
    private static volatile ahdd k;
    public int c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;
    public String j;
    private byte l;
    
    static {
        final ajiu a2 = new ajiu();
        ahbh.registerDefaultInstance((Class)ajiu.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 372486289, ahek.k, (Class)ajiu.class);
    }
    
    private ajiu() {
        this.l = 2;
        this.d = "";
        this.f = "";
        this.g = "";
        this.j = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd k;
                if ((k = ajiu.k) == null) {
                    synchronized (ajiu.class) {
                        if (ajiu.k == null) {
                            ajiu.k = (ahdd)new ahba((ahbh)ajiu.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return ajiu.a;
            }
            case 4: {
                return new ahaz((ahbh)ajiu.a);
            }
            case 3: {
                return new ajiu();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajiu.a, "\u0001\u0007\u0000\u0001\u0003\r\u0007\u0000\u0000\u0000\u0003\u1008\u0002\u0006\u1007\u0005\u0007\u1008\u0006\b\u1008\u0007\n\u1007\t\u000b\u1008\u000b\r\u1007\n", new Object[] { "c", "d", "e", "f", "g", "h", "j", "i" });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
