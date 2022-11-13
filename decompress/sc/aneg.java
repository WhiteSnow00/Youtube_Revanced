import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aneg extends ahbh implements ahcw
{
    public static final aneg a;
    private static volatile ahdd d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahbh.registerDefaultInstance((Class)aneg.class, (ahbh)(a = new aneg()));
    }
    
    private aneg() {
        this.b = 0;
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
                if ((d = aneg.d) == null) {
                    synchronized (aneg.class) {
                        if (aneg.d == null) {
                            aneg.d = (ahdd)new ahba((ahbh)aneg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aneg.a;
            }
            case 4: {
                return new ahaz((ahbh)aneg.a);
            }
            case 3: {
                return new aneg();
            }
            case 2: {
                return newMessageInfo((MessageLite)aneg.a, "\u0001\u0006\u0001\u0000\uf549\u1a78\ue79e\uac6b\u0006\u0000\u0000\u0006\uf549\u1a78\u143c\u0000\ufc1b\u1efe\u143c\u0000\ufc81\u3692\u143c\u0000\uf492\u4933\u143c\u0000\uf7ce\u4a70\u143c\u0000\ue79e\uac6b\u143c\u0000", new Object[] { "c", "b", aiwn.class, ahux.class, aods.class, ajmo.class, amlb.class, aibo.class });
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
