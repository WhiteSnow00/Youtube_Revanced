import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajao extends ahbh implements ahcw
{
    public static final ajao a;
    private static volatile ahdd e;
    public ahbx b;
    public boolean c;
    public long d;
    private int f;
    
    static {
        ahbh.registerDefaultInstance((Class)ajao.class, (ahbh)(a = new ajao()));
    }
    
    private ajao() {
        this.b = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = ajao.e) == null) {
                    synchronized (ajao.class) {
                        if (ajao.e == null) {
                            ajao.e = (ahdd)new ahba((ahbh)ajao.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajao.a;
            }
            case 4: {
                return new ahaz((ahbh)ajao.a);
            }
            case 3: {
                return new ajao();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajao.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u1007\u0000\u0003\u1002\u0001", new Object[] { "f", "b", ajan.class, "c", "d" });
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
