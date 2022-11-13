import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpf extends ahbh implements ahcw
{
    public static final agpf a;
    private static volatile ahdd g;
    public int b;
    public Object c;
    public String d;
    public String e;
    public String f;
    private int h;
    
    static {
        ahbh.registerDefaultInstance((Class)agpf.class, (ahbh)(a = new agpf()));
    }
    
    private agpf() {
        this.b = 0;
        this.d = "";
        this.e = "";
        this.f = "";
        ahbh.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = agpf.g) == null) {
                    synchronized (agpf.class) {
                        if (agpf.g == null) {
                            agpf.g = (ahdd)new ahba((ahbh)agpf.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return agpf.a;
            }
            case 4: {
                return new ahaz((ahbh)agpf.a);
            }
            case 3: {
                return new agpf();
            }
            case 2: {
                return newMessageInfo((MessageLite)agpf.a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u103b\u0000\u0004\u1008\u0004\u0006\u103c\u0000", new Object[] { "c", "b", "h", "d", "e", "f", agpe.class });
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
