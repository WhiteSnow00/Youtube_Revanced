import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqrl extends ahbh implements ahcw
{
    public static final aqrl a;
    private static volatile ahdd f;
    public int b;
    public ahcr c;
    public boolean d;
    public long e;
    
    static {
        ahbh.registerDefaultInstance((Class)aqrl.class, (ahbh)(a = new aqrl()));
    }
    
    private aqrl() {
        this.c = ahcr.a;
        this.e = -1L;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aqrl.f) == null) {
                    synchronized (aqrl.class) {
                        if (aqrl.f == null) {
                            aqrl.f = (ahdd)new ahba((ahbh)aqrl.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqrl.a;
            }
            case 4: {
                return new ahaz((float[])null, (short[][])null);
            }
            case 3: {
                return new aqrl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqrl.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\u1007\u0000\u0003\u1002\u0001", new Object[] { "b", "c", aqrk.a, "d", "e" });
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
