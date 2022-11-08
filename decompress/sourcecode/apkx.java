import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkx extends agzi implements ahax
{
    public static final apkx a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(apkx.class, a = new apkx());
    }
    
    private apkx() {
        this.f = 2;
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
                if ((b2 = apkx.b) == null) {
                    synchronized (apkx.class) {
                        if (apkx.b == null) {
                            apkx.b = (ahbe)new agzb((agzi)apkx.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkx.a;
            }
            case 4: {
                return new agza((agzi)apkx.a);
            }
            case 3: {
                return new apkx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkx.a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003\u1409\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
