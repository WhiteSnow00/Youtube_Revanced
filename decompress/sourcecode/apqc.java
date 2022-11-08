import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apqc extends agzi implements ahax
{
    public static final apqc a;
    private static volatile ahbe b;
    private int c;
    private apqb d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)apqc.class, (agzi)(a = new apqc()));
    }
    
    private apqc() {
        this.e = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = apqc.b) == null) {
                    synchronized (apqc.class) {
                        if (apqc.b == null) {
                            apqc.b = (ahbe)new agzb((agzi)apqc.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apqc.a;
            }
            case 4: {
                return new agza((agzi)apqc.a);
            }
            case 3: {
                return new apqc();
            }
            case 2: {
                return newMessageInfo((MessageLite)apqc.a, "\u0001\u0001\u0000\u0001\uf9ad\u4129\uf9ad\u4129\u0001\u0000\u0000\u0001\uf9ad\u4129\u1409\u0000", new Object[] { "c", "d" });
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
