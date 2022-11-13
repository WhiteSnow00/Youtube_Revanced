import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowg extends ahbh implements ahcw
{
    public static final aowg a;
    private static volatile ahdd h;
    public int b;
    public String c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    
    static {
        ahbh.registerDefaultInstance((Class)aowg.class, (ahbh)(a = new aowg()));
    }
    
    private aowg() {
        this.c = "";
        this.d = true;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = aowg.h) == null) {
                    synchronized (aowg.class) {
                        if (aowg.h == null) {
                            aowg.h = (ahdd)new ahba((ahbh)aowg.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aowg.a;
            }
            case 4: {
                return new ahaz((ahbh)aowg.a);
            }
            case 3: {
                return new aowg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aowg.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1007\u0003\u0005\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", aovz.a() });
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
