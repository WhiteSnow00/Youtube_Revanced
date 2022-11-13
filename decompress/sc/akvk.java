import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akvk extends ahbh implements ahcw
{
    public static final akvk a;
    private static volatile ahdd g;
    public String b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    private int h;
    private ajut i;
    private byte j;
    
    static {
        ahbh.registerDefaultInstance((Class)akvk.class, (ahbh)(a = new akvk()));
    }
    
    private akvk() {
        this.j = 2;
        this.b = "";
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
                final ahdd g;
                if ((g = akvk.g) == null) {
                    synchronized (akvk.class) {
                        if (akvk.g == null) {
                            akvk.g = (ahdd)new ahba((ahbh)akvk.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akvk.a;
            }
            case 4: {
                return new ahaz((ahbh)akvk.a);
            }
            case 3: {
                return new akvk();
            }
            case 2: {
                return newMessageInfo((MessageLite)akvk.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1409\u0002\u0004\u100b\u0003\u0005\u1007\u0004\u0006\u1007\u0005", new Object[] { "h", "b", "c", "i", "d", "e", "f" });
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
