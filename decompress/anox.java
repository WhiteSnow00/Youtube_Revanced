import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anox extends ahbh implements ahcw
{
    public static final anox a;
    private static volatile ahdd k;
    public int b;
    public anov c;
    public anow d;
    public ahbx e;
    public ahmo f;
    public ahab g;
    public String h;
    public boolean i;
    public boolean j;
    private ahhu l;
    private byte m;
    
    static {
        ahbh.registerDefaultInstance((Class)anox.class, (ahbh)(a = new anox()));
    }
    
    private anox() {
        this.m = 2;
        this.e = emptyProtobufList();
        this.g = ahab.b;
        this.h = "";
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
                final ahdd k;
                if ((k = anox.k) == null) {
                    synchronized (anox.class) {
                        if (anox.k == null) {
                            anox.k = (ahdd)new ahba((ahbh)anox.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return anox.a;
            }
            case 4: {
                return new ahaz((ahbh)anox.a);
            }
            case 3: {
                return new anox();
            }
            case 2: {
                return newMessageInfo((MessageLite)anox.a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u001b\u0004\u1409\u0002\u0005\u1409\u0003\u0006\u100a\u0004\u0007\u1008\u0005\b\u1007\u0006\t\u1007\u0007", new Object[] { "b", "c", "d", "e", anpk.class, "f", "l", "g", "h", "i", "j" });
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
