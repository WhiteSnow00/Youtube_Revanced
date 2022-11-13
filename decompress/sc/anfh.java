import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anfh extends ahbh implements ahcw
{
    public static final anfh a;
    public static final ahbf b;
    private static volatile ahdd f;
    public int c;
    public String d;
    public int e;
    
    static {
        final anfh a2 = new anfh();
        ahbh.registerDefaultInstance((Class)anfh.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)ajqe.a, (Object)a2, (MessageLite)a2, (ahbm)null, 328, ahek.k, (Class)anfh.class);
    }
    
    private anfh() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = anfh.f) == null) {
                    synchronized (anfh.class) {
                        if (anfh.f == null) {
                            anfh.f = (ahdd)new ahba((ahbh)anfh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anfh.a;
            }
            case 4: {
                return new ahaz((ahbh)anfh.a);
            }
            case 3: {
                return new anfh();
            }
            case 2: {
                return newMessageInfo((MessageLite)anfh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001", new Object[] { "c", "d", "e", anfi.a() });
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
