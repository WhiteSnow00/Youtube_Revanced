import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajxx extends ahbh implements ahcw
{
    public static final ajxx a;
    private static volatile ahdd f;
    public int b;
    public akse c;
    public String d;
    public aiqj e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)ajxx.class, (ahbh)(a = new ajxx()));
    }
    
    private ajxx() {
        this.g = 2;
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
                final ahdd f;
                if ((f = ajxx.f) == null) {
                    synchronized (ajxx.class) {
                        if (ajxx.f == null) {
                            ajxx.f = (ahdd)new ahba((ahbh)ajxx.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ajxx.a;
            }
            case 4: {
                return new ahaz((ahbh)ajxx.a);
            }
            case 3: {
                return new ajxx();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajxx.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
