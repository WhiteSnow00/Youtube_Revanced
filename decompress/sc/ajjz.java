import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjz extends ahbh implements ahcw
{
    public static final ajjz a;
    private static volatile ahdd m;
    public int b;
    public String c;
    public long d;
    public long e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public ahbp j;
    public ahab k;
    public int l;
    
    static {
        ahbh.registerDefaultInstance((Class)ajjz.class, (ahbh)(a = new ajjz()));
    }
    
    private ajjz() {
        this.c = "";
        this.g = "";
        this.h = "";
        final ahab b = ahab.b;
        this.i = "";
        this.j = emptyIntList();
        this.k = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd m;
                if ((m = ajjz.m) == null) {
                    synchronized (ajjz.class) {
                        if (ajjz.m == null) {
                            ajjz.m = (ahdd)new ahba((ahbh)ajjz.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return ajjz.a;
            }
            case 4: {
                return new ahaz((float[])null, (byte[][][])null);
            }
            case 3: {
                return new ajjz();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjz.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1008\u0005\b\u1008\u0007\t\u0016\n\u100a\b\u000b\u1004\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" });
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
