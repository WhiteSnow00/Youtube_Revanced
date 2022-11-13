import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afqu extends ahbh implements ahcw
{
    private static final afqu a;
    private static volatile ahdd b;
    private int c;
    private ahbx d;
    private String e;
    private afql f;
    
    static {
        ahbh.registerDefaultInstance((Class)afqu.class, (ahbh)(a = new afqu()));
    }
    
    private afqu() {
        this.d = emptyProtobufList();
        this.e = "";
    }
    
    public static afqj a() {
        return (afqj)afqu.a.createBuilder();
    }
    
    static afqu b() {
        return afqu.a;
    }
    
    public static afqu c(final byte[] array) {
        return (afqu)ahbh.parseFrom((ahbh)afqu.a, array);
    }
    
    public static void d(final afqu afqu, final afql afql) {
        afqu.e(afql);
    }
    
    private void e(final afql f) {
        f.getClass();
        this.f = f;
        this.c |= 0x1000000;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd b;
                if ((b = afqu.b) == null) {
                    synchronized (afqu.class) {
                        if (afqu.b == null) {
                            afqu.b = (ahdd)new ahba((ahbh)afqu.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return afqu.a;
            }
            case 4: {
                return new afqj();
            }
            case 3: {
                return new afqu();
            }
            case 2: {
                return newMessageInfo((MessageLite)afqu.a, "\u0001\u0001\u0000\u0001\u0019\u0019\u0001\u0000\u0000\u0000\u0019\u1009\u0018", new Object[] { "c", "f" });
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
