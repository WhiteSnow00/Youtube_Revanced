import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidm extends ahbh implements ahcw
{
    public static final aidm a;
    private static volatile ahdd d;
    public int b;
    public aidl c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aidm.class, (ahbh)(a = new aidm()));
    }
    
    private aidm() {
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
                final ahdd d;
                if ((d = aidm.d) == null) {
                    synchronized (aidm.class) {
                        if (aidm.d == null) {
                            aidm.d = (ahdd)new ahba((ahbh)aidm.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidm.a;
            }
            case 4: {
                return new ahaz((ahbh)aidm.a);
            }
            case 3: {
                return new aidm();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidm.a, "\u0001\u0001\u0000\u0001\uf1ff\u450b\uf1ff\u450b\u0001\u0000\u0000\u0001\uf1ff\u450b\u1409\u0000", new Object[] { "b", "c" });
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