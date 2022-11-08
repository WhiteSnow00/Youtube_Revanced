import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkv extends agzi implements ahax
{
    public static final apkv a;
    private static volatile ahbe b;
    private int c;
    private amfs d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apkv.class, a = new apkv());
    }
    
    private apkv() {
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
                if ((b2 = apkv.b) == null) {
                    synchronized (apkv.class) {
                        if (apkv.b == null) {
                            apkv.b = (ahbe)new agzb((agzi)apkv.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return apkv.a;
            }
            case 4: {
                return new agza((agzi)apkv.a);
            }
            case 3: {
                return new apkv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkv.a, "\u0001\u0001\u0000\u0001\ue5b3\u21fc\ue5b3\u21fc\u0001\u0000\u0000\u0001\ue5b3\u21fc\u1409\u0000", new Object[] { "c", "d" });
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
