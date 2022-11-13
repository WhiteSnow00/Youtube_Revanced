import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqcu extends ahbh implements ahcw
{
    public static final aqcu a;
    private static volatile ahdd f;
    public String b;
    public String c;
    public int d;
    public ahbx e;
    private int g;
    
    static {
        ahbh.registerDefaultInstance((Class)aqcu.class, (ahbh)(a = new aqcu()));
    }
    
    private aqcu() {
        this.b = "";
        this.c = "";
        this.e = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqcu.f) == null) {
                    synchronized (aqcu.class) {
                        if (aqcu.f == null) {
                            aqcu.f = (ahdd)new ahba((ahbh)aqcu.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqcu.a;
            }
            case 4: {
                return new ahaz((ahbh)aqcu.a);
            }
            case 3: {
                return new aqcu();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqcu.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002\u0004\u001a", new Object[] { "g", "b", "c", "d", aqcl.c, "e" });
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
