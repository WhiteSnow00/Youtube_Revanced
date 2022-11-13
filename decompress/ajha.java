import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajha extends ahbh implements ahcw
{
    public static final ajha a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    private byte f;
    
    static {
        final ajha a2 = new ajha();
        ahbh.registerDefaultInstance((Class)ajha.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)aqfg.a, (Object)a2, (MessageLite)a2, (ahbm)null, 378918909, ahek.k, (Class)ajha.class);
    }
    
    private ajha() {
        this.f = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajha.e) == null) {
                    synchronized (ajha.class) {
                        if (ajha.e == null) {
                            ajha.e = (ahdd)new ahba((ahbh)ajha.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajha.a;
            }
            case 4: {
                return new ahaz((ahbh)ajha.a);
            }
            case 3: {
                return new ajha();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajha.a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u1008\u0002", new Object[] { "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
