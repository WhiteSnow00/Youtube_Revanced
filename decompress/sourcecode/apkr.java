import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkr extends agzi implements ahax
{
    public static final apkr a;
    private static volatile ahbe b;
    private int c;
    private aicq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apkr.class, a = new apkr());
    }
    
    private apkr() {
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
                final ahbe b2;
                if ((b2 = apkr.b) == null) {
                    synchronized (apkr.class) {
                        if (apkr.b == null) {
                            apkr.b = (ahbe)new agzb((agzi)apkr.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkr.a;
            }
            case 4: {
                return new agza((agzi)apkr.a);
            }
            case 3: {
                return new apkr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkr.a, "\u0001\u0001\u0000\u0001\uf151\u208b\uf151\u208b\u0001\u0000\u0000\u0001\uf151\u208b\u1409\u0000", new Object[] { "c", "d" });
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
