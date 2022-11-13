import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akwe extends ahbh implements ahcw
{
    public static final akwe a;
    private static volatile ahdd g;
    public int b;
    public aklg c;
    public ahbx d;
    public String e;
    public boolean f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akwe.class, (ahbh)(a = new akwe()));
    }
    
    private akwe() {
        this.h = 2;
        this.d = emptyProtobufList();
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akwe.g) == null) {
                    synchronized (akwe.class) {
                        if (akwe.g == null) {
                            akwe.g = (ahdd)new ahba((ahbh)akwe.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akwe.a;
            }
            case 4: {
                return new ahaz((byte[][][])null, (boolean[][])null);
            }
            case 3: {
                return new akwe();
            }
            case 2: {
                return newMessageInfo((MessageLite)akwe.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001\u1409\u0000\u0002\u001b\u0003\u1008\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", akwl.class, "e", "f" });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
