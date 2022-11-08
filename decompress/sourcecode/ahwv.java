import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahwv extends agzi implements ahax
{
    public static final ahwv a;
    private static volatile ahbe c;
    public int b;
    private Object d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ahwv.class, a = new ahwv());
    }
    
    private ahwv() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ahwv.c) == null) {
                    synchronized (ahwv.class) {
                        if (ahwv.c == null) {
                            ahwv.c = (ahbe)new agzb((agzi)ahwv.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ahwv.a;
            }
            case 4: {
                return new agza((agzi)ahwv.a);
            }
            case 3: {
                return new ahwv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahwv.a, "\u0001\u0003\u0001\u0000\ued3b\u408e\uf7f0\ub0a8\u0003\u0000\u0000\u0002\ued3b\u408e\u103c\u0000\ue469\u447a\u143c\u0000\uf7f0\ub0a8\u143c\u0000", new Object[] { "d", "b", ahwu.class, ahww.class, ahwx.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
