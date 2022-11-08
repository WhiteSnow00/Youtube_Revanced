import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkn extends agzi implements ahax
{
    public static final apkn a;
    private static volatile ahbe b;
    private int c;
    private apko d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apkn.class, a = new apkn());
    }
    
    private apkn() {
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
                if ((b2 = apkn.b) == null) {
                    synchronized (apkn.class) {
                        if (apkn.b == null) {
                            apkn.b = (ahbe)new agzb((agzi)apkn.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkn.a;
            }
            case 4: {
                return new agza((agzi)apkn.a);
            }
            case 3: {
                return new apkn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkn.a, "\u0001\u0001\u0000\u0001\ufe93\u2d74\ufe93\u2d74\u0001\u0000\u0000\u0001\ufe93\u2d74\u1409\u0000", new Object[] { "c", "d" });
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
