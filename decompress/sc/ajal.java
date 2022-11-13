import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajal extends ahbh implements ahcw
{
    public static final ajal a;
    private static volatile ahdd h;
    public ajut b;
    public String c;
    public anuv d;
    public int e;
    public anuv f;
    public anuv g;
    private int i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)ajal.class, (ahbh)(a = new ajal()));
    }
    
    private ajal() {
        this.j = 2;
        this.c = "";
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
                final ahdd h;
                if ((h = ajal.h) == null) {
                    synchronized (ajal.class) {
                        if (ajal.h == null) {
                            ajal.h = (ahdd)new ahba((ahbh)ajal.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajal.a;
            }
            case 4: {
                return new ahaz((ahbh)ajal.a);
            }
            case 3: {
                return new ajal();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajal.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0004\u0005\u1409\u0005\u0006\u100c\u0003", new Object[] { "i", "b", "c", "d", "f", "g", "e", anic.m });
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
