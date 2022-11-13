import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class appk extends ahbc implements ahbd
{
    public static final appk a;
    private static volatile ahdd e;
    public int b;
    public String c;
    public int d;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)appk.class, (ahbh)(a = new appk()));
    }
    
    private appk() {
        this.f = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = appk.e) == null) {
                    synchronized (appk.class) {
                        if (appk.e == null) {
                            appk.e = (ahdd)new ahba((ahbh)appk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return appk.a;
            }
            case 4: {
                return new ahbb((ahbc)appk.a);
            }
            case 3: {
                return new appk();
            }
            case 2: {
                return newMessageInfo((MessageLite)appk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
