import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjs extends ahbh implements ahcw
{
    public static final aqjs a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqjs.class, (ahbh)(a = new aqjs()));
    }
    
    private aqjs() {
        this.e = 2;
        this.b = ahbh.emptyProtobufList();
        this.c = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqjs.d) == null) {
                    synchronized (aqjs.class) {
                        if (aqjs.d == null) {
                            aqjs.d = (ahdd)new ahba((ahbh)aqjs.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqjs.a;
            }
            case 4: {
                return new ahaz((float[][][])null, (boolean[])null);
            }
            case 3: {
                return new aqjs();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqjs.a, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0001\u0002\u001a\u0003\u041b", new Object[] { "b", "c", annw.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
