import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aklp extends ahbh implements ahcw
{
    public static final aklp a;
    private static volatile ahdd l;
    public int b;
    public aklg c;
    public boolean d;
    public int e;
    public aklm f;
    public akln g;
    public aklw h;
    public aklx i;
    public alsl j;
    public alsm k;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)aklp.class, (ahbh)(a = new aklp()));
    }
    
    private aklp() {
        this.m = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd l;
                if ((l = aklp.l) == null) {
                    synchronized (aklp.class) {
                        if (aklp.l == null) {
                            aklp.l = (ahdd)new ahba((ahbh)aklp.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aklp.a;
            }
            case 4: {
                return new ahaz((ahbh)aklp.a);
            }
            case 3: {
                return new aklp();
            }
            case 2: {
                return newMessageInfo((MessageLite)aklp.a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0002\u0003\u1009\u0004\u0004\u1009\u0006\u0006\u1007\u0001\u0007\u1009\u0005\b\u1009\u0007\u000b\u1009\b\f\u1009\t", new Object[] { "b", "c", "e", akjo.l, "f", "h", "d", "g", "i", "j", "k" });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
