import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpf extends ahbh implements ahcw
{
    public static final akpf a;
    private static volatile ahdd c;
    public aixf b;
    private int d;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)akpf.class, (ahbh)(a = new akpf()));
    }
    
    private akpf() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd c;
                if ((c = akpf.c) == null) {
                    synchronized (akpf.class) {
                        if (akpf.c == null) {
                            akpf.c = (ahdd)new ahba((ahbh)akpf.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return akpf.a;
            }
            case 4: {
                return new ahaz((ahbh)akpf.a);
            }
            case 3: {
                return new akpf();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpf.a, "\u0001\u0001\u0000\u0001\uf321\u1e90\uf321\u1e90\u0001\u0000\u0000\u0001\uf321\u1e90\u1409\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
