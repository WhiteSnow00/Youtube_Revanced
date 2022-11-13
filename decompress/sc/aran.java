import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aran extends ahbh implements ahcw
{
    public static final aran a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)aran.class, (ahbh)(a = new aran()));
    }
    
    private aran() {
        this.c = "";
        this.d = ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aran.e) == null) {
                    synchronized (aran.class) {
                        if (aran.e == null) {
                            aran.e = (ahdd)new ahba((ahbh)aran.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aran.a;
            }
            case 4: {
                return new ahaz((byte[])null, (float[])null);
            }
            case 3: {
                return new aran();
            }
            case 2: {
                return newMessageInfo((MessageLite)aran.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
