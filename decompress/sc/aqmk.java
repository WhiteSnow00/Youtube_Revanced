import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqmk extends ahbh implements ahcw
{
    private static final aqmk a;
    private static volatile ahdd b;
    private int c;
    private aqmf d;
    private aqlj e;
    private byte f;
    
    static {
        ahbh.registerDefaultInstance((Class)aqmk.class, (ahbh)(a = new aqmk()));
    }
    
    private aqmk() {
        this.f = 2;
    }
    
    public static aqmj a() {
        return (aqmj)aqmk.a.createBuilder();
    }
    
    static aqmk b() {
        return aqmk.a;
    }
    
    public static void c(final aqmk aqmk, final aqmf aqmf) {
        aqmk.e(aqmf);
    }
    
    public static void d(final aqmk aqmk, final aqlj aqlj) {
        aqmk.f(aqlj);
    }
    
    private void e(final aqmf d) {
        this.d = d;
        this.c |= 0x1;
    }
    
    private void f(final aqlj e) {
        this.e = e;
        this.c |= 0x2;
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
                final ahdd b;
                if ((b = aqmk.b) == null) {
                    synchronized (aqmk.class) {
                        if (aqmk.b == null) {
                            aqmk.b = (ahdd)new ahba((ahbh)aqmk.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aqmk.a;
            }
            case 4: {
                return new aqmj();
            }
            case 3: {
                return new aqmk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqmk.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1009\u0000\u0002\u1409\u0001", new Object[] { "c", "d", "e" });
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
