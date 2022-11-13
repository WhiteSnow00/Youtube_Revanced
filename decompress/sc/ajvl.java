import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvl extends ahbh implements ahcw
{
    public static final ajvl a;
    private static volatile ahdd i;
    public int b;
    public anuv c;
    public String d;
    public boolean e;
    public aiqj f;
    public aiqj g;
    public aiqj h;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajvl.class, (ahbh)(a = new ajvl()));
    }
    
    private ajvl() {
        this.j = 2;
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = ajvl.i) == null) {
                    synchronized (ajvl.class) {
                        if (ajvl.i == null) {
                            ajvl.i = (ahdd)new ahba((ahbh)ajvl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajvl.a;
            }
            case 4: {
                return new ahaz((ahbh)ajvl.a);
            }
            case 3: {
                return new ajvl();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajvl.a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1007\u0002\u0005\u1409\u0003\u0006\u1409\u0004\u0007\u1409\u0005", new Object[] { "b", "c", "d", "e", "f", "g", "h" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
