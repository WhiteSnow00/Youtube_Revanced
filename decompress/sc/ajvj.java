import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvj extends ahbh implements ahcw
{
    public static final ajvj a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public ahbx d;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvj.class, (ahbh)(a = new ajvj()));
    }
    
    private ajvj() {
        this.c = "";
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajvj.e) == null) {
                    synchronized (ajvj.class) {
                        if (ajvj.e == null) {
                            ajvj.e = (ahdd)new ahba((ahbh)ajvj.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajvj.a;
            }
            case 4: {
                return new ahaz((byte[][][])null, (int[][])null);
            }
            case 3: {
                return new ajvj();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvj.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", ajve.class });
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
