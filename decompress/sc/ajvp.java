import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvp extends ahbh implements ahcw
{
    public static final ajvp a;
    private static volatile ahdd g;
    public int b;
    public int c;
    public Object d;
    public anuv e;
    public ahbx f;
    private ahhu h;
    private byte i;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvp.class, (ahbh)(a = new ajvp()));
    }
    
    private ajvp() {
        this.c = 0;
        this.i = 2;
        this.f = emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = ajvp.g) == null) {
                    synchronized (ajvp.class) {
                        if (ajvp.g == null) {
                            ajvp.g = (ahdd)new ahba((ahbh)ajvp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajvp.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvp.a);
            }
            case 3: {
                return new ajvp();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvp.a, "\u0001\u0006\u0001\u0001\u0001\u000e\u0006\u0000\u0001\u0006\u0001\u1409\u0000\u0002\u143c\u0000\t\u041b\n\u1409\n\r\u143c\u0000\u000e\u143c\u0000", new Object[] { "d", "c", "b", "e", aiqj.class, "f", aiqj.class, "h", aiqj.class, anuv.class });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
