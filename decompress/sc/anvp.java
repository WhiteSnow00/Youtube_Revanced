import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anvp extends ahbh implements ahcw
{
    public static final anvp a;
    public static final ahbf b;
    private static volatile ahdd e;
    public ahbx c;
    public String d;
    private int f;
    
    static {
        final anvp a2 = new anvp();
        ahbh.registerDefaultInstance((Class)anvp.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajmz.a, (Object)a2, (MessageLite)a2, (ahbm)null, 328964737, ahek.k, (Class)anvp.class);
    }
    
    private anvp() {
        this.c = emptyProtobufList();
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = anvp.e) == null) {
                    synchronized (anvp.class) {
                        if (anvp.e == null) {
                            anvp.e = (ahdd)new ahba((ahbh)anvp.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return anvp.a;
            }
            case 4: {
                return new ahaz((ahbh)anvp.a);
            }
            case 3: {
                return new anvp();
            }
            case 2: {
                return newMessageInfo((MessageLite)anvp.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000", new Object[] { "f", "c", anvo.class, "d" });
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
