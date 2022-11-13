import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgx extends ahbh implements ahcw
{
    public static final ajgx a;
    private static volatile ahdd f;
    public int b;
    public ahbx c;
    public ahbx d;
    public int e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajgx.class, (ahbh)(a = new ajgx()));
    }
    
    private ajgx() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = ajgx.f) == null) {
                    synchronized (ajgx.class) {
                        if (ajgx.f == null) {
                            ajgx.f = (ahdd)new ahba((ahbh)ajgx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajgx.a;
            }
            case 4: {
                return new ahaz((float[][][])null, (byte[][])null);
            }
            case 3: {
                return new ajgx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001\u041b\u0002\u041b\u0003\u100c\u0000", new Object[] { "b", "c", aotp.class, "d", aotp.class, "e", apza.a() });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
