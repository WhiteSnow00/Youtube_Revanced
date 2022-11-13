import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alpk extends ahbh implements ahcw
{
    public static final alpk a;
    private static volatile ahdd e;
    public int b;
    public Object c;
    public ahil d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)alpk.class, (ahbh)(a = new alpk()));
    }
    
    private alpk() {
        this.b = 0;
        this.g = 2;
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
                final ahdd e;
                if ((e = alpk.e) == null) {
                    synchronized (alpk.class) {
                        if (alpk.e == null) {
                            alpk.e = (ahdd)new ahba((ahbh)alpk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return alpk.a;
            }
            case 4: {
                return new ahaz((ahbh)alpk.a);
            }
            case 3: {
                return new alpk();
            }
            case 2: {
                return newMessageInfo((MessageLite)alpk.a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u143c\u0000\u0004\u1009\u0003", new Object[] { "c", "b", "f", akdi.class, aotp.class, "d" });
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
