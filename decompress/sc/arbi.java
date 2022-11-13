import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class arbi extends ahbh implements ahcw
{
    public static final arbi a;
    private static volatile ahdd d;
    public ahbx b;
    public ahbx c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)arbi.class, (ahbh)(a = new arbi()));
    }
    
    private arbi() {
        this.e = 2;
        this.b = emptyProtobufList();
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
                if ((d = arbi.d) == null) {
                    synchronized (arbi.class) {
                        if (arbi.d == null) {
                            arbi.d = (ahdd)new ahba((ahbh)arbi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return arbi.a;
            }
            case 4: {
                return new ahaz((char[][])null, (int[][])null);
            }
            case 3: {
                return new arbi();
            }
            case 2: {
                return newMessageInfo((MessageLite)arbi.a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002\u041b", new Object[] { "b", arbk.class, "c", arbc.class });
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
