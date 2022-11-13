import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class albk extends ahbh implements ahcw
{
    public static final albk a;
    private static volatile ahdd e;
    public akli b;
    public ahbx c;
    public String d;
    private int f;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)albk.class, (ahbh)(a = new albk()));
    }
    
    private albk() {
        this.g = 2;
        this.c = emptyProtobufList();
        this.d = "";
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
                if ((e = albk.e) == null) {
                    synchronized (albk.class) {
                        if (albk.e == null) {
                            albk.e = (ahdd)new ahba((ahbh)albk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return albk.a;
            }
            case 4: {
                return new ahaz((ahbh)albk.a);
            }
            case 3: {
                return new albk();
            }
            case 2: {
                return newMessageInfo((MessageLite)albk.a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0002\u0001\u1409\u0000\u0005\u041b\u0006\u1008\u0004", new Object[] { "f", "b", "c", aiqj.class, "d" });
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
