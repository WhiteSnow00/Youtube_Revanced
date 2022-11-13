import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigk extends ahbh implements ahcw
{
    public static final aigk a;
    private static volatile ahdd f;
    public int b;
    public aigj c;
    public aixf d;
    public ajmo e;
    private byte g;
    
    static {
        ahbh.registerDefaultInstance((Class)aigk.class, (ahbh)(a = new aigk()));
    }
    
    private aigk() {
        this.g = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd f;
                if ((f = aigk.f) == null) {
                    synchronized (aigk.class) {
                        if (aigk.f == null) {
                            aigk.f = (ahdd)new ahba((ahbh)aigk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aigk.a;
            }
            case 4: {
                return new ahaz((ahbh)aigk.a);
            }
            case 3: {
                return new aigk();
            }
            case 2: {
                return newMessageInfo((MessageLite)aigk.a, "\u0001\u0003\u0000\u0001\uf321\u1e90\uf492\u4933\u0003\u0000\u0000\u0003\uf321\u1e90\u1409\u0001\ueb42\u2621\u1409\u0000\uf492\u4933\u1409\u0003", new Object[] { "b", "d", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
