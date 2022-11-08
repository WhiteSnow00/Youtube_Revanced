import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amhj extends agzi implements ahax
{
    public static final amhj a;
    private static volatile ahbe j;
    public boolean b;
    public boolean c;
    public boolean d;
    public aiau e;
    public boolean f;
    public agzq g;
    public amof h;
    public anvv i;
    private int k;
    private int l;
    
    static {
        agzi.registerDefaultInstance((Class)amhj.class, (agzi)(a = new amhj()));
    }
    
    private amhj() {
        emptyIntList();
        agzi.emptyProtobufList();
        this.g = emptyIntList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe j;
                if ((j = amhj.j) == null) {
                    synchronized (amhj.class) {
                        if (amhj.j == null) {
                            amhj.j = (ahbe)new agzb((agzi)amhj.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return amhj.a;
            }
            case 4: {
                return new agza((agzi)amhj.a);
            }
            case 3: {
                return new amhj();
            }
            case 2: {
                return newMessageInfo((MessageLite)amhj.a, "\u0001\b\u0000\u0002\r+\b\u0000\u0001\u0000\r\u1007\t\u0019\u1007\u0010\"\u1007\u0019#\u1009\u001a$\u1007\u001b%\u0016&\u1009\u001c+\u1009 ", new Object[] { "k", "l", "b", "c", "d", "e", "f", "g", "h", "i" });
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
