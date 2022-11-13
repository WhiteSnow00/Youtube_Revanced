import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aktk extends ahbh implements ahcw
{
    public static final aktk a;
    private static volatile ahdd i;
    public int b;
    public int c;
    public Object d;
    public long e;
    public boolean f;
    public int g;
    public int h;
    
    static {
        ahbh.registerDefaultInstance((Class)aktk.class, (ahbh)(a = new aktk()));
    }
    
    private aktk() {
        this.c = 0;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aktk.i) == null) {
                    synchronized (aktk.class) {
                        if (aktk.i == null) {
                            aktk.i = (ahdd)new ahba((ahbh)aktk.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aktk.a;
            }
            case 4: {
                return new ahaz((ahbh)aktk.a);
            }
            case 3: {
                return new aktk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aktk.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u103d\u0000\u0002\u103b\u0000\u0003\u103b\u0000\u0004\u1002\u0004\u0005\u1007\u0005\u0006\u100c\u0006\u0007\u100c\u0007\b\u103b\u0000", new Object[] { "d", "c", "b", "e", "f", "g", akwi.t, "h", akwi.s });
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
